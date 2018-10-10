package chapter3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * �ź���
 * Created by 13 on 2017/5/5.
 */
public class SemapDemo implements Runnable {
    final Semaphore semp = new Semaphore(5);

    @Override
    public void run() {
        try {
            semp.acquire();
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getId() + ":done!");
            semp.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * �ܹ�20���߳�,ϵͳ����5���߳�һ��Ϊ��λ,����ִ�в����
     *
     * @param args
     */
    public static void main(String args[]) {
        ExecutorService executorService = Executors.newFixedThreadPool(20);
        final SemapDemo demo = new SemapDemo();
        for (int i = 0; i < 20; i++) {
            executorService.submit(demo);
        }
    }
}
