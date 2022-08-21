import java.util.Scanner;

/*
 * @author I'm Ake
 */
public class simpleCalculater {
    public static void main(String[] args) {
        System.out.println("Welcome to SimpleCalculater \n -This calculater calculating cells ");
        // declare scanner variable (a)
        Scanner a = new Scanner(System.in);
        // declare globle variable
        String connect;
        int R, C;
        // while loop check for error value
        while (true) {
            // insert operator
            System.out.print("Please select + or - : ");
            connect = a.next();
            if ((connect.equals("+") || (connect.equals("-")))) {
                break;
            }
            System.out.println("Please enter + or - only");
            continue;
        }
        while (true) {
            // insert first value
            System.out.print("Row = ");
            try {
                R = Math.round(a.nextFloat());
            } catch (NumberFormatException exception) {
                System.out.println("Please enter number only");
                continue;
            }
            break;
        }
        while (true) {
            // insert secound value
            System.out.print("Column = ");
            try {
                C = Math.round(a.nextFloat());
            } catch (NumberFormatException exception) {
                System.out.println("Please enter number only");
                continue;
            }
            break;
        }
        // close scanner for prevent resource leak
        a.close();
        System.out.println("---------------------------------");
        // show answer
        if (connect.equals("+")) {
            System.out.println(String.format("Total %d %s %d = " + (R + C), R, connect, C));
            System.out.print("---------------------------------");
        } else if (connect.equals("-")) {
            System.out.println(String.format("Total %d %s %d = " + (R - C), R, connect, C));
            System.out.print("---------------------------------");
        }
    }
}
