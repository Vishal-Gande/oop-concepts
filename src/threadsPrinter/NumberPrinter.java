package threadsPrinter;

public class NumberPrinter implements Runnable {

    int number;

    NumberPrinter(int number) {
        this.number = number;
    }

    public void run(){
        System.out.println(Thread.currentThread().getName() + " prints : "+  this.number);
    }
}
