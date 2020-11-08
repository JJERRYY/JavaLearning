public interface ap {

    public void magicAttack() ;

    default public void attack(){
        System.out.println("ap默认方法攻击");

    }
}
