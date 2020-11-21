import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SameIntegerTest {
     protected int push(ArrayList<Integer> lst,int num)throws SameIntegerException{
        for (int i=0;i<lst.size();i++){
            if(lst.get(i)==num) {
                    throw new SameIntegerException(num+"作为与已输入的数"+lst+"相同");
            }
        }
        lst.add(num);
        return 0;
    }


    public static void main(String[] args) {
        List<Integer> lst=new ArrayList<>();
        Scanner sc =new Scanner(System.in);
        SameIntegerTest sie=new SameIntegerTest();

        int a;
        System.out.println("请输入10个整数");
        for (int i=0;i<10;i++) {

            a = sc.nextInt();
            try {
                sie.push((ArrayList<Integer>) lst, a);
            } catch (SameIntegerException e) {
                e.printStackTrace();
                System.out.println("请重新输入:");
                i--;
            }

        }

    }
}
