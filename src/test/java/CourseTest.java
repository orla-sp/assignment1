
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.joda.time.*;

public class CourseTest {
    // initialising course object that will be used in tests
    private Course test = new Course("ECE", new DateTime(2018, 8, 28, 9, 0 ,0 ,0), new DateTime(2021, 6, 20, 5, 0, 0, 0));

    @Test
    public void cNameTest() {
        test.setcName("EEE"); // sets course name
        String cName = test.getcName(); // gets course name using accessor method
        assertTrue(cName.equals("EEE")); // passes test  if name was set successfully
    }
    @Test
    public void startTest() {
        test.setStartDate(new DateTime(2019, 8, 28, 9, 0 ,0 ,0));
        // sets start date
        DateTime startDate = test.getStartDate();
        // gets start date using accessor method
        assertTrue(startDate.equals(new DateTime(2019, 8, 28, 9, 0 ,0 ,0)));
        // passes test if the date was set successfully
    }
    @Test
    public void endTest() {
        test.setEndDate(new DateTime(2022, 6, 20, 5, 0, 0, 0));
        // sets end date
        DateTime endDate = test.getEndDate();
        // gets end date using accessor method
        assertTrue(endDate.equals(new DateTime(2022, 6, 20, 5, 0, 0, 0)));
        // passes test if the date was set successfully
    }
}
