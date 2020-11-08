public class employeeA extends Colleague{
    @Override
    void work() {
        System.out.println("员工A努力写代码");
    }

    public static void main(String[] args) {
        ConcreteMediator cm=new ConcreteMediator();

        cm.notice("上司来了");
        cm.notice("客户来了");
    }
}
