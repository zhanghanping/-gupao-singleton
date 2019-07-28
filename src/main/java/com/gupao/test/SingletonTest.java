/**
 * Copyright (C)
 * 描述:
 * 创建人:  zx
 * 2019/7/28
 *
 * @version 1.00
 */

public class SingletonTest {

    public static void main(String[] args) {
        LazyInnerClassSingleton lazyInner = LazyInnerClassSingleton.getInstance();
        System.out.println(lazyInner);
    }
}
