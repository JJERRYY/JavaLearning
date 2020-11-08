public class hero implements ad {
    public String name;
    float hp;//血量

    float armor; //护甲

    int moveSpeed; //移动速度

    public static final int itemTotalNumber = 6;//物品栏的数量 常量 可以公开且不会变化

    public static void battlewin(){
        System.out.println("hero battle win");
    }

//    public void useItem(Item i){
//        System.out.println("hero use item");
//        i.effect();
//    }

    public hero(String name){//有参构造方法
        System.out.println("Hero的有一个参数的构造方法 ");
        this.name = name;
    }

    public hero(){//无参构造方法
        System.out.println("hero的构造方法 ");
    }


    public static void main(String[] args) {
        //new hero();

    }


    @Override
    public void physicAttack() {

    }
}
