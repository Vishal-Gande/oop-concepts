package addersubsync;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value val = new Value(); // val initilised to zero

        // two classes for two parallel tasks
        Adder adder = new Adder(val);  // both add and sub called on same object
        Subtractor subtractor = new Subtractor(val);

        ExecutorService es = Executors.newCachedThreadPool();

        Future<Void> addfuture = es.submit(adder);
        Future<Void> subfuture = es.submit(subtractor);

        addfuture.get(); //ensures that thread has finished running
        subfuture.get();

        System.out.println(val.getValue());
    }
}