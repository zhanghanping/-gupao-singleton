/**
 * Copyright (C)
 * 描述:
 * 创建人:  zx
 * 2019/7/28
 *
 * @version 1.00
 */

public enum EnumSingleton {
    INSTANCE;
    private Object data; //存储对象

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static  EnumSingleton getInstance(){
        return INSTANCE;
    }
}
