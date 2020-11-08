public class ADAPhero implements ad,ap{


    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }

    @Override
    public void attack() {
    ad.super.attack();
    ap.super.attack();
    }

    @Override
    public void magicAttack() {
            System.out.println("进行魔法攻击");
    }

    public static void main(String[] args) {
        ADAPhero h1=new ADAPhero();

        h1.attack();

    }
}
