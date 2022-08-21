
/*
Punchai Wongmitmaitee
6130203438 S09 Sec.831
 */
import java.util.Scanner;

public class halfPyramidUpSideDown {
    public static void main(String[] args) {
        System.out.print("Enter Number : ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        in.close();
        // check if before build pyramid
        if (size % 2 == 1) {
            // this loop start with number user enter count down to zero
            // example enter "5" 5 -> 1
            for (int A = 0; size >= A; size--) {
                // star each loop depent on variable from first loop (size)
                for (int B = 0; size >= B; B++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else if (size % 2 == 0) {
            // this loop start with zero plus one each loop to number user enter
            // example enter "4" 1 -> 4
            for (int A = 0; size > A; A++) {
                // star each loop depent on variable from first loop (A)
                for (int B = 0; B <= A; B++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}