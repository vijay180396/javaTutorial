
class Deebam extends Thread
{
    int count = 0;

    public void run(){
        try {
            stopWatch();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String stopWatch() throws InterruptedException {
        int min = 0;
        int sec = 0;
        for(int i=0; i<=10;i++)
        {
            for(int j=0; j<=59; j++)
            {
                System.out.print("THREAD1_MIN:"+i+"SEC:"+j+"\r");
                Thread.sleep(1000);
                if(j == 59)
                {
                    sec = j;
                }
//                obj.count = i;
            }

            if(i==10)
            {
                min = i;
            }


//        System.out.print("\33[1A\33[2K");
        }
        return "Min:"+min+"Sec"+sec;

    }
}

class Parvathi extends Thread
{
    int count = 0;

    public void run(){
        try {
            stopWatch();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String stopWatch() throws InterruptedException {
        int min = 0;
        int sec = 0;
        for(int i=0; i<=10;i++)
        {
            for(int j=0; j<=59; j++)
            {
                System.out.print("THREAD2_MIN:"+i+"SEC:"+j+"\r");
                Thread.sleep(1000);
                if(j == 59)
                {
                    sec = j;
                }
//                obj.count = i;
            }

            if(i==10)
            {
                min = i;
            }


//        System.out.print("\33[1A\33[2K");
        }
        return "Min:"+min+"Sec"+sec;

    }
}

public class Hospitals {
    public static void main(String[] args) {
        Deebam objD = new Deebam();
        Parvathi objP = new Parvathi();

        objD.start();
        objP.start();
    }
}
