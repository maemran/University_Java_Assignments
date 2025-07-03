
import java.util.Date;
import javax.swing.JOptionPane;


public class Maintenance extends Worker
{
    private String specialty;
    
    
    public Maintenance()
    {
     super();
     specialty = JOptionPane.showInputDialog(null,"Enter the specialty");
     
    }
    
    public Maintenance(String name ,String specialty)
    {
        super(name);
        this.specialty=specialty;
        
    }
    
    public boolean performMaintenance()
    {
        Machine m;
        int j=0;
        for(int i =0;i<getMachines().length;i++)
        {
            if(getMachines()[i].isOperating()==false)
            {
                j=i;
                break;
            }
        }
        m=getMachines()[j];
        int S = JOptionPane.showConfirmDialog(null,"performed successfully or not? yes/no");
        if(S==0)
        {
            m.setLastMaintenace(new Date());
            m.setOperating(true);
            return true;
        }
        else
            return false;
    }
    
    @Override
    public String toString()
    {
        return super.toString()+"\n"+"Specialty "+specialty;
    }
    
    public double evaluate()
    {
        int counter=0;
        for(int i=0;i<getMachines().length;i++)
        {
            if(getMachines()[i].isOperating()==true)
            {
              counter++;
              
            }
        }
        return (getMachines().length/counter)*100;
                
            
    }
    

    
}
