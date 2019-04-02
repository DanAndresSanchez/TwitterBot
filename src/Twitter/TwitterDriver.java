package Twitter;
/**
 * Twitter Driver and Client
 * 
 * @author Ria Galanos
 * @author Tony Potter
 * Original idea by Ria Galanos, whose documentation and source can be found at
 * https://github.com/riagalanos/cs1-twitter
 * 
 **/
import twitter4j.TwitterException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class TwitterDriver
{
	private static PrintStream consolePrint;
	static RandomSentences rs = new RandomSentences();
    
    
    public static void main (String []args) throws TwitterException, IOException{
         Twitterer bigBird = new Twitterer(consolePrint);
         sendTweet(bigBird, 3000);
    }        

	static void sendTweet(Twitterer bird, int amount) throws TwitterException, IOException {
        for(int i = 0; i < amount; i++) {
       	 	String message = rs.makeSentence();
       	 	bird.tweetOut(message); 
        }
    }
}    
         
   