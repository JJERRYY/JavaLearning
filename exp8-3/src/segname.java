import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;


import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.corpus.tag.Nature;
import com.hankcs.hanlp.dictionary.stopword.CoreStopWordDictionary;
import com.hankcs.hanlp.model.crf.CRFLexicalAnalyzer;
import com.hankcs.hanlp.seg.common.Term;
import com.hankcs.hanlp.tokenizer.SpeedTokenizer;


public class segname {

    public static void main(String[] args) throws IOException {
        File file = new File("三国演义(罗贯中).txt");
        Scanner sc =new Scanner(file);
        HashMap<String, Integer> counter = new HashMap<>();
        CRFLexicalAnalyzer analyzer = new CRFLexicalAnalyzer();

        while(sc.hasNextLine()){
            List<Term> segmentlist= HanLP.segment(sc.nextLine());
            CoreStopWordDictionary.apply(segmentlist);
            for(Term term: segmentlist){
                if(term.nature == Nature.nr)
                Hashadd(counter,term.word);
            }
        }



        List<Map.Entry<String,Integer>> countlist =new ArrayList<Map.Entry<String,Integer>>(counter.entrySet());
        countlist.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if(o1.getValue()>o2.getValue()) return -1;
                if(o1.getValue()<o2.getValue()) return 1;
                return 0;
            }
        });
        File file2 = new File ("三国演义人名词频.txt");
        file2.createNewFile();
        FileOutputStream fos = new FileOutputStream(file2);

        for(Map.Entry<String,Integer> o:countlist){
            String str = o.getKey()+"\t"+o.getValue()+"\n";
            fos.write(str.getBytes("utf-8"));
            fos.flush();
        }

        fos.close();




        System.out.println("end");

    }

    static void Hashadd(HashMap<String,Integer> counter,String word){
        if(counter.containsKey(word)) {
            int value =counter.get(word);
            counter.put(word,value+1);
        }else counter.put(word,1);
    }

}