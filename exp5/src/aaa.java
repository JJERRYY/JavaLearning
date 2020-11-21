import java.util.*;

 class aaa {



    public static void main(String[] args) {

        Vector <Integer> v1= new Vector<>(10);

        Scanner s1=new Scanner(System.in);
        for (int i=0;i<5;i++){
            int n=0;
            n=s1.nextInt();
            v1.add(n);
        }

        Collections.sort(v1, new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                if((int) o1 > (int) o2) return 1;
                if((int) o1 < (int) o2) return -1;
                return 0;
            }

        });
        System.out.println("升序排列："+v1);

        Collections.sort(v1, new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                if((int) o1 < (int) o2) return 1;
                if((int) o1 > (int) o2) return -1;
                return 0;
            }

        });
        System.out.println("降序排列："+v1);

        Collections.sort(v1, new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                if(Math.abs((int) o1) > Math.abs((int) o2)) return 1;
                if(Math.abs((int) o1) < Math.abs((int) o2)) return -1;
                return 0;
            }

        });
        System.out.println("绝对值升序排列："+v1);

    }
}
