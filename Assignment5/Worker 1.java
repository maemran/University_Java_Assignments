
import java.util.Arrays;
import javax.swing.JOptionPane;


public class Worker 
{
    private String name;
    private Machine[] machines;
    
    
    public Worker()
    {
        name = JOptionPane.showInputDialog(null,"Enter the name");
       machines = new Machine[0];
        
    }
    
    public Worker(String name)
    {
        this.name=name;
        machines = new Machine[0];
    }
    
    
    public void addMachine(Machine  machine)
    {
        
        Machine[] Array = new Machine[machines.length+1];
        System.arraycopy(machines, 0, Array, 0, machines.length);
        Array[Array.length-1]=machine;
        int[] array = new int[Array.length];
        for(int i=0;i<Array.length;i++)
        {
            array[i]= Array[i].getID();
        }
        Arrays.sort(array);
        Machine[] aray = new Machine[Array.length];
        for(int i=0;i<Array.length;i++)
        {
            for(int j =0;j<Array.length;j++)
            {
            if(array[i]==Array[j].getID())
            {
             aray[i]=Array[j];
            }
            }       
        }
        machines=aray;
        
    }

    public String getName() {
        return name;
    }

    public Machine[] getMachines() {
        return machines;
    }
    
    
    @Override
    public String toString()
    {
        return "Name: "+name+"\n"+"Number of machines responsible for: "+machines.length;
    }
}
