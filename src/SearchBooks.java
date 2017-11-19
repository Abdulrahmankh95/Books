
import com.alien.enterpriseRFID.reader.AlienClass1Reader;
import com.alien.enterpriseRFID.reader.AlienReaderConnectionException;
import com.alien.enterpriseRFID.reader.AlienReaderException;
import com.alien.enterpriseRFID.reader.AlienReaderNotValidException;
import com.alien.enterpriseRFID.reader.AlienReaderTimeoutException;
import com.alien.enterpriseRFID.tags.Tag;
import javax.swing.JOptionPane;


public class SearchBooks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws AlienReaderNotValidException, AlienReaderTimeoutException, AlienReaderConnectionException, AlienReaderException {
    AlienClass1Reader reader = new AlienClass1Reader(); 
reader.setConnection("192.168.1.3", 23); 
reader.setUsername("alien"); 
reader.setPassword("password"); 

       
          
          
      
        
        while(true){
            reader.open();
             try{
        double x=reader.getTag().getRSSI();
       
        if(x==0.0){
    JOptionPane.showMessageDialog(null, "The book is near ");
            break;

        }
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "The book is far ");

        }
        
       
        }
    }
}
