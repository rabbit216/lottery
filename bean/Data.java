package lottery.bean;

/**
 * Data类的一些变量及方法
 * Created by TimAimee on 2018/9/6.
 */
public class Data {
    String expect;
    String opencode;
    String opentime;
    int opentimestamp;

    public Data() {
    }

    public Data(String expect, String opencode, String opentime, int opentimestamp) {
        this.expect = expect;
        this.opencode = opencode;
        this.opentime = opentime;
        this.opentimestamp = opentimestamp;
    }

    public String getExpect() {
        return expect;
    }

    public void setExpect(String expect) {
        this.expect = expect;
    }

    public String getOpencode() {
        return opencode;
    }

    public void setOpencode(String opencode) {
        this.opencode = opencode;
    }

    public String getOpentime() {
        return opentime;
    }

    public void setOpentime(String opentime) {
        this.opentime = opentime;
    }

    public int getOpentimestamp() {
        return opentimestamp;
    }

    public void setOpentimestamp(int opentimestamp) {
        this.opentimestamp = opentimestamp;
    }

    @Override
    public String toString() {
        return "Data{" +
                "expect='" + expect + '\'' +
                ", opencode='" + opencode + '\'' +
                ", opentime='" + opentime + '\'' +
                ", opentimestamp=" + opentimestamp +
                '}';
    }
}
