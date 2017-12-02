import javafx.util.Pair;

import java.util.*;

public class WeightageNLP {
    private static HashMap<String, Integer> weightage;

    static {
        weightage = new HashMap<String, Integer>();
        for (NLPSpeechTags a:
             NLPSpeechTags.values()) {
            if (a.toString().startsWith("VBZ"))
                weightage.put(a.toString(), 4);
            else if ((a.toString().startsWith("V")) || (a.toString().startsWith("P")))
                weightage.put(a.toString(), 1);
            else if (a.toString().startsWith("N"))
                weightage.put(a.toString(), 2);
            else if (a.toString().startsWith("J"))
                weightage.put(a.toString(), 3);
            else
                weightage.put(a.toString(), 4);
        }
    }

    public static List<Pair<String, Integer>> GetWeightage(List<Pair<String, String>> taggedWords) {
        List<Pair<String, Integer>> wordsWeightage = new ArrayList<Pair<String, Integer>>(taggedWords.size());
        for (Pair<String, String> a:
             taggedWords) {
            String wordType = a.getValue();
            if (weightage.containsKey(wordType))
                wordsWeightage.add(new Pair<String, Integer>(a.getKey(), weightage.get(wordType)));
        }
        return wordsWeightage;
    }
}

enum NLPSpeechTags {
    CC,
    CD,
    DT,
    EX,
    FW,
    IN,
    JJ,
    JJR,
    JJS,
    LS,
    MD,
    NN,
    NNS,
    NNP,
    NNPS,
    PDT,
    POS,
    PRP,
    PRP$,
    RB,
    RBR,
    RBS,
    RP,
    SYM,
    TO,
    UH,
    VB,
    VBD,
    VBG,
    VBN,
    VBP,
    VBZ,
    WDT,
    WP,
    WP$,
    WRB
}