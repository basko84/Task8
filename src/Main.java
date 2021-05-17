import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num;
        do {
            Scanner in = new Scanner(System.in);
            System.out.print("Please enter a three digit number: ");
            num = in.nextInt();
        } while ((num < 100) || (num > 999));
        int s = MyNum(num);
        System.out.printf("Sum of the numbers of your three digit number: %d \n", MyNum(s));
    }

    private static int MyNum(int num2) {
        int digit1 = num2 / 100;
        int digit = num2 % 100;
        int digit2 = digit / 10;
        int digit3 = digit % 10;
        int sum = digit1 + digit2 + digit3;
        return sum;
    }
}


