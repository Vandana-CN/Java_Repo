class MyThread1 extends Thread
{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getId()+"is running");
    }

}
public class MultiThread {
    public static void main(String[] args) {

        for(int i=0;i<10;i++)
        {
            MyThread1 myThread = new MyThread1();
            myThread.start();
        }
    }
}
