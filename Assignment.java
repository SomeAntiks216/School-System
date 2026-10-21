import java.util.ArrayList;

public class Assignment {

    // ### ATTRIBUTES ###
    
    private String name;
    private String ID;
    private float grade;
    private ArrayList<String> contents;


    // ### CONSTRUCTOR ###

    /**
     * Constructor to create a new Assignment class object
     * 
     * @param name | String | name of the assignment
     * @param ID | String | ID of the assignment
     */
    public Assignment(String name, String ID) {
        this.name = name;
        this.ID = ID;

        this.contents = new ArrayList<String>();
    }


    // ### ACCESSORS ###

    /**
     * Public name accessor
     * 
     * @return String | name of this assignment
     */
    public String getName() {
        return this.name;
    }

    /**
     * Public ID accessor
     * 
     * @return String | ID of this assignment
     */
    public String getID() {
        return this.ID;
    }

    // ### MANIPULATORS ###



    // ### METHODS ###



    // ### MAIN ###

    public static void main(String[] args) throws Exception {

    }
    
}