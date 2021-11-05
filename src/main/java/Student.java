
import java.util.ArrayList;

public class Student {
    // initialising variables
    private String name;
    private int age;
    private String dob;
    private String id;
    private String username;
    private ArrayList<Course> courses;
    private ArrayList<Module> modules;

    public Student(String name, int age, String dob, String id, Course course) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
        modules = new ArrayList<>();
        courses = new ArrayList<>();
        addCourse(course);
    }
    public void addCourse(Course c) {
        courses.add(c);
        c.addStudent(this);
    }
    public void addModule(Module m) {
        modules.add(m);
        m.addStudent(this);
    }
    // Accessor and Mutator methods
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public ArrayList<Module> getModules() {
        return modules;
    }
    // username set by concatenating student's name and age
    public String getUsername() {
        String str = name+age;
        return str;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public ArrayList<Course> getCourses() {
        return courses;
    }
    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

}
