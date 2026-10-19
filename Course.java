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

    /**
     * Public students accessor (all students)
     * 
     * @return ArrayList<Student> | list of students in this course
     */
    public ArrayList<Student> getStudents() {
        return this.students;
    }

    /**
     * Public unit student accessor (singular student)
     * Access by index
     * 
     * @param index | int | index of the student to be accessed
     * @return Student | student at the given index
     */
    public Student getStudent(int index) throws IndexOutOfBoundsException {
        return this.students.get(index);
    }

    public ArrayList<Student> getStudent(String name) {
        ArrayList<Student> out = new ArrayList<Student>();

        try {
            for (Student student : this.students) {
                if (student.getName() == name) {
                    out.add(student);
                }
            }
            if (out.size() == 0) {
                throw new NoSuchFieldException();
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        return out;
    }


    // ### MAIN ###

    public static void main(String[] args) throws Exception {

    }

}