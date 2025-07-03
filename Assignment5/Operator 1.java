
import javax.swing.JOptionPane;

public class Operator extends Worker
{
    private int experience;
     private double overtime;
     
     
     public Operator()
     {
        super();
         experience =Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the experience"));
     }
     
     public Operator(String name,int  experience)
     {
         super(name);
         this.experience= experience;
     }
     
     public void addOverTime(double time)
     {
         overtime= overtime+time;
     }
     
     public void reportNotWorking()
     {
         int number = Integer.parseInt(JOptionPane.showInputDialog(null,"enter the ID"));
         for(int i=0;i<getMachines().length;i++)
         {
             if(getMachines()[i].getID()==number)
             {
                getMachines()[i].setOperating(false);
                break;
             }
         }
     }
     
     
     @Override
     public String toString()
     {
         return super.toString()+"\n"+"Experience "+experience+"\n"+"Over time "+overtime;
     }
     
     
     public double evaluate()
     {
         return (overtime/(40+overtime))*100;
     }
             
}
