package oop;

import java.time.LocalTime;
import java.util.Scanner;
import java.lang.System;

public class StopWatch {
    private long startTime;
    private long endTime;

    public void start(long startTime){
        this.startTime=startTime;
    }

    public void stop(long endTime){
        this.endTime=endTime;
    }

    public long elapseTime(){
        return endTime-startTime;
    }

    public static void main(String[] args) {
        selectionSort();
        StopWatch stopWatch =new StopWatch();

        stopWatch.start(System.currentTimeMillis());
        System.out.println("thoi gian bat dau "+stopWatch.startTime);

        stopWatch.stop(System.currentTimeMillis());
        System.out.println("thoi gian ket thuc "+stopWatch.endTime);

        System.out.println("thoi gian thuc hien"+ stopWatch.elapseTime());

    }
    public static void selectionSort(){
        for (int i=0;i<100000;){
            i++;
        }
    }
}
