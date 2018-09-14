package lottery.bean;

import java.util.ArrayList;

/**
 * Lottery类的一些变量及方法
 * Created by TimAimee on 2018/9/6.
 */
public class Lottery {
    /**
     * 开奖信息行
     */
    int rows;
    /**
     * cqssc(重庆时时彩)
     */
    String code;
    /**
     * 信息
     */
    String info;
    /**
     * 一个data集合
     */
    ArrayList<Data> data;

    /**
     * 一个空的构造方法
     */
    public Lottery() {
    }

    /**
     * 一个lottery类的构造方法
     * @param rows 开奖信息行
     * @param code cqssc(重庆时时彩)
     * @param info 信息
     * @param data 一个data集合
     */
    public Lottery(int rows, String code, String info, ArrayList<Data> data) {
        this.rows = rows;
        this.code = code;
        this.info = info;
        this.data = data;
    }

    /**
     * 获取开奖信息行
     * @return 开奖信息行
     */
    public int getRows() {
        return rows;
    }
    /**
     * 返回开奖信息行
     * @return 开奖信息行
     */
    public void setRows(int rows) {
        this.rows = rows;
    }
    /**
     * 获取cqssc(重庆时时彩)
     * @return cqssc(重庆时时彩)
     */
    public String getCode() {
        return code;
    }
    /**
     * 返回cqssc(重庆时时彩)
     * @return cqssc(重庆时时彩)
     */
    public void setCode(String code) {
        this.code = code;
    }
    /**
     * 获取信息
     * @return 信息
     */
    public String getInfo() {
        return info;
    }
    /**
     * 返回信息
     * @return 信息
     */
    public void setInfo(String info) {
        this.info = info;
    }
    /**
     * 获取data集合
     * @return data集合
     */
    public ArrayList<Data> getData() {
        return data;
    }
    /**
     * 返回data集合
     * @return data集合
     */
    public void setData(ArrayList<Data> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Lottery{" +
                "rows=" + rows +
                ", code='" + code + '\'' +
                ", info='" + info + '\'' +
                ", data=" + data +
                '}';
    }
}
