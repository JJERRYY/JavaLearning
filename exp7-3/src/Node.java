import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Node {
    double pagerank;
    String name;
    String[] linkednode;
    int scale;//出度的值
    public Node(String name,double pagerank,String[] linkednode){
        this.name=name;
        this.linkednode= linkednode;
        linkednode = new String[2000];
        scale =0;
    }

    public Node(String name,double pagerank){
        this.name=name;
        this.pagerank=pagerank;
        linkednode = new String[2000];
        scale =0;
    }

    public Node(){
        this.name = null;
        this.pagerank =1;
        linkednode = new String[2000];
        scale =0;
    }
    public void add(String nodename){

        this.linkednode[scale]=nodename;
        this.scale++;
    }

    @Override
    public String toString() {
        String str=this.name;
        for (int i=0;i<this.scale;i++){
            str=str+" "+linkednode[i];
        }
        return str;
    }
    public  static Node getNode(String name, ArrayList<Node> Nodes){

        for(Iterator<Node> it = Nodes.iterator();it.hasNext();){
            Node noood=it.next();
            if(noood.name.equals(name)) return noood;

        }
        System.out.println("找不到Node!");
        return null;

    }
}
