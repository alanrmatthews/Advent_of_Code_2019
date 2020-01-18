import org.junit.Test;

import static org.junit.Assert.*;

public class Day2Test {

    @Test
    public void runIntcode() {
        assertArrayEquals(Day2.runIntcode(new int[]{1,9,10,3,2,3,11,0,99,30,40,50}), new int[]{3500,9,10,70,2,3,11,0,99,30,40,50});
        assertArrayEquals(Day2.runIntcode(new int[]{1,0,0,0,99}), new int[]{2,0,0,0,99});
        assertArrayEquals(Day2.runIntcode(new int[]{2,3,0,3,99}), new int[]{2,3,0,6,99});
        assertArrayEquals(Day2.runIntcode(new int[]{2,4,4,5,99,0}), new int[]{2,4,4,5,99,9801});
        assertArrayEquals(Day2.runIntcode(new int[]{1,1,1,4,99,5,6,0,99}), new int[]{30,1,1,4,2,5,6,0,99});
    }

    @Test
    public void runNounVerb() {
        assertEquals(Day2.runNounVerb(Day2.input, 12, 2), 3562672);
    }

    @Test
    public void findNounVerb() {
        assertEquals(Day2.findNounVerb(Day2.input, 19690720), 8250);
    }
}