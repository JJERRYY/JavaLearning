public class ADhero extends hero implements ad {
    public void attack(){
        System.out.println("攻击");
    }

    public void physicAttack(){
        System.out.println("进行物理攻击");

    }
    public ADhero(){
        System.out.println("AD hero的构造方法");
    }

    public ADhero(String name){
        super(name);
        System.out.println("AD Hero的构造方法");
    }
    public String toString(){//Object的toString
        return name;
    }
    public static void battleWin(){
        System.out.println("ad hero battle win");
    }
    @Override
    public void finalize(){
        System.out.println("这个英雄正在被回收");
    }

    @Override
    public boolean equals(Object o){//重写equals
        if(o instanceof hero){
            hero h = (hero) o;
            return this.hp == h.hp;
        }
        return false;
    }

    public int getMoveSpeed(){
        return this.moveSpeed;
    }
    public int getMoveSpeed2(){//super用法,调用父类变量
        return super.moveSpeed;
    }

    public static void main(String[] args) {

        final  hero h=new ADhero("武器带师");//final修饰的引用只有一次指向对象的机会

        new ADhero();//会自动调用父类的无参构造方法
        System.out.println(h.toString());

//        hero h1= new hero();
//        h1.hp = 300;
//        hero h2= new hero();
//        h2.hp = 400;
//        hero h3= new hero();
//        h3.hp = 300;
//
//        System.out.println(h1.equals(h2));
//        System.out.println(h1.equals(h3));


//        hero.battlewin();
//        ADhero.battleWin();

//        hero h =new ADhero();
//        h.battlewin();//调用的实际为父类对象中的方法,此时没有子类覆盖

//        hero h1;
//        for (int i = 0; i < 1000000; i++) {
//            //不断生成新的对象
//            //每创建一个对象，前一个对象，就没有引用指向了
//            //那些对象，就满足垃圾回收的条件
//            //当，垃圾堆积的比较多的时候，就会触发垃圾回收
//            //一旦这个对象被回收，它的finalize()方法就会被调用
//            h1 = new hero();


        }

    }

