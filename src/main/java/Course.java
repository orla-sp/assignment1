
import java.util.ArrayList;
import org.joda.time.*;

public class Course {
    // initialising variables
    private String cName;
    private ArrayList<Module> modules;
    private ArrayList<Student> students;
    private DateTime startDate;
    private DateTime endDate;

    public Course(String name, DateTime start, DateTime end) {
        cName = name;
        startDate = start;
        endDate = end;
        modules = new ArrayList<>();
        students = new ArrayList<>();
    }
    public void addStudent(Student s) {
        students.add(s);
    }
    public void addModule(Module m) {
        modules.add(m);
        m.addCourse(this);
    }
    public String printModules() {
        String str = "";
        // loops over modules in list and adds module names to string
        for(Module m : modules) {
            str += m.getmName() + ", ";
        }
        // returns string containing list of modules
        return str;
    }
    public String printStudents() {
        String str = "";
        // loops over modules in list and adds module names to string
        for(Student s : students) {
            str += s.getName() + ", ";
        }
        // returns string containing list of students
        return str;
    }
    // Accessor methods
    public String getcName() {
        return cName;
    }
    public void setcName(String cName) {
        this.cName = cName;
    }
    public ArrayList<Module> getModules() {
        return modules;
    }
    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }
    public ArrayList<Student> getStudents() {
        return students;
    }

    // Mutator methods
    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
    public DateTime getStartDate() {
        return startDate;
    }
    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }
    public DateTime getEndDate() {
        return endDate;
    }
    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }
}
