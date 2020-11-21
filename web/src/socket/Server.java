package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    public static void main(String[] args)  {
        try {
            //服务端打开端口8888
            ServerSocket ss = new ServerSocket(8888);

            //在8888端口上监听，看是否有连接请求过来
            System.out.println("监听在端口号:8888");
            Socket s =  ss.accept();
            System.out.println("有连接过来" + s);
            //创建输入和输出流
            OutputStream os = s.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);//用于写UTF中文字符
            InputStream is = s.getInputStream();
            DataInputStream dis = new DataInputStream(is);

            //读取客户端发送的数据
            while(true){
                String msg = dis.readUTF();
                System.out.println("接收到信息:" + msg);
                Scanner sc =new Scanner(System.in);
                String str =sc.next();
                dos.writeUTF(str);

            }


//            dis.close();
//            s.close();
//            ss.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}