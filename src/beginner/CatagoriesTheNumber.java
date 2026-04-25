package beginner;

import java.util.Scanner;

public class CatagoriesTheNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x = sc.nextInt();

        System.out.println((x > 0) ? 1 : (x < 0) ? -1 : 0);

    }
}
