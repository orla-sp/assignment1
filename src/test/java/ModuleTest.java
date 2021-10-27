
import org.junit.Test;
import static org.junit.Assert.*;

public class ModuleTest {
    private Module test = new Module("Software Engineering", "CT417");

    @Test
    public void mNameTest() {
        test.setmName("System on Chip");
        String mName = test.getmName();
        assertTrue(mName.equals("System on Chip"));
    }
    @Test
    public void mIdTest() {
        test.setmId("EE451");
        String mId = test.getmId();
        assertTrue(mId.equals("EE451"));
    }
}
