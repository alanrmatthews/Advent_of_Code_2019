import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class Day1Test {

    @Test
    public void getFuelRequirement12() {
        ArrayList<Integer> input = new ArrayList<Integer>();
        input.add(12);
        assertEquals(Day1.getFuelRequirement(input), 2);
    }

    @Test
    public void getFuelRequirement14() {
        ArrayList<Integer> input = new ArrayList<Integer>();
        input.add(14);
        assertEquals(Day1.getFuelRequirement(input), 2);
    }

    @Test
    public void getFuelRequirement1969() {
        ArrayList<Integer> input = new ArrayList<Integer>();
        input.add(1969);
        assertEquals(Day1.getFuelRequirement(input), 654);
    }

    @Test
    public void getFuelRequirement100756() {
        ArrayList<Integer> input = new ArrayList<Integer>();
        input.add(100756);
        assertEquals(Day1.getFuelRequirement(input), 33583);
    }
}