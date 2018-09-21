
class Dead implements Runnable
{
    public boolean flag;
    public Object locka=new Object();
    public Object lockb=new Object();
    public Dead(boolean f) {this.flag=f;}
    public void run()

    {
        while(true) {
            if(flag)
            {
                synchronized(Lock.locka)
                {
                    System.out.println("if loca");
                    synchronized(Lock.lockb)
                    {
                        System.out.println("if lockb");
                    }
                }
            }
            else {
                synchronized(Lock.lockb)
                {
                    System.out.println("else lockb");
                    synchronized (Lock.locka) {
                        System.out.println("else locka");
                    }
                }
            }
        }
    }
}
class Lock
{
    static Object locka=new Object();
    static Object lockb=new Object();
}

class Dead1 implements Runnable
{
    public boolean flag;
    public Object locka=new Object();
    public Object lockb=new Object();
    public Dead1(boolean f) {this.flag=f;}
    public void run()

    {
        while(true) {
            if(flag)
            {
                synchronized(Lock1.locka)
                {
                    System.out.println("if loca");
                    synchronized(Lock1.lockb)
                    {
                        System.out.println("if lockb");
                    }
                }
            }
            else {
                synchronized(Lock1.lockb)
                {
                    System.out.println("else lockb");
                    synchronized (Lock1.locka) {
                        System.out.println("else locka");
                    }
                }
            }
        }
    }
}
class Lock1
{
    static Object locka=new Object();
    static Object lockb=new Object();
}
public class DeadLock {

    public static void main(String args[]) {
        Thread t1 = new Thread(new Dead(true),"thread-if");
        Thread t2 = new Thread(new Dead(false),"thread-else");
        t1.start();
        t2.start();
        Thread t3 = new Thread(new Dead1(true),"thread-if3");
        Thread t4 = new Thread(new Dead1(false),"thread-else4");
        t3.start();
        t4.start();
    }
}
