public interface ad {
    //物理伤害
    public void physicAttack();

    default public void attack(){
        System.out.println("ad默认方法攻击");
    }

}
