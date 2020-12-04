import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pageranktest {
    static double q=0.85;

    public  static double Calpagerank(Node m,ArrayList<Node> Nodes){
        double sum=0;
        Node temp;
        for(int i=0;i< Nodes.size();i++){

            if(m.name.equals(Nodes.get(i).name)) continue;

            for(int j=0;j<Nodes.get(i).scale;j++){
                if(Nodes.get(i).linkednode[j].equals(m.name))
                    sum=sum+(Nodes.get(i).pagerank)/Nodes.get(i).scale;
            }

        }


        sum= (1-q)/Nodes.size()+q*sum;
        m.pagerank = sum;
        return sum;


    }


    public static void main(String[] args) {
        File file =new File("pagerank.txt");
        List<Node> Nodes = new ArrayList<Node>();
        try {
            FileInputStream f = new FileInputStream(file);
            InputStreamReader reader = new InputStreamReader(f, "UTF-8");

            char temp;
            while(true){

                temp=(char)reader.read();
                Node obj = new Node(String.valueOf(temp),1);

                while((temp=(char)reader.read())!='\r'){//遇到换行符 则跳出循环
                if(temp=='\t') continue;//遇到空格跳过
                    if(temp==65535) break;
                obj.linkednode[obj.scale] =String.valueOf(temp);
                obj.scale++;
                }

                Nodes.add(obj);
                reader.read(); //win系统中换行符由/r/n组成 跳过'/n'进入新的一行
                if(temp==65535) break;
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (EOFException  e) {
            e.printStackTrace();
            System.out.println("到达行尾");
        } catch (IOException e) {
            e.printStackTrace();
        }
        int i = 1;
        double previous ;
            do{
               previous =Nodes.get(1).pagerank;

                System.out.println("=======第" + i + "轮:=======");
                for(Iterator<Node> it = Nodes.iterator(); it.hasNext();){
                    Node noood =it.next();
                Calpagerank(noood, (ArrayList<Node>) Nodes);
                System.out.println(noood.name+" "+noood.pagerank);
                }
                i++;

            }while(Math.abs(previous-Nodes.get(1).pagerank)>0.001);






//        for(Iterator<Node> it = Nodes.iterator(); it.hasNext();){
//            Node noood=it.next();
//            System.out.println(noood.name+" "+noood.pagerank);
//        }

    }
}
