package yel.com.myapp.module;

/**
 * Created by xxb on 2017/1/17.
 */

public class JestModel {
    /**
     * 内容
     */
    private String content;
    /**
     * id
     */
    private String hashId;
    /**
     * 时间戳
     */
    private int unixtime;
    /**
     * 刷新时间
     */
    private String updatetime;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getHashId() {
        return hashId;
    }

    public void setHashId(String hashId) {
        this.hashId = hashId;
    }

    public int getUnixtime() {
        return unixtime;
    }

    public void setUnixtime(int unixtime) {
        this.unixtime = unixtime;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }
}
