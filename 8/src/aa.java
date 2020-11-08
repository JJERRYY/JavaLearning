import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class aa {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        ArrayList list =new ArrayList();
        String str="";

        while(true){
            str= scan.next();
            if("-1".equals(str)) break;
            list.add(str);
        }
        Collections.sort(list);

        System.out.println(list);

    }
}
