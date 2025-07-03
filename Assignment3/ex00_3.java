
import java.util.Scanner;


public class ex00_3 {

    public static void main(String[] args) 
    {
     Polygon p1 = new Polygon();
     Polygon p2 = new Polygon("Red",true,4);
     Polygon p3 = new Polygon("Blue",true,new double[]{1,2,2,4,4});
     
     p2.convert();
     p3.convert();
     
      System.out.printf("%-20s%-20s%-40s%-20s%-20s%-20s%-20s\n","Polygon#","# of sides","sides-lengths","Color","Filled","Equilateral?","Perimeter" );
      System.out.printf("%-20s%-20s%-40s%-20s%-20s%-20s%-20s\n",1,p1.sidesLengths.length,SidesLength(p1.sidesLengths),p1.color,YeN(p1),YeNo(p1),p1.getPerimeter() );
      System.out.printf("%-20s%-20s%-40s%-20s%-20s%-20s%-20s\n",2,p2.sidesLengths.length,SidesLength(p2.sidesLengths),p2.color,YeN(p2),YeNo(p2),p2.getPerimeter() );
      System.out.printf("%-20s%-20s%-40s%-20s%-20s%-20s%-20s\n",3,p3.sidesLengths.length,SidesLength(p3.sidesLengths),p3.color,YeN(p3),YeNo(p3),p3.getPerimeter() );
      
      
     
    }
    
    
    public static String YeNo(Polygon p)
    {
        if (p.isEquilateral()==true)
            return "yes";
        else
            return "No";
    
    }
    
    public static String YeN(Polygon p)
    {
         if(p.filled==true)
            return "yes";
        else
            return "NO";
    }
    
    public static String SidesLength(double[] Array)
    {
        String Sides="";
        for (int i=0;i<Array.length;i++)
        {
            Sides=Sides+Array[i]+" ";
        }
        return Sides;
    }
}

 class  Polygon
 {
     String color = "Black";
     boolean filled = true;
     double[] sidesLengths = new double[]{1.0,1.0,1.0,1.0};
    
     
     Polygon()
     {
         Scanner input = new Scanner(System.in);
         System.out.println("What is the polygon color? ");
         color = input.nextLine();
         System.out.println("Is the polygon filled (Y/N)? ");
          String awnser =input.nextLine();
           char x= awnser.charAt(0);
         while(true)
         {
             if (x!='y'&&x!='Y'&&x!='N'&&x!='n')
             {
                 System.out.println("Is the polygon filled (Y/N)? ");
                 awnser =input.nextLine();
                 x= awnser.charAt(0);
             }
             else
             {
                 if (x=='y'||x=='Y')
                 {
                     filled = true;
                     break;
                 }
                 else if (x=='N'|| x=='n')
                 {
                     filled = false;
                 break;
                 }
             }
         }
         
         System.out.println("Enter the number of sides: ");
         int sides = input.nextInt();
         while(true)
         {
             if (!(sides>=3&& sides<10))
             {
                 System.out.println("Enter the number of sides between 3 and 10: ");
                 sides = input.nextInt();
             }
             else 
                 break;
             
         }
         
         double[] sideLen = new double[sides];
         for (int i =0;i< sideLen.length;i++)
         {
             System.out.println("Enter the length of side "+(i+1));
             sideLen[i]= input.nextDouble();
             while(true)
             {
             if(sideLen[i]<=0)
             {
                 System.out.println("Enter the length of side "+(i+1)+" again: ");
                 sideLen[i]= input.nextDouble();
             }
             else 
                 break;
             }
             
             
         }
         sidesLengths= sideLen;
     }
     
     
     Polygon(String c,boolean f,int number)
     {
         color = c;
         filled = f;
         if (!(number>=3&& number<10))
             sidesLengths = new double[]{1.0,1.0,1.0,1.0};
         else
             sidesLengths = new double[number];
         
         for (int i=0;i<sidesLengths.length;i++)
             sidesLengths[i]=1;
             
         
     }
     
     
    Polygon(String c,boolean f,double[] values)
    {
        color = c;
        filled = f;
       double[] newArray = new double[values.length];
       System.arraycopy(values,0,newArray,0,values.length);
       if (!(newArray.length>=3&& newArray.length<10))
          sidesLengths = new double[]{2.0,2.0,2.0};
       else
           sidesLengths=newArray;
    }
    
    boolean isEquilateral()
    {
        int count=0;
        for (int i=0;i< sidesLengths.length;i++)
        {
           if (sidesLengths[0]==sidesLengths[i])
           count++;
           
        }
        if(count==sidesLengths.length)
            return true;
        else
            return false;
    }
    
    
    double getPerimeter()
    {
        double sum =0;
        for (int i=0 ; i< sidesLengths.length;i++)
        {
            sum = sum + sidesLengths[i];
        }
        return sum;
    }
     
     void convert()
     {
         Scanner input = new Scanner (System.in);
         System.out.println("Enter number to convert number of sides: ");
         int num = input.nextInt();
         
         if(!(num<3||num>9))
         {
         if (num>sidesLengths.length)
         {
             double[] Array1 = new double[num];
             System.arraycopy(sidesLengths,0,Array1,0,sidesLengths.length);
             for (int i = sidesLengths.length;i<Array1.length;i++)
             {
                 System.out.println("enter size number "+(i+1));
                 Array1[i] = input.nextDouble();
              }
             sidesLengths=Array1;
         }
         else if (num<sidesLengths.length)
         {
              double[] Array2 = new double[sidesLengths.length-num];
              System.arraycopy(sidesLengths,0,Array2,0,Array2.length);
              sidesLengths=Array2;
         }
         else if (num==sidesLengths.length)
         {
             System.out.println("No change on number of sides: polygon already has requested number of sides!");
         }
         
     }
         else
         {System.out.println("No change on number of sides: invalid requested number of sides");}
     }
     
     }
     
     
 