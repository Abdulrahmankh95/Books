


import com.alien.enterpriseRFID.reader.AlienClass1Reader;
import com.alien.enterpriseRFID.reader.AlienReaderCommandErrorException;
import com.alien.enterpriseRFID.reader.AlienReaderConnectionException;
import com.alien.enterpriseRFID.reader.AlienReaderException;
import com.alien.enterpriseRFID.reader.AlienReaderNotValidException;
import com.alien.enterpriseRFID.reader.AlienReaderTimeoutException;
import com.alien.enterpriseRFID.tags.Tag;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.Scanner;


public class ReaderConnection {


    public static void main(String[] args) throws AlienReaderNotValidException, AlienReaderTimeoutException, AlienReaderConnectionException, AlienReaderCommandErrorException, AlienReaderException, SQLException {

AlienClass1Reader reader = new AlienClass1Reader(); 
reader.setConnection("192.168.1.3", 23); 
reader.setUsername("alien"); 
reader.setPassword("password"); 

       
        reader.open();
       

                System.out.println(reader.isOpen());
           
        String tagList = reader.getTagID();
     
      //  System.out.println(tagList);

     if (tagList == null) {   
          System.out.println("No Tags Found"); 
      }
       else { 

        //  Borrowing.Borrwowing(tagList);

     }
     
     
     
//          System.out.println("Tag(s) found:"); 
//          for (int i=0; i<tagList.length; i++) { 
//              Tag tag = tagList[i]; 
//              System.out.println("ID:" + tag.getTagID() + 
//                      ", Discovered:" + tag.getDiscoverTime() + 
//                      ", Last Seen:" + tag.getRenewTime() + 
//                      ", Antenna:" + tag.getAntenna() + 
//                      ", Reads:" + tag.getRenewCount()); 
//                           reader.clearTagList();
//
//          }

         reader.close();
    }
}