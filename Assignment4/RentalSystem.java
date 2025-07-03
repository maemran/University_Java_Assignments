
import java.util.Scanner;


public class RentalSystem
{
    private Cars[] cars;
    
    public RentalSystem()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter tne number of cars: ");
        int num = input.nextInt();
        cars = new Cars[num];
        for (int i=0;i<cars.length;i++)
        {
            cars[i] = new Cars();
        }
    }
    
    public RentalSystem(Cars[] cars)
    {
        this.cars = new Cars[cars.length];
        for(int i = 0;i<cars.length;i++)
        {
            this.cars[i] = new Cars(cars[i].getType(),cars[i].getModelYear(),cars[i].getRegNumber());
        }
        
    }

    public Cars[] getCars() 
    {
        return cars;
    }
    
    
    public Cars[]  getAvailableCars()
    {
        Cars[] Array;
        int count = 0;
        for (int i = 0;i< this.cars.length;i++)
        {
            if (this.cars[i].getRentingInfo()== null && this.cars[i].isUnderMaintenance()==false)
            {
               count++;
            }
            
        }
        Array = new Cars[count];
        for (int i = 0,j=0;i< this.cars.length;i++)
        {
            if (this.cars[i].getRentingInfo()== null && this.cars[i].isUnderMaintenance()==false)
            {
              Array[j] = this.cars[i];
              j++;
            }
            
        }
        
        return Array;
    }
    
    public Cars getMostRentedCar()
    {
        int max =this.cars[0].getTotalRentedDays();
        int count=0;
        for(int i =0 ;i< this.cars.length;i++)
        {
            if(this.cars[i].getTotalRentedDays() > max)
            {
                max =  this.cars[i].getTotalRentedDays();
                count=i;
            }
        }
      return cars[count];
    }
    
    
    public Cars pickACar(int modelYear)
    {
        
        int randNum = (int)(Math.random()*(this.cars.length));
       if (this.cars[randNum].getModelYear()>modelYear)
        return this.cars[randNum];
       else
       {
           while(true)
           {
               randNum = (int)(Math.random()*(this.cars.length));
                if (this.cars[randNum].getModelYear()>modelYear)
                {
                    return this.cars[randNum];
                    
                }
           }
               
       }
    }
    
}
