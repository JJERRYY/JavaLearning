public class bb {
    public static void main(String[] args) {

        int[] a=new int[101];
        int tmp;
        for (int i=0;i<1000;i++){
            tmp=(int) (Math.random()*100+1);
            a[tmp]++;
        }
        for (int i=0;i<100;i++){
            System.out.println(i+"出现的次数"+a[i]);
        }

    }
}
