import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

//1.把stopwords存为hashset1,和hashset2
//2.按单词读取*.txt,将取到的单词试图存入hashset,若成功存入,则hashmap<"xxx",1>,若失败则hashmap<"xxx",++>
//3.hashmap排序
//4.hashmap输出,若无法存入hashset2则为stopwords



public class dddd {

    void puts(File file,HashSet wordslist,HashMap wordmap){
        String strbuffer;
        int value;
        try {

            Scanner sc= new Scanner(file);
            while(sc.hasNext()){
                strbuffer=convert(sc.next());

                if(wordmap.containsKey(strbuffer)){

                    value=(int)wordmap.get(strbuffer);
                    wordmap.put(strbuffer,++value);

                }else {
                    wordmap.put(strbuffer,1);
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    String convert(String strbuffer){

        String s1 =new String();
        for (int i=0;i<strbuffer.length();i++){
            if((strbuffer.charAt(i)>'a'&&strbuffer.charAt(i)<'z')||(strbuffer.charAt(i)>'A'&&strbuffer.charAt(i)<'Z'))
                s1 +=strbuffer.charAt(i);
            else if(strbuffer.charAt(i)=='\''&&i!=strbuffer.length()-1)
                s1 +=strbuffer.charAt(i);
        }
        return s1;

    }



    public static void main(String[] args) {

        HashSet<String> wordslist= new HashSet<>();
        HashSet<String> stoplist= new HashSet<>();
        HashMap<String, Integer> wordmap= new HashMap<>();
        dddd d =new dddd();

        String strbuffer;
        File file = new File("stopwords.txt");
        try {
            Scanner sc= new Scanner(file);
            while(sc.hasNextLine()){
                strbuffer=sc.nextLine();
                wordslist.add(strbuffer);
                stoplist.add(strbuffer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("打开stopwords失败");
        }

        file=new File("Lincoln, Abraham - The Writings of Abraham Lincoln Volume 1.txt");
        d.puts(file,wordslist,wordmap);
        file=new File("Lincoln, Abraham - The Writings of Abraham Lincoln Volume 2.txt");
        d.puts(file,wordslist,wordmap);
        file=new File("Lincoln, Abraham - The Writings of Abraham Lincoln Volume 3.txt");
        d.puts(file,wordslist,wordmap);
        file=new File("Lincoln, Abraham - The Writings of Abraham Lincoln Volume 4.txt");
        d.puts(file,wordslist,wordmap);
        file=new File("Lincoln, Abraham - The Writings of Abraham Lincoln Volume 5.txt");
        d.puts(file,wordslist,wordmap);
        file=new File("Lincoln, Abraham - The Writings of Abraham Lincoln Volume 6.txt");
        d.puts(file,wordslist,wordmap);
        file=new File("Lincoln, Abraham - The Writings of Abraham Lincoln Volume 7.txt");
        d.puts(file,wordslist,wordmap);



        List<Map.Entry<String,Integer>> lst =new ArrayList<Map.Entry<String, Integer>>(wordmap.entrySet()) ;

        Collections.sort(lst, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
            if(o1.getValue()>o2.getValue()) return -1;
            if(o1.getValue()<o2.getValue()) return 1;
                return 0;
            }
        });

        Iterator<Map.Entry<String,Integer>> it = lst.iterator();


        PrintWriter pw = null;
        try {
            pw = new PrintWriter("wordcount.txt");


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        while(it.hasNext()){
            Map.Entry<String,Integer> temp= it.next();
            if(wordslist.contains(temp.getKey())) continue;
            pw.println(temp.getKey()+"  "+temp.getValue());

        }
        System.out.println("111");
    }
}
