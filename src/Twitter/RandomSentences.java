package Twitter;
/**
 * File $CISC367HOME/example-progs/randomSentences/RandomSentences.java
 *
 * This program mimics the corresponding C++ program found in the file
 * RandomSentences.cc in the same directory.  Although this program is 
 * written in the "pure" object-oriented language Java, it is not object
 * oriented any more than the C++ is object oriented.  It does not make
 * use of any natural objects.
 *
 * For contrast, see the file RandomSent.java, in the same directory, which
 * defines an object RandomSent for generating random sentences that is
 * modeled on the class java.util.Random for generating random numbers.
 *
 * The class RandomSent is then used in the file RSClassTester.java to 
 * generate the random sentences.  The programs in the two files
 * RandomSent.java and RSClassTester.java reflect much better oo design
 * than the program found in RandomSentences.java.  Also note that the
 * public interface of the class RandomSent is similar to that of 
 * java.util.Random thereby making it easier to use for someone already
 * familiar with the "standard" class Random.
 */

import java.util.Random;

public class RandomSentences{

    final static int NO_WORDS = 5;	// These constants must be static
    final static int NO_SENTS = 20;	// if they are going to be used in
    final static String SPACE = " ";	// a static method like main().
    final static String PERIOD = ".";
    
    String article[] = { "the", "a", "one", "some", "any" , "@WilliamsRyan__"};
    String noun[] = { "@WilliamsRyan__", "boy", "girl", "dog", "town", "car" , "Bucky", "Bucknell", 
    				"@BucknellU", "cheese", "stadium", "school", "class", "fish", "flour", "flour",
    				"ocean", "money", "love", "chicken", "frat", "book", "bro", "daddy", "you",
    				"'Hi, my name is Ryan Williams and I like to flex'", "@WilliamsRyan__"};
    String verb[] = { "@WilliamsRyan__","drove", "jumped", "ran", "walked", "skipped" , "@WilliamsRyan__", "act", "send", "climb",
    				"dream", "laugh", "leave", "cheer", "play", "sit", "lift", "insult", "buy", "call", "listen",
    				"make", "pass", "biuld", "@WilliamsRyan__"};
    String preposition[] = {"to", "from", "over", "under", "on" , "@WilliamsRyan__", "aboard", "about", "across"
    					, "as", "before", "behind", "but", "down", "for", "except" , "in", "like", "mid",
    					"next", "on", "round", "since", "date", "@WilliamsRyan__"};
    String sentence;
        
    Random r = new Random();

    public String makeSentence() {
    		sentence = "";
            sentence = article[rand()];
            char c = sentence.charAt(0);
            sentence = sentence.replace( c, Character.toUpperCase(c) );
            sentence += SPACE + noun[rand()] + SPACE;
            sentence += (verb[rand()] + SPACE + preposition[rand()]);
            sentence += (SPACE + article[rand()] + SPACE + noun[rand()]);
            if(!sentence.contains("@WilliamsRyan__"))
            	sentence += " @WilliamsRyan__";
            sentence += PERIOD;
            //System.out.println(sentence);
            
        return sentence;
    }

    int rand(){
        int ri = r.nextInt() % NO_WORDS;
        if ( ri < 0 )
            ri += NO_WORDS;
        return ri;
    }
}

/**
 * Further commentary on the above code
 *
 * Note that the method used to capitalize the first article is not a 
 * general method.  If the article were "that", for example, the code
 * would change it into "ThaT".
 *
 * A better solution would be to provide a method
 *   String capitalizeCharAt( int index )
 * that would return a new String with the char at the specified location
 * capitalized.
 */

