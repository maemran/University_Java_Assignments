
import java.util.Scanner;


public class entingInfo {
    
    private int numOfRentingDay;
    private String  customerName;
    private String  customerMobileNum;
    private static int maxRentingDays = 15;
    
    entingInfo()
    {
        Scanner input = new Scanner (System.in);
        System.out.println("enter the customer name: ");
        customerName = input.nextLine();
        System.out.println("enter the customer mobile number: ");
       customerMobileNum = input.nextLine();
       System.out.println("enter the number of renting day: ");
        int value  = input.nextInt();
        if (value > 0&&value<maxRentingDays)
        {
            numOfRentingDay= value;
            
        }
        else {
            while (true) {
                System.out.println("Number of renting days must be between 0 and " + maxRentingDays);
                value = input.nextInt();
                if (value > 0 && value < maxRentingDays)
                {
                    numOfRentingDay = value;
                    break;

                }

            }
        }

        
    }

    public int getNumOfRentingDay() {
        return numOfRentingDay;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerMobileNum() {
        return customerMobileNum;
    }

    public static int getMaxRentingDays() {
        return maxRentingDays;
    }

    public static void setMaxRentingDays(int maxRentingDays)
    {
        if (maxRentingDays>3)
        {
        entingInfo.maxRentingDays = maxRentingDays;
        }
        else
        {
            System.out.println("Could not modify maximum renting days");
        }
        
        
    }
    
    
}
