
import java.util.*;
public class FourthPattern {
    public static void main(String[] args) {
        int height = 7; // height of the alphabets

        // Pattern for A
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= height / 2; j++) {
                if ((j == 0 || j == height / 2) && i != 0 ||
                        i == 0 && j != 0 && j != height / 2 ||
                        i == height / 2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("  "); // space between the letters

            // Pattern for B
            for (int j = 0; j < height; j++) {
                if (j == 0 || (j == height - 1 && (i != 0 && i != height / 2 && i != height - 1)) ||
                        (i == 0 || i == height / 2 || i == height - 1) && j < height - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
