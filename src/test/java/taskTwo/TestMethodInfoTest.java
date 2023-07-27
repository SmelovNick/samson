package taskTwo;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

@TestMethodInfo(priority = Priority.Critical, author = "Test user", lastModified = "20.08.2019")
public class TestMethodInfoTest {

    @Test
    public void annotation() {
        TestMethodInfo annotation = getClass().getAnnotation(TestMethodInfo.class);
        System.out.printf("Priority: %s\n" +
                        "Author: %s\n" +
                        "Last modified: %s\n",
                annotation.priority(), annotation.author(), annotation.lastModified());
        assertEquals(1, 1);
    }
}
