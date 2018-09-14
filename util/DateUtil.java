package lottery.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期工具类；
 * Created by TimAimee on 2018/9/8.
 */
public class DateUtil {
    /**
     * 获取开奖时间
     * @param str
     * @return 打他（Data对象）
     * @throws ParseException（异常处理）
     */
    public Date getStartDate(String str) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = dateFormat.parse(str);
        return date;
    }

    /**
     * 获取当前时间 格式为HH:mm:ss
     * @return 当前时间
     */
    public String getTime() {
//        LocalDateTime localDateTime = LocalDateTime.now();
//        LocalDate localDate = LocalDate.now();
//        localDate.plusDays(1);
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");//可以方便地修改日期格式
        Date now = new Date();
        String nowTime = dateFormat.format(now);
        return nowTime;
    }
    /**
     * 获取当前时间 格式为_HH_mm_ss
     * @return 当前时间
     */
    public String getTimes() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("_HH_mm_ss");//可以方便地修改日期格式
        Date now = new Date();
        String nowTime = dateFormat.format(now);
        return nowTime;
    }

}
