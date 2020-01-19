import org.junit.Test;

import static org.junit.Assert.*;

public class Day3Test {

    @Test
    public void getDistance() {
        String[] Wire1 = new String[]{"R8","U5","L5","D3"};
        String[] Wire2 = new String[]{"U7","R6","D4","L4"};

        assertEquals(Day3.getDistance(Wire1, Wire2), 6);

        Wire1 = new String[]{"R75","D30","R83","U83","L12","D49","R71","U7","L72"};
        Wire2 = new String[]{"U62","R66","U55","R34","D71","R55","D58","R83"};

        assertEquals(Day3.getDistance(Wire1, Wire2), 159);

        Wire1 = new String[]{"R98","U47","R26","D63","R33","U87","L62","D20","R33","U53","R51"};
        Wire2 = new String[]{"U98","R91","D20","R16","D67","R40","U7","R15","U6","R7"};

        assertEquals(Day3.getDistance(Wire1, Wire2), 135);

        // Part 1 of the actual problem:
        assertEquals(Day3.getDistance(Day3.Wire1, Day3.Wire2), 217);
    }
}