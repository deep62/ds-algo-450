package thread;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(2);
        DevTeam devTeamA = new DevTeam(1000,latch,"DevTeam A");
        DevTeam devTeamB = new DevTeam(2000,latch,"DevTeam B");
        //QATeam qaTeamA = new QATeam(3000,latch,"QATeam-A");
        //QATeam qaTeamB = new QATeam(4000,latch,"QATeam-B");
        devTeamA.start();
        devTeamB.start();

        latch.await();
       /* CountDownLatch latch1 = new CountDownLatch(2);
        QATeam qaTeamA = new QATeam(3000,latch1,"QATeam-A");
        QATeam qaTeamB = new QATeam(4000,latch1,"QATeam-B");
        qaTeamA.start();
        qaTeamB.start();*/
        System.out.println(Thread.currentThread() + "has finished execution");
    }
}
class DevTeam extends Thread{
    CountDownLatch countDownLatch;
    String threadName;
    int delay;
    DevTeam(int delay,CountDownLatch countDownLatch,String threadName){
        super(threadName);
        this.countDownLatch = countDownLatch;
        this.threadName = threadName;
        this.delay = delay;
    }
    @Override
    public void run(){
        System.out.println(this.threadName+" has started");
        try{
            Thread.sleep(delay);
            countDownLatch.countDown();
            System.out.println(this.threadName+" has finished");
        }
        catch (InterruptedException e){
            e.fillInStackTrace();
        }

    }
}
class QATeam extends Thread{
    CountDownLatch latch = new CountDownLatch(4);
    int delay;
    public QATeam(int delay,CountDownLatch latch,String threadName){
        super(threadName);
        this.latch = latch;
        this.delay = delay;
    }
    @Override
    public void run(){
        System.out.println(Thread.currentThread() + "is started");
        try{
            Thread.sleep(delay);
        }
        catch (InterruptedException ex){
            ex.printStackTrace();
        }
        latch.countDown();
        System.out.println(Thread.currentThread() + "QA has finished");
    }
}