import java.util.ArrayList;

public class Course {

    //  ### VARIABLES ###

    private String name;
    private ArrayList<Student> students;
    private ArrayList<Assignment> assignments;

    // ### CONSTRUCTOR ###

    /**
     * Constructor to create a new Course class object
     * 
     * @param name | String | the name of the course
     */
    public Course(String name) {
        this.name = name;

        this.students = new ArrayList<Student>();
        this.assignments = new ArrayList<Assignment>();
    }


    // ### ACCESSORS ###

    /**
     * Public name accessor
     * 
     * @return String | name of the course
     */
    public String getName() {
        return this.name;
    }


    // ### MAIN ###

    public static void main(String[] args) throws Exception {

    }

}