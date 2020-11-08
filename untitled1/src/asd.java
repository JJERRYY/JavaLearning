public class asd {
    public static void main(String[] args){
        int[] a;
        a = new int[5];
        System.out.println(a.length);
        for (int i=0;i<a.length;i++) {
            a[i] = (int) (Math.random() * 100);
            System.out.println(a[i]);
        }
    }
}
