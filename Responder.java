import java.util.ArrayList;
import java.util.Random;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 */
public class Responder
{
    
    private ArrayList<String> responses;
    private Random randomGenerator;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        responses = new ArrayList<>();
        randomGenerator= new Random();
         fillResponses();
    }
     private void fillResponses(){
        responses.add("yes");
        responses.add("no");
        responses.add("maybe");
        responses.add("I'll ask my mom");
        responses.add("I do not know");
        responses.add("we will see");
    }
    public void printMultiRandom(int howMany){
        int index=0;
        while(index<howMany){
            System.out.println("New random number["+(index+1)+"]:"+ randomGenerator.nextInt(1000));
            index++;
        }
        
    }
      public String generateResponse(){
        int index= randomGenerator.nextInt(responses.size());
        
        
        return responses.get(index);
}
}

