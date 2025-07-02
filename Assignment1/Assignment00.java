
import java.util.Scanner;


public class Assignment00 {

    public static void main(String[] args)
    {
        
        printMenu();
        String s1="";
        Scanner input =new Scanner (System.in);
         String x= input.nextLine();
            char c =x.charAt(0);
            //If you write F before writing a number or character
            if (c=='F')
                return;
            else
            {
        for (int i=0;i<10;)
        {
           
            if(c=='U')
            {
               char char1 = getRandomLetter(true); 
                s1=s1+char1;
            }
            else if(c=='L')
            {
                char char2 = getRandomLetter(false); 
                s1=s1+char2;
            }
            else if (c=='N')
            {
                int n1 = getRandomNumber();
                s1=s1+n1;
                
            }
            else if (c=='F')
            {
                System.out.println("Do you want to print your string repeated? (Y,y/N,n)");
                String Ans=input.nextLine();
                char ans = Ans.charAt(0);
                if (ans=='Y'||ans=='y')
                {
                    System.out.println("How many times do you want to repeat the message?");
                    int repetNums =input.nextInt();
                    System.out.println(repeatString(s1,repetNums));
                    break;
                }
                else if (ans=='N'||ans=='n')
                {
                    System.out.println(s1);
                    break;
                }
            }
            else 
            {
                System.out.println("Please enter one of the supported operations!");
                 printMenu();
                 
            }
          x= input.nextLine();
            c =x.charAt(0);
        }
            }
    }
    public static char getRandomLetter(boolean x)
    {
        if (x==true)
            return (char)(65+(Math.random()*26));
        else 
            return (char)(97+(Math.random()*26));
            
    }
    public static int getRandomNumber()
    {
        return ((int)(Math.random()*10));
    }
    public static String repeatString(String s,int n)
    {
        String x="";
        for (int i=0;i<n;i++)
        {
         x= x+(s+"\n");   
        }
        return x;
    }
    public static void printMenu()
    {
        System.out.println("Choose what do you want to add to your string:\nU: Uppercase Letter.\nL: Lowercase Letter.\nN: Number between 0-9.\n\nPress F if you want to finish forming your string.");
    }
}
