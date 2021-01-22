package net.evil.esm.utils;

/**
 * 用于统一返回Jsong数据格式，
 *  code用于判断接口是否成功
 *  data用于封装返回前端的数据
 *  msg用户描述接口成功或失败信息
 */
public class JsonData {
    private int code;                   // 0：成功 -1：失败
    private Object data;                //返回请求处理后的返回数据
    private String msg;                 //描述接口成功或失败信息

    /**
     * 构造方法
     */
    public JsonData(){}

    public JsonData(int code,Object data){
        this.code = code;
        this.data = data;
    }
    public JsonData(int code,Object data,String msg){
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    /**
     * get set 方法
     * @return
     */
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * 静态初始化方法
     * @param data
     * @return
     */
    public static JsonData buildSuccess(Object data){
        return new JsonData(0,data);
    }
    public static JsonData bulidError(String msg){
        return new JsonData(-1,"",msg);
    }
    public static JsonData buildError(String msg,int code){
        return new JsonData(code,"",msg);
    }

    @Override
    public String toString() {
        return "JsonData{" +
                "code=" + code +
                ", data=" + data +
                ", msg='" + msg + '\'' +
                '}';
    }
}


