import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Demo {
    static void find_subStr(String string) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < string.length() - 1; i++) {
            for (int j = i + 1; j < string.length(); j++) {
                String sub_str = string.substring(i, j);
                if (!map.containsKey(sub_str)) {
                    map.put(sub_str, 1);
                } else {
                    Integer num = map.get(sub_str);
                    num++;
                    map.put(sub_str, num);
                }
            }
        }

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String str;
        System.out.println("请输入字符串:");
        Scanner input = new Scanner(System.in);
        str = input.next();
        find_subStr(str);
    }
}

