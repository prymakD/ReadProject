import  org.junit.*;
import static org.junit.jupiter.api.Assertions.*;
import java.io.File;
import java.io.IOException;

public class ValidationTesting {
    String passwordhere = "Abcd3*6y";
    String passwordhere2 = "Abcd3*6";

    @Test
    public void isPasswordOfRightLengh() throws IOException {
        assertAll("test",
                () -> assertFalse(IsValid.isValid(passwordhere2)),
                () -> assertTrue(IsValid.isValid(passwordhere),
                        "Weak password")
        );
    }

    @Test
    public void pdfBoxChecker() throws IOException {
            PdfCreate.creatPDF("TestSample.pdf","some text");
            File test = new File("J:/IdeaProjects/ReadProject/TestSample.pdf");
            assertTrue(test.exists(),"File is not found");
    }

}