/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
    @Test void errorTest() {
        App classUnderTest = new App();
        String test = classUnderTest.findError("C:\\Users\\Hiba Almade\\Desktop\\java-fundamentals\\linter\\app\\src\\main\\resources\\getas.js");
        String result = "\nLine 3: Missing semicolon." +
                "\nLine 5: Missing semicolon." +
                "\nLine 11: Missing semicolon." +
                "\nLine 13: Missing semicolon." +
                "\nLine 15: Missing semicolon." +
                "\nLine 26: Missing semicolon." +
                "\nLine 28: Missing semicolon." +
                "\nLine 32: Missing semicolon." +
                "\nLine 36: Missing semicolon." +
                "\nLine 40: Missing semicolon." +
                "\nLine 41: Missing semicolon." +
                "\nLine 50: Missing semicolon." +
                "\nLine 51: Missing semicolon." +
                "\nLine 59: Missing semicolon." +
                "\nLine 60: Missing semicolon." +
                "\nLine 61: Missing semicolon." +
                "\nLine 62: Missing semicolon." +
                "\nLine 64: Missing semicolon." +
                "\nLine 70: Missing semicolon." +
                "\nLine 71: Missing semicolon." +
                "\nLine 72: Missing semicolon." +
                "\nLine 73: Missing semicolon." +
                "\nLine 74: Missing semicolon." +
                "\nLine 76: Missing semicolon." +
                "\nLine 77: Missing semicolon." +
                "\nLine 78: Missing semicolon." +
                "\nLine 79: Missing semicolon." +
                "\nLine 80: Missing semicolon." +
                "\nLine 82: Missing semicolon." +
                "\nLine 83: Missing semicolon." +
                "\nLine 84: Missing semicolon." +
                "\nLine 85: Missing semicolon." +
                "\nLine 86: Missing semicolon." +
                "\nLine 88: Missing semicolon." +
                "\nLine 89: Missing semicolon." +
                "\nLine 90: Missing semicolon." +
                "\nLine 91: Missing semicolon." +
                "\nLine 92: Missing semicolon." +
                "\nLine 94: Missing semicolon." +
                "\nLine 95: Missing semicolon." +
                "\nLine 96: Missing semicolon." +
                "\nLine 97: Missing semicolon." +
                "\nLine 98: Missing semicolon." +
                "\nLine 99: Missing semicolon." +
                "\nLine 100: Missing semicolon." +
                "\nLine 101: Missing semicolon.";

        assertEquals(test,result);
    }

    @Test void noErrorTest() {
        App classUnderTest = new App();
        String test = classUnderTest.findError("C:\\Users\\Hiba Almade\\Desktop\\java-fundamentals\\linter\\app\\src\\main\\resources\\noError.js");
        String result = "";
        assertEquals(test,result);
    }

    @Test void oneErrorTest(){
        App classUnderTest = new App();
        String test = classUnderTest.findError("C:\\Users\\Hiba Almade\\Desktop\\java-fundamentals\\linter\\app\\src\\main\\resources\\oneError.js");
        String result = "\nLine 3: Missing semicolon.";
        assertEquals(test,result);
    }
    @Test void emptyTest() {
        App classUnderTest = new App();
        String test = classUnderTest.findError("C:\\Users\\Hiba Almade\\Desktop\\java-fundamentals\\linter\\app\\src\\main\\resources\\empty.js");
        String result = "";
        assertEquals(test,result);
    }

    @Test void fewErrorTest() {
        App classUnderTest = new App();
        String test = classUnderTest.findError("C:\\Users\\Hiba Almade\\Desktop\\java-fundamentals\\linter\\app\\src\\main\\resources\\fewError.js");
        String result = "\nLine 3: Missing semicolon." +
                "\nLine 26: Missing semicolon." +
                "\nLine 64: Missing semicolon." +
                "\nLine 89: Missing semicolon.";
        System.out.println(test);
        System.out.println(result);
        assertEquals(test,result);


    }
}
