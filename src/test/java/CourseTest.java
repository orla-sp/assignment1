
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.joda.time.*;

public class CourseTest {
    private Course test = new Course("ECE", new DateTime(2018, 8, 28, 9, 0 ,0 ,0), new DateTime(2021, 6, 20, 5, 0, 0, 0));

    @Test
    public void cNameTest() {
        test.setcName("EEE");
        String cName = test.getcName();
        assertTrue(cName.equals("EEE"));
    }
    @Test
    public void startTest() {
        test.setStartDate(new DateTime(2019, 8, 28, 9, 0 ,0 ,0));
        DateTime startDate = test.getStartDate();
        assertTrue(startDate.equals(new DateTime(2019, 8, 28, 9, 0 ,0 ,0)));
    }
    @Test
    public void endTest() {
        test.setEndDate(new DateTime(2022, 6, 20, 5, 0, 0, 0));
        DateTime endDate = test.getEndDate();
        assertTrue(endDate.equals(new DateTime(2022, 6, 20, 5, 0, 0, 0)));
    }
}
