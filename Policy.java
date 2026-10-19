import java.util.ArrayList;
import java.util.List;

public class Policy {
    
    private String name;
    private ArrayList<String> clauses;

    /**
     * Constructor to create a new Policy class object
     */
    public Policy(String name, ArrayList<String> clauses) {
        this.name = name;
        this.clauses = clauses;
    }


    // ### ACCESSORS ###

    /**
     * 
     */
    public ArrayList<String> getClauses() {
        return this.clauses;
    }

    public String getClause(int index) {
        return this.clauses.get(index);
    }


    // ### MODIFIERS ###

    /**
     * Update this policy
     * AmendmentType.UPDATE expected due to method overloading and otherwise redundant arguments
     * 
     * @param amend | AmendmentType | type of amendment to be made (AmendmentType.UPDATE expected)
     * @param amdenment | String | clause to be changed to (AmendmentType.ADD and AmendmentType.UPDATE only)
     * @param clause | int | index of the clause to be updated (AmendmentType.UPDATE only)
     */
    public boolean Amend(AmendmentType amend, String amendment, int clause) {

        try {
            if (amend == AmendmentType.UPDATE) {
                this.clauses.set(clause, amendment);
            } else {
                throw new IllegalArgumentException("Amendment type \"" + amend + "\" not supported in this overload method. Expected AmendmentType.UPDATE.");
            }
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
     */
    public boolean Amend(AmendmentType amend) {

        try {
            if (amend == AmendmentType.REMOVE) {

            } else {
                throw new IllegalArgumentException("Amendment type \"" + amend + "\" not supported in this overload method. Expected AmendmentType.REMOVE.");
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }


    // ### MAIN ###

    public static void main(String[] args) {

        Policy pol = new Policy("Gayness", new ArrayList<String>(List.of("Thou shalt be gay.", "Thou shalt not harm a homo.")));

        pol.Amend(AmendmentType.UPDATE, "Thou shalt be EXTRA gay.", 0);
        pol.Amend(AmendmentType.ADD, "Thou shalt love all gays.");

    }

}
