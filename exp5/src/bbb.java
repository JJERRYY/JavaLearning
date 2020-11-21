import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class bbb {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("./src/weather.txt");
        Scanner s;

            s = new Scanner(file);

            Vector<String> v1 = new Vector<>();
            while(s.hasNextLine()) {
                String str =s.nextLine();
                v1.add(str);
//                System.out.println(str);
            }

        Collections.sort(v1, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                SimpleDateFormat sdf =  new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" );

                String t1 = o1.substring(20,21);
                String t2 = o2.substring(20,21);
                String d1 = o1.substring(0,19);
                String d2 = o2.substring(0,19);
                Date a1= new Date();
                Date a2= new Date();
                try {
                    a1 = sdf.parse(d1);
                    a2 = sdf.parse(d2);

                } catch (ParseException e) {
                    e.printStackTrace();
                }

                if(a1.compareTo(a2)==1) return 1;
                if(a1.compareTo(a2)==-1) return -1;

                if(t1.compareTo(t2)==1) return -1;
                else return -1;

            }
        });
        for (int i = 0; i < v1.size(); i++) {
            System.out.println(v1.get(i));
        }


    }



}

