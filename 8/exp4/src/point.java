import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class point implements Comparable{
    double x,y,z;
    double d;


    public point(double x,double y,double z){
        this.x=x;
        this.y=y;
        this.z=z;
        this.d=distance(x,y,z);

    }
    double distance(double x,double y,double z){
        this.d=Math.sqrt(Math.pow(x,2)+Math.pow(y,2)+Math.pow(y,2));
        return d;
    }

    @Override
    public int compareTo(Object o) {
        if( (double)o > this.d) return 1;
        if( (double)o == this.d) return 0;
        if( (double)o < this.d) return -1;

        return 999;
    }

    public static void main(String[] args) {

        List<point> lst=new ArrayList<point>();
        point p1=new point(10, 5, 7);
        point p2=new point(6, 15, 12);
        point p3=new point(3, 7, 6);
        point p4=new point(24, 15, 16);
        point p5=new point(31, 17, 26);
        lst.add(p1);
        lst.add(p2);
        lst.add(p3);
        lst.add(p4);
        lst.add(p5);
        point temp =new point(0,0,0);

        for (int i=0;i<4;i++){
            for (int j=0;j<4-i;j++)
                if(lst.get(j).d>lst.get(j+1).d){

                    temp=lst.get(j);
                    lst.set(j,lst.get(j+1));
                    lst.set(j+1,temp);

                }
        }
        for (int i=0;i<5;i++)
            System.out.println(lst.get(i).d);


    }
}
