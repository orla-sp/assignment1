
import java.util.ArrayList;

public class Student {

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
        courses.add(course);
    }
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

    public ArrayList<Module> getModules() {
        for(Course c : courses) {
            for(Module m : c.getModules()) {
                if(!modules.contains(m)) {
                    modules.add(m);				}
            }
        }
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }
}
