/**
 * Main.java
 *
 * @Version: $ Id: Main.java, v 1.0 12/2/2017 12:53 PM $
 * @Revisions: $ Log: Initial Revision $
 */

/**
 * The {@code Main} class 
 *
 * @author : Amit Shyam Jaisinghani
 * @author : Aditi Shailendra Singhai
 */
public class Main {

    public static void main(String[] args) {

        POSTagger posTagger = POSTagger.getInstance();
        System.out.println(posTagger.getTaggedWords("I'm so happy about my marks"));

    }

}
