import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class date {

    public static void main(String[] args) throws ParseException {
        System.out.println("请输入您的出生日期:");
        Scanner s= new Scanner(System.in);
        String str1;
        str1 = s.next();
//        System.out.println("输入的数据为：" + str1);

        SimpleDateFormat df= new SimpleDateFormat("yyyy-MM-dd");
        Date d = df.parse(str1);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        calendar.add(Calendar.YEAR,+18);
        Date d1= calendar.getTime();

//        System.out.println(d1.toString());

        long interval = d1.getTime()-d.getTime();

        System.out.println("高考时出生了"+interval/1000/60/60/24+"天");
//        System.out.println();

    }
}
