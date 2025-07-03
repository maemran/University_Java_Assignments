
import java.util.Date;
import javax.swing.JOptionPane;


public class Machine 
{
   private int ID; 
   private Date lastMaintenace;
   private boolean operating= true;
   private static int productionRate = 1000;
   
   
   public Machine()
   {
       ID = Integer.parseInt(JOptionPane.showInputDialog(null,"put ID"));
       lastMaintenace = new Date();
   }

    public int getID() {
        return ID;
    }

    public Date getLastMaintenace() {
        return lastMaintenace;
    }

    public boolean isOperating() {
        return operating;
    }

    public static int getProductionRate() {
        return productionRate;
    }

    public void setLastMaintenace(Date lastMaintenace) {
        this.lastMaintenace = lastMaintenace;
    }

    public void setOperating(boolean operating) {
        this.operating = operating;
    }

    public static void setProductionRate(int productionRate) {
        Machine.productionRate = productionRate;
    }
   
    
    @Override
    public String toString()
    {
        return "ID: "+ID+"\n"+operate()+"\n"+"last Maintenace"+lastMaintenace;
    }
   
    
    public String operate()
    {
        if(operating==true)
        {
            return "Operating";
        }
        else
            return "Down";
    }
}
