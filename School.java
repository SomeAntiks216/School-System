import java.util.ArrayList;

public class School {
    
    // ### VARIABLES ###

    private String name;

    private ArrayList<Course> courses;
    private ArrayList<Student> students;

    private ArrayList<Policy> policy;


    // ### CONSTRUCTOR ###

    /**
     * Constructor to create a new School class object
     * 
     * @param name | String | the name of the school
     */
    public School(String name) {
        this.name = name;

        courses = new ArrayList<Course>();
        students = new ArrayList<Student>();
        policy = new ArrayList<Policy>();
    }


    // ### ACCESSORS ###

    /**
     * Public name accessor
     * 
     * @return String | name of the school
     */
    public String getName() {
        return this.name;
    }

    /**
     * Public course list accessor
     * 
     * @return ArrayList<Course> | courses offered at the school
     */
    public ArrayList<Course> getCourses() {
        return this.courses;
    }

    /**
     * Public student list accessor
     * 
     * @return ArrayList<Student> | students attending the school
     */
    public ArrayList<Student> getStudents() {
        return this.students;
    }

    /**
     * Public policy accessor (entire policy)
     * 
     * @return ArrayList<Policy> | school policy list
     */
    public ArrayList<Policy> getPolicy() {
        return this.policy;
    }

    /**
     * Public unit policy accessor (singular policy item)
     * 
     * @param index | int | index of the desired policy
     * @return Policy | policy at the given index
     */
    public Policy getUnitPolicy(int index) throws IndexOutOfBoundsException {
        return this.policy.get(index);
    }


    // ### MANIPULATORS ###

    public boolean addCourse(Course course) {

        try {
            if (this.courses.contains(course)) {
                throw new IllegalArgumentException("Course <" + course + "> already exists.");
            } else {
                this.courses.add(course);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e);
            return false;
        }

        return true;
    }


    // ### ORGANIZERS ###

    // course list alphabetizer


    // ### MAIN ###

    public static void main(String[] args) throws Exception {

    }

}
