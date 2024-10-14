package solidprinciples;

public class Sparrow extends Bird implements Flyable {

    FlyingBehaviour fb = new Fastflyingbehaviour();
    public void fly(){
        fb.make_fly();
    }

    // pigeon and sparrow classes follow liskov's substitution principle, as
    // bird b = new pigeon():
    // b.eat();
    // b.talk();
    // above line can be replaced with
    // bird b = new sparrow();
    // To ensure LSP, the overridden methods must still uphold
    // the intent and functionality of the base class methods so
    // that the subclass can be substituted for the base class
    // without breaking the system.

    public void eat(){
        System.out.println("Sparrow is eating");
    }

    public void talk(){
        System.out.println("Sparrow is talking");
    }
}
