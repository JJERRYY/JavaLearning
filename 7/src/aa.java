import java.util.Arrays;

public class aa {

    public static void main(String[] args) {

        for (int i = 100; i < 999; i++) {
            //i表示第一个两位数a
            for (int j = 100; j < 999; j++) {
                //j表示第二个两位数b
                int product = i * j;
                //获得乘积v=ab
                if (product % 100 != 0 && product > 99999 && product < 1000000) {
                    String[] value1 = String.valueOf(product).split("");
                    String[] value2 = (String.valueOf(i) + String.valueOf(j)).split("");
                    /*为两个带比较序列排序,以便对比原序列字符构成是否完全相同*/
                    Arrays.sort(value1);
                    Arrays.sort(value2);

                    if (Arrays.equals(value1, value2)) {
                        System.out.println(product + "=" + i + "*" + j);

                    }
                }

            }
        }

    }
}
