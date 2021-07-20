package AssignmentsKPI;
import java.util.Scanner;

public class Assignment1 {
    static void getSum(int N) {

        int evenSum = 0;
        int oddSum = 0;
        for (int i = 1; i <= N; i++) {
            if (i%2 == 0)
                evenSum += i;
            else
                oddSum += i;

        }
        System.out.println("Sum of even numbers:"+evenSum);
        System.out.println("Sum of odd numbers:"+oddSum);

    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Natural numbers:");
        int num = sc.nextInt();
        getSum(num);
    }
}
