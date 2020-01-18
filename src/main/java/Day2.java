import java.io.IOException;

public class Day2 {

    protected static final int[] input = new int[]{1,0,0,3,1,1,2,3,1,3,4,3,1,5,0,3,2,1,9,19,1,5,19,23,1,6,23,27,1,27,10,31,1,31,5,35,
            2,10,35,39,1,9,39,43,1,43,5,47,1,47,6,51,2,51,6,55,1,13,55,59,2,6,59,63,1,63,5,67,2,
            10,67,71,1,9,71,75,1,75,13,79,1,10,79,83,2,83,13,87,1,87,6,91,1,5,91,95,2,95,9,99,1,5,
            99,103,1,103,6,107,2,107,13,111,1,111,10,115,2,10,115,119,1,9,119,123,1,123,9,127,1,13,
            127,131,2,10,131,135,1,135,5,139,1,2,139,143,1,143,5,0,99,2,0,14,0};

    public static void main(String[] args) {
        System.out.println("Position 0: " + runNounVerb(input, 12, 2));
        System.out.println("Part 2: " + findNounVerb(input, 19690720));
    }

    public static int findNounVerb(int[] intcode, int targetOutput) {
        for (int noun = 0; noun < 100; noun++) {
            for (int verb = 0; verb < 100; verb++) {
                if (runNounVerb(intcode, noun, verb) == targetOutput) {
                    return 100 * noun + verb;
                }
            }
        }

        return 0;
    }

    public static int runNounVerb(int[] intcode, int noun, int verb) {
        int[] updated = intcode.clone();

        updated[1] = noun;
        updated[2] = verb;

        return runIntcode(updated)[0];
    }

    public static int[] runIntcode(int[] intcode) {
        int[] output = intcode.clone();

        int ind = 0;

        while (output[ind] != 99) {
            if (output[ind] == 1) {
                output[output[ind+3]] = output[output[ind+1]] + output[output[ind+2]];
            } else {
                output[output[ind+3]] = output[output[ind+1]] * output[output[ind+2]];
            }

            ind += 4;
        }

        return output;
    }
}
