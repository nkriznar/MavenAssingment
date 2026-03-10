import com.smu.mscda.Main;
import org.apache.commons.lang3.text.WordUtils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyTestClass {
    @Test
    public void testCapitalizeWithValidInput() {
        // Arrange
        String input = "hello world";

        // Act
        String result = WordUtils.capitalize(input);

        // Assert
        assertEquals("Hello World", result);
    }

    @Test
    public void testGenerateMD5Hex() {
        // Arrange
        String input = "hello";

        // Act
        String result = Main.generateMD5Hex(input);

        // Assert
        assertEquals("5d41402abc4b2a76b9719d911017c592", result);
    }
}
