/**
 * Main.java
 *
 * @Version: $ Id: Main.java, v 1.0 12/2/2017 12:53 PM $
 * @Revisions: $ Log: Initial Revision $
 */

import javafx.util.*;
import java.util.*;

/**
 * The {@code Main} class 
 *
 * @author : Amit Shyam Jaisinghani
 * @author : Aditi Shailendra Singhai
 */
public class Main {
    public static void main(String[] args) {

        String inputParagraph = "A topic sentence usually comes at the beginning of a paragraph; that is, it is usually the first sentence in a formal academic paragraph.  (Sometimes this is not true, but as you practice writing with this online lesson site, please keep to this rule unless you are instructed otherwise.)  Not only is a topic sentence the first sentence of a paragraph, but, more importantly, it is the most general sentence in a paragraph.  What does \"most general\" mean?  It means that there are not many details in the sentence, but that the sentence introduces an overall idea that you want to discuss later in the paragraph. ";
        POSTagger posTagger = POSTagger.getInstance();
        List<Pair<String, String>> temp = posTagger.getTaggedWords(inputParagraph);
        System.out.println(temp);
        System.out.println(WeightageNLP.GetWeightage(temp));
    }
}