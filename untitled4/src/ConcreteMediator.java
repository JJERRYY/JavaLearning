import java.util.Objects;

public class ConcreteMediator implements Mediator {
    @Override
    public void notice(String content) {
        System.out.println(content);
        String str="上司来了";

        if (Objects.equals(str, content)){
            employeeA eA=new employeeA();
            eA.work();
        }else {
            employeeB eB=new employeeB();
            eB.work();
        }

    }

}
