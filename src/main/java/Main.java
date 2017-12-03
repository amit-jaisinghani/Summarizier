/**
 * Main.java
 *
 * @Version: $ Id: Main.java, v 1.0 12/2/2017 12:53 PM $
 * @Revisions: $ Log: Initial Revision $
 */

import javafx.util.*;
import org.apache.lucene.search.Weight;

import java.util.*;

/**
 * The {@code Main} class 
 *
 * @author : Amit Shyam Jaisinghani
 * @author : Aditi Shailendra Singhai
 */
public class Main {
    public static void main(String[] args) {
        if (args.length == 0)
            return;

        String inputParagraph = args[0];
        System.out.println("Input : " + inputParagraph);
            /*"After I pulled the trigger and recovered from the recoil, I slowly refocused my eyes on the target. There it was—a tiny but distinct circle next to the zombie's eye, the first bullet hole I'd ever made. I looked down at the shaking Glock 19 in my hands. A swift and strong emotional transformation swept over me. In seconds, I went from feeling nervous, even terrified, to exhilarated and unassailable—and right then I understood why millions of Americans believe guns keep them safe.\n" +
            "I was standing in a shooting range 15 miles south of Kennesaw, Ga., a place known as “America's Gun City” because of a law requiring residents to own firearms. It was day two of a four-day road trip I'd embarked on to investigate a controversial and popular claim made by the gun lobby: that more guns protect more people from crime.\n" +
            "Guns took more than 36,000 U.S. lives in 2015, and this and other alarming statistics have led many to ask whether our nation would be better off with firearms in fewer hands. Yet gun advocates argue exactly the opposite: that murders, crimes and mass shootings happen because there aren't enough guns in enough places. Arming more people will make our country safer and more peaceful, they say, because criminals won't cause trouble if they know they are surrounded by gun-toting good guys.";*/
        POSTagger posTagger = POSTagger.getInstance();
        System.out.println("Output : " + WeightageNLP.GetSummarizedParagraph(WeightageNLP.GetWeightage(posTagger.getTaggedWords(inputParagraph))));
    }
}