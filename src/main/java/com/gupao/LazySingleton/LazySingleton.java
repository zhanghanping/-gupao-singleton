/**
 * Copyright (C)
 * 描述:
 * 创建人:  zx
 * 2019/7/28
 *懒汉式单例模式
 * @version 1.00
 */

public class LazySingleton {
    private LazySingleton(){}

    private static  LazySingleton lazySingleton = null;

    public static LazySingleton getInstance(){
        if(null == lazySingleton){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
    /*
    这种懒汉式会有线程安全问题
    当多个线程调用getInstance方法时，如果第一个线程竞争到这个方法会创建实例，
    当第二个线程调用时则它已经有实例了所以会是单利的模型，但是当两个线程同时调用时，
    则会创建两个实例，这个时候就会表现出线程不安全问题。
     */

}
