package thread;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(4);
          Worker first = new Worker(1000,latch,"THREAD-1");
          Worker second = new Worker(2000,latch,"THREAD-2");
          Worker third = new Worker(3000,latch,"THREAD-3");
          Worker fourth = new Worker(4000,latch,"THREAD-4");

      first.start();
      second.start();
      third.start();
      fourth.start();

      latch.await();

      System.out.println(Thread.currentThread().getName() +
                " has finished");
    }
}
class Worker extends Thread
{
    private int delay;
    private CountDownLatch latch;

    public Worker(int delay, CountDownLatch latch,
                  String name)
    {
        super(name);
        this.delay = delay;
        this.latch = latch;
    }

    @Override
    public void run()
    {
        try
        {
            Thread.sleep(delay);
            latch.countDown();
            System.out.println(Thread.currentThread().getName()
                    + " finished");
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}