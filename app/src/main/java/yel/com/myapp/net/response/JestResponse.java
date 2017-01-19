package yel.com.myapp.net.response;

import java.util.List;

import yel.com.myapp.module.JestModel;

/**
 * Created by xxb on 2017/1/17.
 */

public class JestResponse {

    /**
     * error_code : 0
     * reason : Success
     * result : {"data":[{"content":"女生分手的原因有两个，\r\n一个是：闺蜜看不上。另一个是：闺蜜看上了。","hashId":"607ce18b4bed0d7b0012b66ed201fb08","unixtime":1418815439,"updatetime":"2014-12-17 19:23:59"},{"content":"老师讲完课后，问道\r\n\u201c同学们，你们还有什么问题要问吗？\u201d\r\n这时，班上一男同学举手，\r\n\u201c老师，这节什么课？\u201d","hashId":"20670bc096a2448b5d78c66746c930b6","unixtime":1418814837,"updatetime":"2014-12-17 19:13:57"},{"content":"\u201c老公，结婚前你不是常对我说，我是你的女神吗？\u201d\r\n\u201c老婆，现在你总该看出来，自从结婚后，我成了一个无神论者。\u201d","hashId":"1a0b402983f22b7ad6ff38787e238f6d","unixtime":1418814837,"updatetime":"2014-12-17 19:13:57"}]}
     */

    private int error_code;
    private String reason;
    private ResultBean result;

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * content : 女生分手的原因有两个，
         * 一个是：闺蜜看不上。另一个是：闺蜜看上了。
         * hashId : 607ce18b4bed0d7b0012b66ed201fb08
         * unixtime : 1418815439
         * updatetime : 2014-12-17 19:23:59
         */

        private List<JestModel> data;

        public List<JestModel> getData() {
            return data;
        }

        public void setData(List<JestModel> data) {
            this.data = data;
        }
    }
}
