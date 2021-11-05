
import java.util.ArrayList;

public class Module {
    // initialising variables
    private String mName;
    private String mId;
    private ArrayList<Student> students;
    private ArrayList<Course> courses;

    public Module(String name, String id) {
        mName = name;
        mId = id;
        students = new ArrayList<>();
        courses = new ArrayList<>();
    }
    // adds student to list
    public void addStudent(Student s) {
        students.add(s);
    }
    // adds student to list
    public void addCourse(Course c) {
        courses.add(c);
    }
    // Accessor and Mutator methods
    public String getmName() {
        return mName;
    }
    public void setmName(String mName) {
        this.mName = mName;
    }
    public String getmId() {
        return mId;
    }
    public void setmId(String mId) {
        this.mId = mId;
    }
    public ArrayList<Student> getStudents() {
        return students;
    }
    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
    public ArrayList<Course> getCourses() {
        return courses;
    }

}
