package b4_lop_va_doi_tuong.bai_tap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;

public class StopWatch {
    private Date startTime;
    private Date endTime;

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }
    public StopWatch(){
        startTime=new Date();
    }
    public long start(){
        startTime = new Date();
        return startTime.getTime();
    }
    public long stop(){
        endTime = new Date();
        return endTime.getTime();
    }
    public long getElapsedTime(){
        return endTime.getTime() - startTime.getTime();
    }

    public static void main(String[] args) {
        StopWatch sw = new StopWatch();
        System.out.println(sw.start());
        int arr[] = new int[1000000];
        for (int i=0;i<arr.length;i++){
            arr[i]= (int)(Math.random()*50000);
        }
        Arrays.sort(arr);
        System.out.println(sw.stop());
        System.out.println(sw.getElapsedTime()+" milisecond");

    }
}
