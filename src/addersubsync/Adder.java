package addersubsync;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {

    private Value v;

    Adder(Value val){
        this.v = val;
    }

    public Void call() throws Exception
    {
        for(int i=1;i<=500;i++)
        {
            this.v.increment(i);
        }

        return null;
    }
}
