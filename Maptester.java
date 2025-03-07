import java.util.HashMap;
/**
 * Write a description of class Maptester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Maptester
{
    // instance variables - replace the example below with your own
    private HashMap<String,String> contacts;

    /**
     * Constructor for objects of class Maptester
     */
    public Maptester()
    {
        contacts= new HashMap<>();
        contacts.put("Wallrus","10200");
        contacts.put("tiger","102010");
        contacts.put("dog","10");
        contacts.put("pet","1010");
        contacts.put("cat","101010");
        contacts.put("lyon","100");
        contacts.put("ant","111111");
    }

    public void enterNumber(String name, String number){
        contacts.put(name,number);
        
    }
       public String lookupNumber(String name){
           String number= contacts.get(name);
           return number;
    }

}