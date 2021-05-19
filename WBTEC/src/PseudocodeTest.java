import static org.junit.jupiter.api.Assertions.*;

class PseudocodeTest {
    @org.junit.jupiter.api.Test
    void squareTestZero() {
        int x = 0;

        Pseudocode testZero = new Pseudocode();
        assertEquals(0, testZero.square(x));
    }

    @org.junit.jupiter.api.Test
    void squareTestLessZero() {
        int x = -1;

        Pseudocode testLessThanZero = new Pseudocode();
        assertEquals(1, testLessThanZero.square(x));
    }

    @org.junit.jupiter.api.Test
    void squareTestGreaterOne() {
        int x = 2;
        int n = 1;
        int y = 1;

        Pseudocode testGreaterThanOne = new Pseudocode();
        assertEquals(4, testGreaterThanOne.square(x));
    }

    @org.junit.jupiter.api.Test
    void squareTestEqualOne() {
        int x = 1;

        Pseudocode testEqualOne = new Pseudocode();
        assertEquals(1, testEqualOne.square(x));
    }
}