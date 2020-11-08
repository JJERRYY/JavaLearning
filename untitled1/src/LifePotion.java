public class LifePotion extends item{


    @Override
    public boolean disposable() {//抽象方法的重写-使用血药之后血药会消失
        return true;
    }
}
