package solidprinciples;

public class Ostrich {

    public void walk()
    {
        System.out.println("Hi, I only Walk :( ");
    }

    // violation of liskov's substitution
    // Even though ostrict overides methods of base class methods, it doesn't withold intent and functionality
    // of base class, instead it throws an exception.
    void talk() {
        throw new UnsupportedOperationException("Ostriches don't do this");
    }

    void eat() {
        throw new UnsupportedOperationException("Ostriches don't do this");
    }
}
