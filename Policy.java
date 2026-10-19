import java.util.ArrayList;

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

    // accessors


    // ### MODIFIERS ###

    /**
     * Update this policy
     * AmendmentType.Update expected due to method overloading and otherwise redundant arguments
     * 
     * @param amend | AmendmentType | type of amendment to be made
     * @param amdenment | String | policy to be added (AmendmentType.Add and AmendmentType.Update only)
     * @param clause | int | index of the clause to be updated (AmendmentType.Update only)
     */
    public boolean Amend(AmendmentType amend, String amendment, int clause) {

        try {
            if (amend == AmendmentType.Update) {
                this.clauses.set(clause, amendment);
            } else {
                throw new IllegalArgumentException("Amendment type <" + amend + "> not supported in this overloaded method.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e);
            return false;
        }

        return true;
    }


    // ### MAIN ###

    public static void main(String[] args) {
        
    }

}
