import java.util.*;

public class student implements Comparable{
    String name;
    int score;

    @Override
    public int compareTo(Object o) {


        if( this.score> ((student) o).score) return 1;
        else if(this.score< ((student) o).score) return -1;

        return 0;
    }
    public student(String name,int score){
        this.name=name;
        this.score=score;

    }
    public static void main(String[] args) {
        Set s1= new HashSet<>();
        Scanner sc= new Scanner(System.in);
        int i=1;
        while(sc.hasNext()){

            System.out.printf("请输入第%d位同学的姓名:",i);
            String name= sc.next();

            System.out.printf("请输入第%d位同学的成绩:",i);
            int score =sc.nextInt();

            s1.add(new student(name,score));
        }

        
    }


}
