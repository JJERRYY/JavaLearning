import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class wiki {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("wiki-edges.txt");
        Scanner sc = new Scanner(file);
        List<Node> Nodes = new ArrayList<>();
        int flag;
        while (sc.hasNext()){
            String buffer =sc.next();
            flag=0;
            for (Node noood: Nodes){
                if(buffer.equals(noood.name)) {
                    noood.add(sc.next());
                    flag=1;
                    break;
                }
            }
            if(flag==1) continue;
            Node obj =new Node(buffer,1);
            buffer =sc.next();
            obj.add(buffer);
            Nodes.add(obj);
        }

        PrintWriter pw = new PrintWriter("wiki-adjacentnodes.txt");
        for(Iterator<Node> it =Nodes.iterator();it.hasNext();){
            Node temp=it.next();
            pw.println(temp.toString());
        }
        pw.close();
        }
}
