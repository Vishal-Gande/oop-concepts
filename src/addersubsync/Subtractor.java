package addersubsync;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {

    private Value v;

    Subtractor(Value val) {
        this.v = val;
    }

    public Void call() throws Exception{
        for(int i=1;i<=500;i++)
        {
            this.v.decrement(i);
        }
        return null;
    }
}
