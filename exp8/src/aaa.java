import java.io.File;
import java.util.Iterator;
import java.util.Scanner;

public class aaa {
    static int exist=0;

    public static void search(File file, String goal){
        File[] files = file.listFiles();

        for (File dir: files){
            if(dir.isDirectory()) search(dir,goal);

            if(dir.isFile()&&dir.getName().endsWith(goal)){
                exist++;
                System.out.println("文件:"+dir.getName()+"在"+dir.getPath());
            }
        }
    }

//    static String getSuffix (String filename){
//    String suffix=filename.substring(filename.lastIndexOf("."+1));
//    return suffix;
//
//    }

    public static void main(String[] args) {

//        System.out.println("请输入要查找的目录");
//       Scanner sc =new Scanner(System.in);
//        String goal = sc.next();
        File file = new File("C:\\Users\\Jerry\\IdeaProjects\\");
        String goal = ".java";
        aaa.search(file,goal);
        String goal1 = ".jpg";
        aaa.search(file,goal1);
        if(aaa.exist==0) System.out.println(file.getPath()+"下没有该文件");

    }
}
