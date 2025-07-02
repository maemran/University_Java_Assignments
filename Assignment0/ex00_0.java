
import java.util.Scanner;


public class ex00_0 {

    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the characters ");
        String s1=input.nextLine();
        char ch1 =s1.charAt(0);
        String s2 =input.nextLine();
        char ch2 = s2.charAt(0);
        System.out.println("Enter the number of repetitions ");
        int n =input.nextInt();
        String result="";
        
        if (!((ch1 <= 90 && ch1 >= 65) && ((ch1 <= 90 && ch1 >= 65)))) 
        {
            System.out.println("Wrong input: both characters must be uppercase letters! ");

        }
        else if (ch1 > ch2)
        {
            System.out.println("Wrong input: first letter must be alphabetically before the second! ");
        } 
        else if (!(n > 1 && n < 10)) 
        {
            System.out.println("Wrong input: number of repetitions must be greater than 1 and less than 10");
        } 
        else 
        {
            for (; ch2 >= ch1; ch1++) 
            {
                for (int i = 0; n > i; i++) 
                {

                    result = result + ch1;
                    System.out.printf("%-10s", result);

                }
                System.out.println("\n");
                result = "";

            }
        }
    }
}

