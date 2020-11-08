public class weapon extends item{//武器


    @Override
    public boolean disposable() {//抽象方法的重写-使用武器后武器不会消失

        return false;
    }
}
