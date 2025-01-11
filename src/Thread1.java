public class Thread1 extends Thread{
    @Override
    public void run(){
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Привет");
                sleep(4);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
