import java.util.ArrayList;
import java.util.List;

public class Policy {
    
    private String name;
    private ArrayList<String> clauses;

    /**
     * Constructor to create a new Policy class object
     * 
     * @param name | String | the name of the policy
     * @param clauses | ArrayList<String> | clauses to be part of the policy
     */
    public Policy(String name, ArrayList<String> clauses) {
        this.name = name;
        this.clauses = clauses;
    }


    // ### ACCESSORS ###

    /**
     * Public name accessor
     * 
     * @return String | name of the policy
     */
    public String getName() {
        return this.name;
    }

    /**
     * Public clauses accessor (all clauses)
     * 
     * @return ArrayList<String> | policy clauses
     */
    public ArrayList<String> getClauses() {
        return this.clauses;
    }

    /**
     * Public unit clause accessor (singular clause)
     * 
     * @param index | int | index of the desired clause
     * @return Clause | clause at the given index
     */
    public String getClause(int index) {
        return this.clauses.get(index);
    }


    // ### MODIFIERS ###

    /**
     * Update this policy
     * AmendmentType.UPDATE expected due to method overloading and otherwise redundant arguments
     * 
     * @param amend | AmendmentType | type of amendment to be made (AmendmentType.UPDATE expected)
     * @param amdenment | String | clause to be changed to (AmendmentType.UPDATE and AmendmentType.ADD only)
     * @param clause | int | index of the clause to be updated (AmendmentType.UPDATE and AmendmentType.REMOVE only)
     * @return boolean | boolean indicator of the success of the method
     */
    public boolean Amend(AmendmentType amend, String amendment, int clause) {

        try {
            if (amend == AmendmentType.UPDATE && clause <= this.clauses.size() - 1) { // Update the clause if the amendment type is UPDATE and the clause index is within the range of the clauses list
                this.clauses.set(clause, amendment);
            } else if (clause > this.clauses.size() - 1) { // Throw IndexOutOfBoundsException if the clause index is out of range of the clauses list
                throw new IndexOutOfBoundsException("Desired clause index is not in bounds of this policy's clauses.");
            } else { // Throw IllegalArgumentException if the amendment type is not UPDATE
                throw new IllegalArgumentException("Amendment type \"" + amend + "\" not supported in this overload method. Expected AmendmentType.UPDATE.");
            }
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            return false;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    /**
     * Update this policy
     * AmendmentType.ADD expected due to method overloading and otherwise redundant arguments
     * 
     * @param amend | AmendmentType | type of amendment to be made (AmendmentType.ADD expected) 
     * @param amendment | String | new clause to be added (AmendmentType.ADD and AmendmentType.UPDATE only)
     * @return boolean | boolean indicator of the success of the method
     */
    public boolean Amend(AmendmentType amend, String amendment) {

        try {
            if (amend == AmendmentType.ADD) {
                this.clauses.add(amendment);
            } else {
                throw new IllegalArgumentException("Amendment type \"" + amend + "\" not supported in this overload method. Expected AmendmentType.ADD.");
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    /**
     * Update this policy
     * AmendmentType.REMOVE expected due to method overloading and otherwise redundant arguments
     * 
     * @param amend | AmendmentType | type of amendment to be made (AmendmentType.REMOVE expected)
     * @param clause | int | index of the clause to be updated (AmendmentType.UPDATE and AmendmentType.REMOVE only)
     * @return boolean | boolean indicator of the success of the method
     */
    public boolean Amend(AmendmentType amend, int clause) {

        try {
            if (amend == AmendmentType.REMOVE && clause <= this.clauses.size() - 1) {
                this.clauses.remove(clause);
            } else if (clause > this.clauses.size() - 1) {
                throw new IndexOutOfBoundsException("Desired clause index is not in bounds of this policy's clauses.");
            } else {
                throw new IllegalArgumentException("Amendment type \"" + amend + "\" not supported in this overload method. Expected AmendmentType.REMOVE.");
            }
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            return false;
        }
        catch (IllegalArgumentException e) {
            e.printStackTrace();
            return false;
        } 

        return true;
    }


    // ### METHODS ###

    

    // ### MAIN ###

    public static void main(String[] args) {

        Policy pol = new Policy("Gayness", new ArrayList<String>(List.of("Thou shalt be gay.", "Thou shalt not harm a homo.")));

        pol.Amend(AmendmentType.UPDATE, "Thou shalt be EXTRA gay.", 0);
        pol.Amend(AmendmentType.ADD, "Thou shalt love all gays.", 8);
        pol.Amend(AmendmentType.ADD, "Thou shalt love all gays.");
        pol.Amend(AmendmentType.REMOVE, 0);

    }

}
