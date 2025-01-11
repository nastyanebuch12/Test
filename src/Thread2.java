public class Thread2 extends Thread{
    @Override
    public void run(){
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Пока");
                sleep(5);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
