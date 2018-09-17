import javax.swing.JOptionPane;

class Timer implements Runnable {
    private int interval = 1000;
    private boolean running = false;
    private int seconds = 0;

    Timer(int interval) {
        this.interval = interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public void startTimer() {
        running = true;

    }

    public void stopTimer() {
        running = false;
    }


    @Override
    public void run() {
        while (true) {
            if (running) {
                System.out.println("seconds: " + ++seconds);
            }
            //   System.out.println(interval);
            try {
                Thread.sleep(interval);
            } catch (InterruptedException ex) {
                System.out.println(ex);
                break;
            }

        }
    }
}


public class TimerDemo {
    public static void main(String[] args) {
        String valinta;
        Timer timer1 = new Timer(1000);
        Thread timerThread = new Thread(timer1);
        timerThread.start();
        do {
            valinta = JOptionPane.showInputDialog(null, "1. Käynnistä kello \n 2. Pysäytä kello " +
                    " \n 3. Aseta kellon intervalli \n 4. Lopeta ohjelma");

            if (valinta.equals("1")) {
                timer1.startTimer();
                // timer1.run();
            } else if (valinta.equals("2")) {
                timer1.stopTimer();
            } else if (valinta.equals("3")) {
                int userInterval = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Enter interval in milliseconds"));
                timer1.setInterval(userInterval);
            }
        } while (!valinta.equals("4"));
        timerThread.interrupt();


    }
}