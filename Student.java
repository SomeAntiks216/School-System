import java.util.ArrayList;

public class Student {
    
    //### VARIABLES ###

    private String name;
    private ArrayList<Course> courses;

    // ### CONSTRUCTOR ###

    /**
     * Constructor to create a new Student class object
     * 
     * @param name | String | name of the student
     */
    public Student(String name) {
        this.name = name;

        this.courses = new ArrayList<Course>();
    }


    // ### ACCESSORS

    /**
     * Public name accessor
     * 
     * @return String | name of the student
     */
    public String getName() {
        return this.name;
    }


    // ### MAIN ###

    public static void main(String[] args) throws Exception {

    }

}
