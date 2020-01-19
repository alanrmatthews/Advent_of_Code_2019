import org.junit.Test;

import static org.junit.Assert.*;

public class Day1Test {

    @Test
    public void getFuelRequirement() {
        assertEquals(Day1.getFuelRequirement(12), 2);
        assertEquals(Day1.getFuelRequirement(14), 2);
        assertEquals(Day1.getFuelRequirement(1969), 654);
        assertEquals(Day1.getFuelRequirement(100756), 33583);
    }

    @Test
    public void getExpandedFuelRequirement() {
        assertEquals(Day1.getExpandedFuelRequirement(12), 2);
        assertEquals(Day1.getExpandedFuelRequirement(14), 2);
        assertEquals(Day1.getExpandedFuelRequirement(1969), 966);
        assertEquals(Day1.getExpandedFuelRequirement(100756), 50346);
    }
}