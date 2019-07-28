/**
 * Copyright (C)
 * 描述:
 * 创建人:  zx
 * 2019/7/28
 *懒汉式单例双重检查锁
 * @version 1.00
 */

public class LazySafeSingleton {
    private LazySafeSingleton(){}

    private static LazySafeSingleton lazySafeSingleton = null;

    public static LazySafeSingleton getInstance(){
        if(null == lazySafeSingleton){
            synchronized (LazySafeSingleton.class){
                if(null == lazySafeSingleton){
                    lazySafeSingleton = new LazySafeSingleton();
                }
            }
        }
        return lazySafeSingleton;
    }
    /*
    当内存分配指令重排序时，我们用双重检查锁，可以规避线程安全的问题，缺点会影响性能等问题
     */
}
