import java.text.SimpleDateFormat;
import java.util.Date;

public class date {

    public static void main(String[] args) {
        Date d=new Date();
        System.out.println("当前时间:"+d.toString());//得到当前时间
        System.out.println("gettime:"+d.getTime());//1970.0.0到现在的秒数

        SimpleDateFormat s1=new SimpleDateFormat("yy-MM-dd hh-mm-ss");
        Date zero = new Date(50);
        System.out.println("用0作为构造方法，得到的日期是:"+zero);
    }
}
