
import java.util.Random;
import java.util.HashMap;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 */
public class Responder
{
    private Random randomGenerator;
    private HashMap<String,String>responses;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        responses = new HashMap<>();
        randomGenerator= new Random();
         fillResponsesMap();
    }
     private void fillResponsesMap(){
        responses.put("hi","hello");
        responses.put("I am 6","me too");
        responses.put("dog","cat");
        responses.put("pet","rabbit");
        responses.put("house","dog");
        responses.put("lyon","jungle");
        responses.put("ant","bugs");
       
    }
    public void printMultiRandom(int howMany){
        int index=0;
        while(index<howMany){
            System.out.println("New random number["+(index+1)+"]:"+ randomGenerator.nextInt(1000));
            index++;
        }
        
    }
    private String pickDefaultResponse(){
        return "no idea";
    }

    
    
    
      public String generateResponse(String word){
        String answer = responses.get(word);
         
        if (answer==null){
            answer=pickDefaultResponse();
        }
        return answer;        
}
}

