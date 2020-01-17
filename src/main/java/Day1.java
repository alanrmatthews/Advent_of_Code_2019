import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class Day1 {
    public static void main(String[] args) throws IOException {

        int[] masses = Files.lines(Paths.get("src/main/resources/Day1_input.txt"))
                       .mapToInt(Integer::parseInt).toArray();

        int fuelRequirement = 0;
        int expandedFuelRequirement = 0;
        for (int mass : masses) {
            fuelRequirement += getFuelRequirement(mass);
            expandedFuelRequirement += getExpandedFuelRequirement(mass);
        }

        System.out.println("Day 1 Fuel Requirement: " + fuelRequirement);
        System.out.println("Day 1 Expanded Fuel Requirement: " + expandedFuelRequirement);
    }

    static int getFuelRequirement(int mass) {
        return mass / 3 - 2;
    }

    static int getExpandedFuelRequirement(int mass) {
        int output = 0;

        int newFuelReqt = getFuelRequirement(mass);

        while (newFuelReqt > 0) {
            output += newFuelReqt;
            newFuelReqt = getFuelRequirement(newFuelReqt);
        }

        return output;
    }
}
