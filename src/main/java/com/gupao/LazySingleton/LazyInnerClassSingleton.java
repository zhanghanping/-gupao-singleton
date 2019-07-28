/**
 * Copyright (C)
 * 描述:
 * 创建人:  zx
 * 2019/7/28
 *静态内部类单例模式
 * @version 1.00
 */

public class LazyInnerClassSingleton {

    //规避反射
    private LazyInnerClassSingleton(){
        if(null != InnerSingleton.lazyInner){
            throw new RuntimeException("不予许创建多个实例");
        }
    }

    //final 保证方法不会被重写
    //只有在调用该方法时才会去加载内部类
    public static final LazyInnerClassSingleton getInstance(){
        return InnerSingleton.lazyInner;
    }

    //内部类
    private static class InnerSingleton{
        private static final LazyInnerClassSingleton lazyInner = new LazyInnerClassSingleton();
    }
}
