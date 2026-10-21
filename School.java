import java.util.ArrayList;
import java.util.NoSuchElementException;

public class School {
    
    // ### VARIABLES ###

    private String name;

    private ArrayList<Course> courses;
    private ArrayList<Student> students;

    private ArrayList<Policy> policies;


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
        policies = new ArrayList<Policy>();
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
     * Public policies accessor (all policies)
     * 
     * @return ArrayList<Policy> | school policy list
     */
    public ArrayList<Policy> getPolicy() {
        return this.policies;
    }

    /**
     * Public policy accessor (singular policy item)
     * 
     * @param index | int | index of the desired policy
     * @return Policy | policy at the given index
     */
    public Policy getUnitPolicy(int index) throws IndexOutOfBoundsException {
        return this.policies.get(index);
    }

    /**
     * Public policy accessor (one or more policy items)
     * Access by name
     * 
     * @param name | String | name of the policy to be accessed
     * @return ArrayList<Policy> | all policies in this school with the provided name
     */
    public ArrayList<Policy> getUnitPolicy(String name) {
        ArrayList<Policy> out = new ArrayList<Policy>();
        
        try {
            if (this.policy.size() != 0) {
                for (Policy p : this.policies) {
                    out.add(p);
                }
            } else {
                throw new IllegalStateException("There are no policies in this school.");
            }
            if (out.size() == 0) {
                throw new NoSuchElementException("There are no policies with the name \"" + name + "\" in this school.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return out;
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


    // ### METHODS ###



    // ### MAIN ###

    public static void main(String[] args) throws Exception {
        
    }

}
