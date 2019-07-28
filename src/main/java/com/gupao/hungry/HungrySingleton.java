/**
 * Copyright (C)
 * 描述:
 * 创建人:  zx
 * 2019/7/28
 *饿汉式单例
 * @version 1.00
 */

public class HungrySingleton {
    private HungrySingleton(){}

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
    /*
       饿汉式单例模式在类加载时就已经创建了对象，所以称之为“饿汉式单例”
       优点：没有用加上任何锁的机制执行效率高，final关键字修饰线程安全
       缺点：不管用与不用都会创建，浪费了内存
     */
}
