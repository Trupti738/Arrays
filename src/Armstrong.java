import java.util.Scanner;

public class Armstrong{
        public int Armstrong(int n) {
            int num = n, cubeSum = 0;

        while (num > 0) {
            int digit = num % 10;
            cubeSum = cubeSum + (digit * digit * digit);
            num /= 10;
        }
        if (cubeSum == n)
            return 1;
        else
            return 0;
        }public static void main(String args[]) {
            //make object of scanner class
            Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = scanner.nextInt();

        Armstrong obj = new Armstrong();
        int r = obj.Armstrong(num);
        if (r == 1)
            //put number to check for armstrong
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }
    }

