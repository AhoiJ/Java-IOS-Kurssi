import javax.swing.JOptionPane;

class Worker extends Thread {

    private int sleepTime = 1000; // milliseconds

    public Worker(String name, int sleepTime) {
        super(name);
        this.sleepTime = sleepTime;
    }


    public void run(){
        for (int i = 0; i<20; i++){
            System.out.println("Thread: " + getName() + " " + i);
            try {
                Thread.sleep( sleepTime );
            }catch (InterruptedException ex){
                System.out.println( ex );
            }
        }
    }
}

public class ThreadExample{

    public static void main(String[] args){
        System.out.println("Luodaan saikeet...");
        Worker worker1 = new Worker( "ykkössäie", 1500);
        Worker worker2 = new Worker ("kakkosaie", 750);
        Worker worker3 = new Worker ("kolmossaie", 2000);
        worker1.start();
        worker2.start();
        worker3.start();
    }
}
