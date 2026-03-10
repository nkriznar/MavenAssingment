import com.smu.mscda.Main;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyTestClass {
    private String name = "smu";
    @Test
    public void testCapitalizeWithValidInput() {
        // Arrange
        Main stringUtil = new Main();
        String input = "hello";

        // Act
        String result = stringUtil.generateMD5Hex(input);

        // Assert
        assertEquals("5d41402abc4b2a76b9719d911017c592", result);
    }


}
