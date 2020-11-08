public abstract class hero2 {//当场实例化抽象类----匿名类
    String name; //姓名

    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度

    public abstract hero2 attack();

    public static void main(String[] args) {

        ADhero adh = new ADhero();
        //通过打印adh，可以看到adh这个对象属于ADHero类
        adh.attack();
        System.out.println(adh);

        int damage = 5;

        hero2 h = new hero2() {
            //当场实现attack方法
            public hero2 attack() {
                System.out.println("新的进攻手段" + damage);//匿名类只能调用final的局部外部变量
                return null;
            }
        }.attack();//.attack可以直接调用

        h.attack();

        class SomeHero extends hero2 {//本地类---有名字的匿名类

            public hero2 attack() {
                System.out.println(name + " 新的进攻手段");
                return null;
            }
        }
        SomeHero h1 = new SomeHero();
        h1.attack();
        //通过打印h，可以看到h这个对象属于Hero$1这么一个系统自动分配的类名
        System.out.println(h1);

        //这里使用本地类AnonymousHero来模拟匿名类的隐藏属性机制

        //事实上的匿名类，会在匿名类里声明一个damage属性，并且使用构造方法初始化该属性的值
        //在attack中使用的damage，真正使用的是这个内部damage，而非外部damage

        //假设外部属性不需要声明为final
        //那么在attack中修改damage的值，就会被暗示为修改了外部变量damage的值

        //但是他们俩是不同的变量，是不可能修改外部变量damage的
        //所以为了避免产生误导，外部的damage必须声明为final,"看上去"就不能修改了
        class AnonymousHero extends hero2 {
            int damage;

            public AnonymousHero(int damage) {
                damage = damage;
            }

            public hero2 attack() {
                damage = 10;
                System.out.printf("新的进攻手段，造成%d点伤害", this.damage);
                return null;
            }
        }
        hero2 h2 = new AnonymousHero(damage);
        h2.attack();
        System.out.println("外部damage:"+damage);
    }
}

