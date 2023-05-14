package pattern.example.strategypattern;

public class MallardDuck extends Duck{
    public MallardDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

    @Override
    public void swim() {
        System.out.println("swimming");
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
