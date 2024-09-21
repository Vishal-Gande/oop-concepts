

package threadpool;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Main {

    public static void main(String[] args) {

        ExecutorService pool1 = Executors.newFixedThreadPool(5);

        for(int i=1;i<100;i++)
        {
            NumberPrinter np = new NumberPrinter(i);
            pool1.execute(np);
        }
    }
}


