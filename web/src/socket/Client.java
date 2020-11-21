package socket;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

    public static void main(String[] args)  {

        try {
            //连接到本机的8888端口
            Socket s = new Socket("127.0.0.1",8888);

            System.out.println(s);
            //创建输入和输出流
            OutputStream os = s.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);//用于写UTF中文字符
            InputStream is = s.getInputStream();
            DataInputStream dis = new DataInputStream(is);

            while(true){
                Scanner sc =new Scanner(System.in);
                String str =sc.next();
                dos.writeUTF(str);
                String msg = dis.readUTF();
                System.out.println("收到消息："+msg);

            }




//            dos.close();
//            os.close();
//            s.close();


        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}