import java.util.Scanner;

public class Ascending {
    public static void main(String[] args)
    {
        int n, temp;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = scanner.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++)
        {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        //put number and check for ascending order
        System.out.print("Ascending Order:");
        for (int i = 0; i < n - 1; i++)
        {
            System.out.println(a[i] + ",");
        }
        System.out.println(a[n - 1]);
    }
}

