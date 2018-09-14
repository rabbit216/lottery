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
    /**
     * 新建一个lotteryUtil对象
     */
    static LotteryUtil lotteryUtil = new LotteryUtil();
    /**
     * 新建一个dateUtil对象
     */
    static DateUtil dateUtil = new DateUtil();


//    static long time = 1000L * 6;
    /**
     * 定义一个循环时间
     */
    static long time = 1000L * 60 * 10;
    /**
     * 定义一个停止时间
     */
    static String stopTime_1 = "23:00:00";

    /**
     * 定义一个保存文件路径
     */
    static String filePath = "C:\\Users\\Administrator\\Desktop\\李伟杰\\";

    /**
     * main方法
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        String strTime = dateUtil.getTimes();
        filePath = OpenLottery.filePath + "lottery" + strTime + ".txt";
        Timer timer = new Timer();
        method2(time, timer);
    }
    /**
     * 判断得到一个结束执行
     * @param period 周期
     * @param timer Time对象
     */
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

