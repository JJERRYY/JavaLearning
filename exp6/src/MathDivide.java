import java.util.Scanner;

public class MathDivide {

    void divide(double b,double c){

        if((int)c%2==1) {
            try {
                throw new OddException(b + "/" + c + "中" + c + "不可以为奇数!");
            } catch (OddException e) {
                e.printStackTrace();
            }
        }else {
            System.out.printf("%.2f/%.2f=%.2f",b,c,b/c);
        }

    }

    public static void main(String[] args) {
        MathDivide m=new MathDivide();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个数");
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        m.divide(b,c);

    }
}
