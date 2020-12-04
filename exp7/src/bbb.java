import java.io.File;
import java.util.Iterator;
import java.util.Scanner;

public class bbb {
    static int exist=0;

    public void search(File file, String goal){
    File[] files = file.listFiles();

    for (File dir: files){
        if(dir.isDirectory()) search(dir,goal);
        if(dir.isFile()&&dir.getName().equals(goal)){
            exist++;
            System.out.println("文件:"+goal+"在"+dir.getPath());
        }
    }


    }

    public static void main(String[] args) {

        System.out.println("请输入要查找的文件名:");
        Scanner sc =new Scanner(System.in);
        String goal = sc.next();
        File file = new File("C:\\Users\\Jerry\\IdeaProjects\\实验7");
        bbb bbb = new bbb();
        bbb.search(file,goal);

        if(bbb.exist==0) System.out.println(file.getPath()+"下没有该文件");

    }
}
