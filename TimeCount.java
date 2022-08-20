import java.io.IOException;
import java.sql.Timestamp;

public class TimeCount {

    int count = 0;

    public String stopWatch() throws InterruptedException {
        int min = 0;
        int sec = 0;
        for(int i=0; i<=10;i++)
        {
            for(int j=0; j<=59; j++)
            {
                System.out.print("MIN:"+i+"SEC:"+j+"\r");
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
    public static void main(String[] args) throws InterruptedException
    {
        TimeCount obj = new TimeCount();

        String finalDuration = obj.stopWatch();
        System.out.println("Finally:"+finalDuration);
    }
}
