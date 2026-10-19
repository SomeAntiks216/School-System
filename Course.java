import java.util.ArrayList;

public class Course {

    //  ### VARIABLES ###

    private String name;
    private String ID;
    private ArrayList<Student> students;
    private ArrayList<Assignment> assignments;

    // ### CONSTRUCTOR ###

    /**
     * Constructor to create a new Course class object
     * 
     * @param name | String | the name of the course
     */
    public Course(String name, String ID) {
        this.name = name;
        this.ID = ID;

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


    // ### MANIPULATORS ###

    public boolean addStudent(Student student) {
        
        try {
            if (this.students.contains(student)) {
                throw new IllegalArgumentException("The student \"" + student + "\" is already in this class.");
            } else {
                this.students.add(student);
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }


    // ### MAIN ###

    public static void main(String[] args) throws Exception {

        Course csc120 = new Course("Object Oriented Programming", "CSC 120");

    }

}