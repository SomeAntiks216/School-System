import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Course {

    //  ### VARIABLES ###

    private String name;
    private String ID;
    private Professor professor;
    private ArrayList<Student> students;
    private ArrayList<Assignment> assignments;

    // ### CONSTRUCTOR ###

    /**
     * Constructor to create a new Course class object
     * 
     * @param name | String | the name of the course
     */
    public Course(String name, String ID, Professor professor) {
        this.name = name;
        this.ID = ID;
        this.professor = professor;

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

    /**
     * Public student accessor (one or more students)
     * Access by name
     * 
     * @param name | String | name of the student to be accessed
     * @return ArrayList<Student> | all students in this course with the provided name
     */
    public ArrayList<Student> getStudent(String name) {
        ArrayList<Student> out = new ArrayList<Student>();

        try {
            if (this.students.size() != 0) {
                for (Student student : this.students) {
                    if (student.getName().toLowerCase().equals(name.toLowerCase())) {
                        out.add(student);
                    }
                }
            } else {
                throw new IllegalStateException("There are no students in this course.");
            }
            if (out.size() == 0) {
                throw new NoSuchElementException("There are no students with the name \"" + name + "\"");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return out;
    }


    // ### MANIPULATORS ###

    public boolean addStudent(Student student) {
        try {
            if (this.students.contains(student)) {
                throw new IllegalArgumentException("The student \"" + student.getName() + "\" is already in this course.");
            } else {
                this.students.add(student);
                student.joinCourse(this);
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public boolean removeStudent(Student student) {
        try {
            if (this.students.contains(student)) {
                this.students.remove(student);
            } else {
                throw new IllegalArgumentException("The student \"" + student.getName() + "\" is not in this course.");
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        return true;
    }


    // ### MAIN ###

    public static void main(String[] args) throws Exception {

        Student harry = new Student("Harry");
        Course csc120 = new Course("Object Oriented Programming", "CSC 120");

        csc120.addStudent(harry);
        

    }

}