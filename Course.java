import java.util.ArrayList;

public class Course {

    private String name;
    private ArrayList<Student> students;
    private ArrayList<Assignment> assignments;

    public Course(String name) {
        this.name = name;

        this.students = new ArrayList<Student>();
        this.assignments = new ArrayList<Assignment>();
    }

    public static void main(String[] args) throws Exception {

    }

}