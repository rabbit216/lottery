package lottery;

import lottery.util.DateUtil;
import lottery.util.LotteryUtil;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 一个执行的main方法；
 * Created by TimAimee on 2018/9/7.
 */
public class OpenLottery {
    static LotteryUtil lotteryUtil = new LotteryUtil();
    static DateUtil dateUtil = new DateUtil();


//    static long time = 1000L * 6;
    static long time = 1000L * 60 * 10;
    static String stopTime_1 = "23:00:00";


    static String filePath = "C:\\Users\\Administrator\\Desktop\\李伟杰\\";


    public static void main(String[] args) throws IOException {
        String strTime = dateUtil.getTimes();
        filePath = OpenLottery.filePath + "lottery" + strTime + ".txt";
        Timer timer = new Timer();
        method2(time, timer);
    }


    private static void method2(long period, Timer timer) {

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                lotteryUtil.getLottery(filePath);
                if (dateUtil.getTime().compareTo(stopTime_1) > 0) {
                    cancel();
                    System.out.println(dateUtil.getTime() + ":结束执行");
                }
            }
        }, 0l, period);
    }


}

