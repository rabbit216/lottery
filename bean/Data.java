package lottery.bean;

/**
 * Data类的一些变量及方法
 * Created by TimAimee on 2018/9/6.
 */
public class Data {
    /**
     * 开奖期号
     */
    String expect;
    /**
     * 开奖码
     */
    String opencode;
    /**
     * 开奖时间
     */
    String opentime;
    /**
     * 开奖时间戳
     */
    int opentimestamp;
    /**
     * 一个空的构造方法
     */
    public Data() {
    }

    /**
     * 一个Data类的构造方法
     * @param expect 开奖期号
     * @param opencode 开奖码
     * @param opentime 开奖时间
     * @param opentimestamp 开奖时间戳
     */
    public Data(String expect, String opencode, String opentime, int opentimestamp) {
        this.expect = expect;
        this.opencode = opencode;
        this.opentime = opentime;
        this.opentimestamp = opentimestamp;
    }

    /**
     * 获取开奖期号
     * @return 开奖期号
     */
    public String getExpect() {
        return expect;
    }

    /**
     * 返回开奖期号
     * @param expect
     */
    public void setExpect(String expect) {
        this.expect = expect;
    }

    /**
     * 获取开奖码
     * @return 开奖码
     */
    public String getOpencode() {
        return opencode;
    }
    /**
     * 返回开奖码
     * @return 开奖码
     */
    public void setOpencode(String opencode) {
        this.opencode = opencode;
    }
    /**
     * 获取开奖时间
     * @return 开奖时间
     */
    public String getOpentime() {
        return opentime;
    }
    /**
     * 返回开奖时间
     * @return 开奖时间
     */
    public void setOpentime(String opentime) {
        this.opentime = opentime;
    }
    /**
     * 获取开奖时间戳
     * @return 开奖时间戳
     */
    public int getOpentimestamp() {
        return opentimestamp;
    }
    /**
     * 返回开奖时间戳
     * @return 开奖时间戳
     */
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
