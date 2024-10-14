package solidprinciples;

// this depicts dependency inversion principle, as flying birds instead of
// depending(on methods) on sfb and ffb...sfb and ffb classes depend(as they implement) on Flyingbehaviour
public class Slowflyingbehaviour implements FlyingBehaviour {

    public void make_fly(){
        System.out.println("I Fly slow");
    }
}
