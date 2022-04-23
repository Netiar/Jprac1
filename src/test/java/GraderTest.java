import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GraderTest {
    @Test
    void fiftyNineShouldReturnD() throws Grader.illegalArgumentException {
       Grader grader = new Grader();
       String expected = "D";
       assertEquals('D',grader.determineLetterGrade(59));

    }

    @Test
    void sixtyNineShouldReturnC() throws Grader.illegalArgumentException {
        Grader grader = new Grader();
        String expected = "C";
        assertEquals('C',grader.determineLetterGrade(69));

    }

    @Test
    void seventyNineShouldReturnB() throws Grader.illegalArgumentException {
        Grader grader = new Grader();
        String expected = "B";
        assertEquals('B',grader.determineLetterGrade(79));

    }

    @Test
    void ninetyNineShouldReturnA() throws Grader.illegalArgumentException {
        Grader grader = new Grader();
        String expected = "A";
        assertEquals('A',grader.determineLetterGrade(90));

    }

    @Test
    void fortyNineShouldReturnE() throws Grader.illegalArgumentException {
        Grader grader = new Grader();
        String expected = "E";
        assertEquals('E',grader.determineLetterGrade(49));

    }

    @Test
    void negativityNineShouldReturnIllegalArgumentException() throws Grader.illegalArgumentException {
        Grader grader = new Grader();
        assertThrows(Grader.illegalArgumentException.class);
        String expected = "F";
        grader.determineLetterGrade((-30));

    }

    private void assertThrows(Class<Grader.illegalArgumentException> illegalArgumentExceptionClass) {
    }
}