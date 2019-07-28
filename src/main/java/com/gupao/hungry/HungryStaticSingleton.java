/**
 * Copyright (C)
 * 描述:
 * 创建人:  zx
 * 2019/7/28
 *
 * @version 1.00
 */

public class HungryStaticSingleton {
    private HungryStaticSingleton(){}

    private static final HungryStaticSingleton hungryStatic;

    static {
        hungryStatic = new HungryStaticSingleton();
    }

    public static HungryStaticSingleton getInstance(){
        return hungryStatic;
    }
}
