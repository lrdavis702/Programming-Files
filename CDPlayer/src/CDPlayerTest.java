import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class CDPlayerTest {

    @org.junit.jupiter.api.Test
    void openOrCloseButton() {
        CDPlayer test1 = new CDPlayer();
        assertEquals(true, test1.openOrCloseButton(true));
        assertEquals(false, test1.openOrCloseButton(false));
    }

    @org.junit.jupiter.api.Test
    void playButton() {
        CDPlayer test2 = new CDPlayer();
        assertEquals(true, test2.playButton(true));
        assertEquals(false, test2.playButton(false));    }

    @org.junit.jupiter.api.Test
    void printStatus() {
        fail("Not yet implemented");
    }

    @org.junit.jupiter.api.Test
    void hasCD() {
        fail("Not yet implemented");
    }

    @org.junit.jupiter.api.Test
    void printButtons() {
        fail("Not yet implemented");
    }
}