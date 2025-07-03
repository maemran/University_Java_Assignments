
import java.util.Scanner;


public class Main 
{
     public static void main(String[] args) 
     {
         RentalSystem R1 = new RentalSystem();
         Scanner input = new Scanner(System.in);
         System.out.println("What to do:\n1.Rent a car\n2.Return a car\n3.Print most rented car\n4.Print all available cars\n5.Exit");
         int choice = input.nextInt();
         if (choice <=0||choice>5)
         {
             System.out.println("Wrong choice");
         }
         else if(choice==5)
         {
             return;
         }
         else
         {
         while (true)
         {
         switch (choice)
         {
             
             case 1:
                 boolean x;
                 System.out.println("Enter the model year: ");
                 int modelYear = input.nextInt();
                 Cars c1;
                 c1 = R1.pickACar(modelYear);
                 printCar(c1);
                 x= c1.setRentingInfo();
                 break;
             case 2:
                 boolean y;
                 System.out.println("Enter the registration number:");
                 int regNum = input.nextInt();
                 int index=0;
                 for (int i = 0;i< R1.getCars().length;i++)
                 {
                     if (R1.getCars()[i].getRegNumber()==regNum)
                     {
                         index = i;
                     }
                 }
                 
                 y= R1.getCars()[index].resetRentingInfo();
                 break;
                 
             case 3:
                 Cars c2;
                 c2 = R1.getMostRentedCar();
                 printCar(c2);
                 break;
                 
             case 4:
                 Cars[] c;
                 c= R1.getAvailableCars();
                 System.out.printf("%-30s%-30s%-30s%-30s","Car Registration Number","Car Type",
                         "Car Model Year","Total Rented days");
                 System.out.println("");
                 for(int i = 0;i<c.length;i++)
                 {
                 System.out.printf("%-30s%-30s%-30s%-30s\n",c[i].getRegNumber(),c[i].getType(),c[i].getModelYear(),c[i].getTotalRentedDays());
                 }
                 break;
                 
             case 5:
                 return;
                 
         }
         System.out.println("What to do :\n1.Rent a car\n2.Return a car\n3.Print most rented car\n4.Print all available cars\n5.Exit");
         choice = input.nextInt();
         if (choice <=0||choice>5)
         {
             System.out.println("Wrong choice");
             
         }
         }
         
         }
     }
     
     
     public static void  printCar(Cars car)
     {
         System.out.println("Car type:"+car.getType()+"\nCar registration number: "
                 + car.getRegNumber()+"\nCar model year: " + car.getModelYear());
         
         if (car.isUnderMaintenance()==true)
         {
             System.out.println(" Car is under maintenance");
         }
         else
             System.out.println("Car is not under maintenance");
         if(car.getRentingInfo()==null)
         {
             System.out.println("The car is not rented");
         }
         else
             System.out.println("The car is rinted to: "+ car.getRentingInfo().getCustomerName()
             +"   "+car.getRentingInfo().getCustomerMobileNum()+"   "+car.getRentingInfo().getNumOfRentingDay());
     }
}
