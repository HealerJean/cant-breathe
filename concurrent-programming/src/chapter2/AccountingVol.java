package chapter2;

/**
 * Created by 13 on 2017/5/4.
 */
public class AccountingVol implements Runnable {
    static AccountingVol instance = new AccountingVol();
    static volatile int i = 0;

    public static void increase() {
        i++;
    }

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p/>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        for (int j = 0; j < 10000000; j++) {
            increase();
        }
    }

    /**
     * ��������ͨ�������̶߳�i�����ۼӲ���,���յ���ȷ���ӦΪ20000000,����ʵ������ȴԶԶС����ȷ��ֵ,��Ϊ����߳�ͬ�¶�i����д�����ʱ,
     * ����һ���̵߳Ľ���Ḳ������һ���̵߳Ĳ���,�̲߳���ȫ���������ֳ�ͻ.
     *
     * @param args
     * @throws InterruptedException
     */
    public static void main(String args[]) throws InterruptedException {
        Thread thread1 = new Thread(instance);
        Thread thread2 = new Thread(instance);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(i);
    }

}
