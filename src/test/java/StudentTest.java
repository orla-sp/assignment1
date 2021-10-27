
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.joda.time.DateTime;

public class StudentTest {
    private Course ECE = new Course("ECE", new DateTime(2018, 8, 28, 9, 0 ,0 ,0), new DateTime(2021, 6, 20, 5, 0, 0, 0));
    private Student test = new Student("orla", 21, "05/04/2000", "123456", ECE);

    @Test
    public void usernameTest() {
        String uName = test.getUsername();
        assertTrue(uName.equals("orla21"));
    }

    @Test
    public void nameTest() {
        test.setName("Jack");
        String name = test.getName();
        assertTrue(name.equals("Jack"));
    }
    @Test
    public void ageTest() {
        test.setAge(22);
        int age = test.getAge();
        assertTrue(age == 22);
    }
    @Test
    public void dobTest() {
        test.setDob("24/06/1999");
        String dob = test.getDob();
        assertTrue(dob.equals("24/06/1999"));
    }
    @Test
    public void IDTest() {
        test.setId("22334455");
        String id = test.getId();
        assertTrue(id.equals("22334455"));
    }
}
