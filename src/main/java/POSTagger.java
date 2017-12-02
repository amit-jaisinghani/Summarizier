/**
 * POSTagger.java
 *
 * @Version: $ Id: POSTagger.java, v 1.0 12/2/2017 2:15 PM $
 * @Revisions: $ Log: Initial Revision $
 */

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.util.CoreMap;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * The {@code POSTagger} class 
 *
 * @author : Amit Shyam Jaisinghani
 * @author : Aditi Shailendra Singhai
 */
public class POSTagger {

    private StanfordCoreNLP pipeline;
    private static POSTagger posTagger;

    private POSTagger() {
        Properties props = new Properties();
        props.setProperty("annotators","tokenize, ssplit, pos");

        pipeline = new StanfordCoreNLP(props);
    }

    public List<Pair<String, String>> getTaggedWords(String text) {
        List<Pair<String, String>> listOfTaggedWords = new ArrayList<>();
        Annotation annotation = new Annotation(text);
        pipeline.annotate(annotation);
        List<CoreMap> sentences = annotation.get(CoreAnnotations.SentencesAnnotation.class);

        for (CoreMap sentence : sentences) {
            for (CoreLabel token: sentence.get(CoreAnnotations.TokensAnnotation.class)) {
                String word = token.get(CoreAnnotations.TextAnnotation.class);
                String pos = token.get(CoreAnnotations.PartOfSpeechAnnotation.class);
                listOfTaggedWords.add(new Pair<>(word, pos));
            }
        }
        return listOfTaggedWords;
    }

    public static POSTagger getInstance() {

        if(posTagger == null)
            posTagger = new POSTagger();

        return posTagger;
    }


}
