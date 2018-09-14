package lottery.bean;

import java.util.ArrayList;

/**
 * Lottery类的一些变量及方法
 * Created by TimAimee on 2018/9/6.
 */
public class Lottery {
    int rows;
    String code;
    String info;
    ArrayList<Data> data;

    public Lottery() {
    }

    public Lottery(int rows, String code, String info, ArrayList<Data> data) {
        this.rows = rows;
        this.code = code;
        this.info = info;
        this.data = data;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public ArrayList<Data> getData() {
        return data;
    }

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
