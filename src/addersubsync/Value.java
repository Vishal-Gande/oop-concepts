package addersubsync;

public class Value {

    private int val = 0;

    public synchronized void increment(int delta) {
        this.val+=delta;
    }

    public synchronized void decrement(int delta){
        this.val-=delta;
    }

    public int getValue(){
        return this.val;
    }
}
