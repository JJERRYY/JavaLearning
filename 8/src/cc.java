import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class cc {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int i= scan.nextInt();
        for (int j=0;j<i;j++) {

            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add((int) (Math.random() * 33 + 1));
            list.add((int) (Math.random() * 33 + 1));
            list.add((int) (Math.random() * 33 + 1));
            list.add((int) (Math.random() * 33 + 1));
            list.add((int) (Math.random() * 33 + 1));
            list.add((int) (Math.random() * 33 + 1));
            Collections.sort(list);
            list.add((int) (Math.random() * 16 + 1));
            System.out.printf("红球: %d %d %d %d %d %d 蓝球:%d\n",list.get(0),list.get(1),list.get(2),list.get(3),list.get(4),list.get(5),list.get(6));
        }
    }
}
