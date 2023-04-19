import java.util.Scanner;

public class FiveDigit {

    public static void main(String args[])
    {
        int n, reverse = 0;

        System.out.println("Enter five digit number to reverse");
        Scanner scanner= new Scanner(System.in);
        n = scanner.nextInt();

        while(n != 0)
        {
            reverse = reverse * 10;
            reverse = reverse + n%10;
            n = n/10;
        }
        //check for reverse number

        System.out.println("Reverse of the number is " + reverse);
    }
}

