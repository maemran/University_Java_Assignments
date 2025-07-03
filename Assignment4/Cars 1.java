
import java.util.Scanner;


public class Cars 
{
private String type;
private int modelYear;
private int regNumber;
private boolean underMaintenance = false;
private entingInfo rentingInfo = null;
private int totalRentedDays = 0;


public Cars()
{
Scanner input = new Scanner(System.in);
    System.out.println("Enter the type:");
    type = input.nextLine();
    System.out.println("Enter tne model year:");
    modelYear = input.nextInt();
    System.out.println("Enter tne Reg number:");
    regNumber = input.nextInt();

}

public Cars(String type,int modelYear,int regNumber)
{
this.type= type;
this.modelYear= modelYear;
this.regNumber=regNumber;
}

    public String getType() {
        return type;
    }

    public int getModelYear() {
        return modelYear;
    }

    public int getRegNumber() {
        return regNumber;
    }

    public boolean isUnderMaintenance() {
        return underMaintenance;
    }

    public int getTotalRentedDays() {
        return totalRentedDays;
    }

    public void setUnderMaintenance(boolean underMaintenance) {
        this.underMaintenance = underMaintenance;
    }

    public boolean setRentingInfo() 
    {
        if (rentingInfo==null)
        {
            rentingInfo= new entingInfo();
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean resetRentingInfo()
    {
        if (rentingInfo!=null)
        {
            totalRentedDays = totalRentedDays + rentingInfo.getNumOfRentingDay();
            rentingInfo= null;
            return true;
        }
        else
            return false;
    }

    public entingInfo getRentingInfo() {
        return rentingInfo;
    }
    
    

    


   
}
