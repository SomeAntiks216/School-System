import java.util.ArrayList;

public class Student {
    
    // ### ATTRIBUTES ###

    private String name;
    private Year year;
    private ArrayList<Course> courses;

    // ### CONSTRUCTOR ###

    /**
     * Constructor to create a new Student class object
     * 
     * @param name | String | name of the student
     * @param year | String | year of the student
     */
    public Student(String name, Year year) {
        this.name = name;
        this.year = year;

        this.courses = new ArrayList<Course>();
    }


    // ### ACCESSORS ### 

    /**
     * Public name accessor
     * 
     * @return String | name of the student
     */
    public String getName() {
        return this.name;
    }

    /**
     * Public year accessor
     * 
     * @return Year | year of the student
     */
    public Year getYear() {
        return this.year;
    }


    // ### MANIPULATORS ###



    // ### METHODS ###

    /**
     * Join a course
     * 
     * @param course | Course | course to join
     * @return boolean | boolean indicator of the success of the method
     */
    public boolean joinCourse(Course course) {
        try {
            if (this.courses.contains(course)) {
                throw new IllegalArgumentException("This student is already in the course \"" + course + "\"");
            } else {
                this.courses.add(course);
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    /**
     * Drop a course
     * 
     * @param course | Course | course to be dropped
     * @return boolean | boolean indicator of the success of the method
     */
    public boolean dropCourse(Course course) {
        try {
            if (this.courses.contains(course)) {
                this.courses.remove(course);
            } else {
                throw new IllegalArgumentException("This student is not taking \"" + course + ".\"");
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }


    // ### MAIN ###

    public static void main(String[] args) throws Exception {

        
    }

}
