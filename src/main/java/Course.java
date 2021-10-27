
import java.util.ArrayList;
import org.joda.time.*;

public class Course {
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
    public String printModules() {
        String str = "";
        for(Module m : modules) {
            str += m.getmName() + ", ";
        }
        return str;
    }
    public String printStudents() {
        String str = "";
        for(Student s : getStudents()) {
            str += s.getName() + ", ";
        }
        return str;
    }
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
        for(Module m : modules) {
            for(Student s : m.getStudents()) {
                if(!students.contains(s)) {
                    students.add(s);
                }
            }
        }
        return students;
    }
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
