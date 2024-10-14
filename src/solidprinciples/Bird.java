package solidprinciples;

// If you include code for sparrow and other birds here itself,
// it will violate SRP, so create subclasses - sparrow etc

// this depicts OCP principle -- to add a new bird eagle tomorrow,
// we need not change this base class, but just add a new class file eagle
public class Bird {

    private int age;
    private int weight;
    private int name;

    public void eat(){
        System.out.println("Bird is eating");
    }

    public void talk(){
        System.out.println("Bird is talking");
    }
}
