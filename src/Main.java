
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        int counter = 2;
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
            counter++;
            Printer p1 = new Printer();
            System.out.println(p1);
        }
    }
}