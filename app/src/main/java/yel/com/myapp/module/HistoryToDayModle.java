package yel.com.myapp.module;

/**
 * Created by xxb on 2017/1/17.
 */

public class HistoryToDayModle {
    private String _id;
    /**
     * 内容
     */
    private String title;
    /**
     * 图片
     */
    private String pic;
    /**
     * 年份
     */
    private int year;
    /**
     * 月份
     */
    private int month;
    /**
     * 日
     */
    private int day;
    /**
     * 时间+内容 多个
     */
    private String des;
    /**
     * 丁未年九月廿六
     */
    private String lunar;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getLunar() {
        return lunar;
    }

    public void setLunar(String lunar) {
        this.lunar = lunar;
    }

}
