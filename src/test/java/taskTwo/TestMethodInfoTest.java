package taskTwo;

import org.testng.annotations.Test;
import taskTwo.library.Priority;
import taskTwo.library.TestMethodInfo;

import static org.testng.Assert.*;

@TestMethodInfo(priority = Priority.CRITICAL, author = "Test user", lastModified = "20.08.2019")
public class TestMethodInfoTest {

    @Test
    public void annotation() {
        TestMethodInfo annotation = getClass().getAnnotation(TestMethodInfo.class);
        System.out.printf("""
                        Priority: %s
                        Author: %s
                        Last modified: %s
                        """,
                annotation.priority(), annotation.author(), annotation.lastModified());
        assertEquals(1, 1);
    }
}
