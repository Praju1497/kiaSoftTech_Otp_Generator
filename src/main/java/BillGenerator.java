import java.util.Scanner;

public class BillGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] s = new String[]{"Idly", "Tea", "Coffee", "Colddrink", "Snacks", "Masala Dosa", "Wada", "Milk", "Puff"};
        int[] rate = new int[]{30, 20, 25, 30, 35, 25, 10, 15, 30};
        int[] qt = new int[10];
        int sum = 0;
        boolean quit = true;

        do {
            System.out.println("ITEM" + "\t\tPRICE");
            for (int i = 0; i < s.length; i++){//Use s.length to prevent ArrayIndexOutOfBoundsException
                System.out.println((i + 1) + "." + s[i] + "\t\t" + rate[i]);
            }

            int ch = input.nextInt();
            if (ch > 0 && ch < s.length) {// Adjust the range of valid options

                System.out.println("enter the no of quantities of " + s[ch - 1]);
                int q = input.nextInt();
                qt[ch - 1] += q;

            } else {
                quit = false;
            }
        } while (quit);

        System.out.println("Your orders are:\n");
        for (int i = 0; i < s.length; i++) {
            if (qt[i] != 0) {
                sum += qt[i] * rate[i];
                System.out.println(s[i] + "*" + qt[i] + " = " + qt[i] * rate[i] + "Rs");
            }
        }
        System.out.println("Your total bill = " + sum);

        System.out.println("Thank you !!");
    }
}

