package Multithreading;

class MyThread extends Thread{
    @Override
    public void run() {
        int i =1;
        while(i<10000){
            System.out.println(i + " my thread ");
            i++;
        }
    }
}

public class threadTest {
    public static void main(String[] args) throws InterruptedException {
        MyThread m = new MyThread();
//        m.setDaemon(true);
        m.start();
        Thread.sleep(1000);

//        Thread main = Thread.currentThread();
//        int i =1;
//        while(i<10){
//            System.out.println(i + " main ");
//            i++;
//        }
//
//        try {
//            main.join();
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }


    }
}
