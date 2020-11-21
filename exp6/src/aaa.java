import java.util.*;

public class aaa {
    public static void main(String[] args) {

    List<String> str=new ArrayList<>();

    Scanner sc=new Scanner(System.in);
    String str1;
    do {
        str1=sc.next();
        str.add(str1);
    }while(!sc.hasNext("0"));

        System.out.println("输入完毕");

        Collections.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println("字典升序排序");
        System.out.println(str);

        Collections.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println("字典降序序排序");
        System.out.println(str);


        Collections.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()>o2.length())  return -1;
                if(o1.length()<o2.length())  return 1;
                return 0;

            }
        });
        System.out.println("按字符串长度排序");
        System.out.println(str);

        Collections.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()>o2.length())  return -1;
                if(o1.length()<o2.length())  return 1;

                return o1.compareTo(o2);

            }
        });
        System.out.println("先按字符串长度降序排列再按字典序排序");
        System.out.println(str);

    }
}
