/**
 * Main.java
 *
 * @Version: $ Id: Main.java, v 1.0 12/2/2017 12:53 PM $
 * @Revisions: $ Log: Initial Revision $
 */

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.util.CoreMap;

import java.util.List;
import java.util.Properties;

/**
 * The {@code Main} class 
 *
 * @author : Amit Shyam Jaisinghani
 * @author : Aditi Shailendra Singhai
 */
public class Main {

    public static void main(String[] args) {
        Properties props = new Properties();
        props.setProperty("annotators","tokenize, ssplit, pos");

        StanfordCoreNLP pipeline = new StanfordCoreNLP(props);
        Annotation annotation = new Annotation("I'm so happy about my marks");
        pipeline.annotate(annotation);
        List<CoreMap> sentences = annotation.get(CoreAnnotations.SentencesAnnotation.class);
        for (CoreMap sentence : sentences) {
            for (CoreLabel token: sentence.get(CoreAnnotations.TokensAnnotation.class)) {
                String word = token.get(CoreAnnotations.TextAnnotation.class);
                String pos = token.get(CoreAnnotations.PartOfSpeechAnnotation.class);
                System.out.println(word + "\t" + pos);
            }
        }
    }

}
