package Thread_Example;

public class Thread1 extends Thread {
    @Override
    public void run() {
        int i = 1;
        while (i<100) {
            System.out.println(i + " " + this.getName());
            i++;
        }
    }
}
