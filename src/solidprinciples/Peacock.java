package solidprinciples;

public class Peacock extends Bird implements Flyable{

    FlyingBehaviour fb = new Slowflyingbehaviour();



    public void fly() {
        fb.make_fly();
    }

}
