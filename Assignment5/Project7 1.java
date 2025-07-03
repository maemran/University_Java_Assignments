
import javax.swing.JOptionPane;


public class Project7 
{
    public static void main(String[] args) 
    {
        Machine[] m1 = new Machine[6];
        for(int i=0;i<m1.length;i++)
        {
            m1[i] = new Machine();
        }
        for(int i=0;i<m1.length;i++)
        {
            JOptionPane.showMessageDialog(null, m1[i].toString());
        }
        
        Operator o1 = new Operator("Ahmad Saleem",5);
        Maintenance M1 = new Maintenance("Saad Mohammad","Mechanics");
        for (int i=0;i<m1.length;i++)
        {
        o1.addMachine(m1[i]);
        M1.addMachine(m1[i]);
        }
        
        JOptionPane.showMessageDialog(null,"******break******");
        
        for(int i=0;i<o1.getMachines().length;i++)
        {
            JOptionPane.showMessageDialog(null,o1.getMachines()[i]);
            //JOptionPane.showMessageDialog(null,M1.getMachines()[i]);
        }
        
        
        JOptionPane.showMessageDialog(null, M1.toString());
        JOptionPane.showMessageDialog(null, o1.toString());
        
        M1.performMaintenance();
        JOptionPane.showMessageDialog(null, M1.evaluate()+"");
       
         o1.reportNotWorking();
        
          
      JOptionPane.showMessageDialog(null, o1.evaluate()+"");
        o1.addOverTime(4);
        
         JOptionPane.showMessageDialog(null,o1.toString());
        for(int i=0;i<o1.getMachines().length;i++)
        {
            JOptionPane.showMessageDialog(null,o1.getMachines()[i].toString());
            
        }
        
        JOptionPane.showMessageDialog(null,"******break******");
        
        JOptionPane.showMessageDialog(null,M1.toString());
         for(int i=0;i<o1.getMachines().length;i++)
        {
           JOptionPane.showMessageDialog(null,M1.getMachines()[i].toString());
            
        }
        
        
        
    }
}
