
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

    // method gets list of courses in module by looping over students
    // and looping over each course that each student takes
    // this adds each course in the module to the modules list
    public ArrayList<Course> getCourses() {
        for(Student s : students) {
            for(Course c : s.getCourses()) {
                if(!courses.contains(c)) {
                    courses.add(c);
                }
            }
        }
        return courses;
    }

}
