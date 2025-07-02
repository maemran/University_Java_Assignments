
import java.util.Scanner;


public class Assignment01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integer number: ");
        int num1 = input.nextInt();
        System.out.println("Enter the power of 10: ");
        int num2 = input.nextInt();
        int i, r, n, m, numStatus;

        for (i = 10; num2 >= i;) 
        {
            i = i * 10;
        }
        r = (i / 10);
        n = num2 - r;
        if (n != 0) 
        {
            System.out.println("Sorry, this integer must be a power of ten");
        } 
        else if (num2 > num1) 
        {
            System.out.println("Sorry, second integer must be less than the first integer");
        }
        else
        {
            m = num1 / num2;
            numStatus = num1 - (m * num2);
            //If the number preceding the number to be rounded is greater than five or equal to five, rounding is permitted
            if (numStatus >= ((5 * num2) / 10))
            {
                System.out.println(num1 + " rounded to the nearest " + num2 + " is " + ((m * num2) + num2));
            } 
            //If the number preceding the number to be rounded is less than five, rounding is not permissible
            else if (numStatus < ((5 * num2) / 10)) 
            {

                System.out.println(num1 + " rounded to the nearest " + num2 + " is " + ((m * num2)));

            }

        }

    }
}
