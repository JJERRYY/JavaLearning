import java.io.*;
import java.util.Iterator;
import java.util.Scanner;

public class bbb {

    public static void search(File srcfile, File tarfile){
        File[] files = srcfile.listFiles();

        for (File dir: files){
            String name = dir.getName();
            if(dir.isDirectory()) {
                File tarfile2 = new File(tarfile.getPath()+"\\"+dir.getName());
                if(!(tarfile2.exists())) tarfile2.mkdir();
                search(dir,tarfile2);
            }

            if(dir.isFile()){
                copy(dir,tarfile);
            }
        }
    }
    public static void copy(File srcfile,File tarDir){
        try {
            FileInputStream fis =new FileInputStream(srcfile);
            File tarfile = new File(tarDir+"\\"+srcfile.getName());
            tarfile.createNewFile();
            FileOutputStream fos =new FileOutputStream(tarfile);
            byte[] bytes= new byte[1024];
            int len =0;
            while((len=fis.read(bytes))!=-1){
                fos.write(bytes,0,len);
            }
            fos.flush();
            fos.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(""+srcfile.getPath()+" => "+tarDir.getPath());

    }

    public static void main(String[] args) {


        File srcfile = new File("D:\\111");
        File tarfile =new File("C:\\Users\\Jerry\\Desktop\\新建文件夹");
        search(srcfile,tarfile);

    }
}
