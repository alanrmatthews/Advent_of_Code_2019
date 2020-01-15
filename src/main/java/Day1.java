import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) throws FileNotFoundException {

        //TODO
        //int[] ints = Files.lines(Paths.get("input.txt"))
        //          .mapToInt(Integer::parseInt).toArray();
        
        File input = new File(args[0]);

        ArrayList<Integer> masses = new ArrayList<Integer>();

        try (Scanner scanner = new Scanner(input)) {
            while (scanner.hasNextInt()) {
                masses.add(scanner.nextInt());
            }
        }

        System.out.println(getFuelRequirement(masses));
    }

    static int getFuelRequirement(ArrayList<Integer> masses) {
        int output = 0;

        for (int mass : masses) {
            output += mass / 3 - 2;
        }

        return output;
    }
}
