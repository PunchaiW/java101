
/*
Punchai Wongmitmaitee
6130203438 Sec.831 S09
*/
import java.util.Scanner;

public class vowelsSeparater {
    public static void main(String[] arge) {
        Scanner tea = new Scanner(System.in); // declare variable for scanner
        int counts = 0; // variable for count of vowels
        String vowels = "aAeEiIoOuU"; // variable contain vowels for check
        StringBuffer chest = new StringBuffer(""); // string buffer for store detected vowels
        System.out.println("Vowels Separater");
        System.out.print("Please insert any word : ");
        // insert word
        String matcha = tea.next();
        // first loop is size of word
        for (int A = 0; matcha.length() > A; A++) {
            // secound loop check vowels in each letter
            for (int B = 0; vowels.length() > B; B++) {
                if (matcha.charAt(A) == vowels.charAt(B)) {
                    counts++;
                    chest.append(vowels.charAt(B));
                }
            }
        }
        // close scanner for prevent resource leak
        tea.close();
        // show detected vowels and counts
        System.out.println("Vowels detected : " + chest + " \n Total : " + counts);
    }
}