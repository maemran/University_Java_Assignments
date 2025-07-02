
import java.util.Scanner;

public class Assignment00 {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        int[][] list2D= create2D();
        int[] list1D={10,20,30,40};
        list2D[list2D.length-1] = addNumbersIf(list1D,createArrayFromUser());
        print1D(returnRandomRow(list2D));
        print1D(returnMaxAverageRow(list2D));
        
    }
    
    public static boolean isThere(int[] array,int intNum)
    {
        boolean bool=false;
       
        for(int i=0;i<array.length;i++)
        {
            if (array[i]==intNum)
            {
                bool=true;
                
            }
        }
        if (bool==true)
            return true;
        else
            return false;
    }
    
    
    public static int[] createArrayFromUser()
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter the array size: ");
        int size = input.nextInt();
        int[] array = new int[size];
        int[] remove= new int[(array.length-1)];
        boolean x= false;
        for(int i=0;i<array.length;i++)
        {
            System.out.println("Now enter index number "+(i+1)+" of array: ");
            array[i]=input.nextInt();
            
            if (i != 0) 
            {
                System.arraycopy(array,0,remove,0,i);
                x = isThere(remove, array[i]);
                if (x!=false) 
                {
                    System.out.println("You already entered this value " + array[i] + " please enter another value!");
                    array[i] = input.nextInt();
                }
            }
        }
        
        return array;
    }
    public static int[] createArrayRandom()
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter the array size: ");
        int size = input.nextInt();
        int[] array = new int[size];
        int[] remove= new int[(array.length-1)];
        System.out.println("Please enter two numbers: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        boolean x= false;
        int max,min;
        if (n2>n1)
        {
            max=n2;
            min=n1;
        }
        else 
        {
            max=n1;
            min=n2;
        }
         for(int i=0;i<array.length;i++)
         {
             array[i]=((int)(min+(Math.random()*((max-min)+1))));
             if (i != 0) 
            {
                System.arraycopy(array,0,remove,0,i);
                x = isThere(remove, array[i]);
                if (x!=false) 
                {
                    array[i] = ((int)(min+(Math.random()*((max-min)+1))));
                }
            }
         }
         return array;
    }
    
    
    public static int[] addNumbersIf(int[] array1,int...array2)
    {
        boolean x= false;
        int [] array= new int[(array1.length)+(array2.length)];
        System.arraycopy(array1,0,array,0,array1.length);
        int count =0;
        for(int i =0,j=array1.length;i<array2.length;i++)
        {
            x=isThere(array1,array2[i]);
            if (x==false)
            { 
                array[j]=array2[i];
                j++;
            }
            else 
                count++;
        }
        int[] Array = new int[array.length-count];
        for(int k=0,l=0;k<array.length;k++)
        {
            if(array[k]!=0)
            {
                Array[l]=array[k];
                l++;
            } 
        }
        return Array;
        }
    
    
    public static int[][] create2D()
    {
        System.out.println("Enter number of rows: ");
        Scanner input = new Scanner(System.in);
        int rows =input.nextInt();

        int[][] matrix = new int[rows][];
        for(int i=0;i<rows;i++)
        {
            System.out.println("In this row you want to generate an array randomly or by you: Enter (1:random/2:By user) ");
            int s=input.nextInt();
            if(s==1)
            {
                int[] array1 =createArrayRandom();
                matrix[i]=array1;
            }
            else if(s==2)
            {
                int[] array2 =createArrayFromUser();
                matrix[i]= array2;
            }
           
        }
        return matrix;
    }
    
    
    public static int[]returnRandomRow(int[][] matrix)
    {
        int x=matrix.length;
        int y= ((int)((Math.random()*x)));
        int[] array = matrix[y];
        return array;
    }
    
    
    public static int[]  returnMaxAverageRow(int[][] matrix)
    {
        double average=0,max=0;
        int sum=0,index=0;
        int[] array;
        for (int i = 0; i < matrix.length; i++) 
        {
            for (int j = 0; j < matrix[i].length; j++) 
            {
                sum = sum + matrix[i][j];

            }
            average = ((double) sum / (matrix[i].length));
            if (max < average)
            {
                max = average;
                index =i;
            }
        }
        array = matrix[index];
        return array;
    }
    
    
    
     public static void print1D(int[] array)
     {
           for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
           System.out.println("");
     }
     
     
     public static void print2d(int[][] matrix)
     {
          for (int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
     }
    
    }
