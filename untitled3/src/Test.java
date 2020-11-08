import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {

    public static void main(String[] args) throws Exception {

        //格式化日期的对象(转化成习惯的时间格式)
        SimpleDateFormat sdFormat=new SimpleDateFormat("yyyy年MM月dd日");

        //静态方法getInstance()使用默认时区和语言环境获得一个日历。
        Calendar calendar=Calendar.getInstance();

        //输出当前系统时间;
        System.out.println("当前系统时间: "+sdFormat.format(calendar.getTime()));

        //add()增加日期，以天为单位（Calendar封装了很多静态的操作时间的单位）
        //增加10天，负数则为减少天数
        calendar.add(Calendar.DATE,10);

        //输出增加10天后的时间;
        System.out.println("增加10天后的时间: "+sdFormat.format(calendar.getTime()));

        //输出3个月前的时间;
        calendar.add(Calendar.MONTH, -3);
        System.out.println("3个月前的时间: "+sdFormat.format(calendar.getTime()));

        //输出时间为2020年的第100天
        Date date=sdFormat.parse("2020年01月01日");
        calendar.setTime(date);
        calendar.add(Calendar.DATE, 99);
        System.out.println("2020年的第100天: "+sdFormat.format(calendar.getTime()));
    }

}