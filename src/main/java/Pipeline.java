import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.Properties;

public class Pipeline {
    private static Properties properties;
    private static String propertiesName ="tokenize , ssplit , 	pos , lemma , ner , parse, sentiment";
    private static StanfordCoreNLP stanfordcoreNLP;

    private Pipeline() { }

    static {
        properties = new Properties();
        properties.setProperty("annotators", propertiesName);
    }

    public static StanfordCoreNLP getPipeline() {
        if(stanfordcoreNLP == null) {
            stanfordcoreNLP = new StanfordCoreNLP(properties);
        }
        return stanfordcoreNLP;
    }
}
