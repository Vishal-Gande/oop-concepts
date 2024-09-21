//Qsn: print numbers 1 to 10, each from a different thread
//Ans:
//Thread-0 prints : 1
//Thread-7 prints : 8
//Thread-5 prints : 6
//Thread-1 prints : 2
//Thread-4 prints : 5
//Thread-2 prints : 3
//Thread-3 prints : 4
//Thread-8 prints : 9
//Thread-9 prints : 10
//Thread-6 prints : 7

package threadsPrinter;

public class Main {

    public static void main(String[] args) {

        for(int i=1;i<11;i++)
        {
            NumberPrinter np = new NumberPrinter(i);
            Thread t = new Thread(np);
            t.start();
        }
    }
}


