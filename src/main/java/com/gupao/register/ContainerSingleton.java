import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Copyright (C)
 * 描述:
 * 创建人:  zx
 * 2019/7/28
 *容器单例
 * @version 1.00
 */

public class ContainerSingleton {

    private ContainerSingleton(){}

    private static Map<String,Object> ioc = new ConcurrentHashMap<>();

    public static Object getInstance(String className){
        synchronized (ioc){
            if(!ioc.containsKey(className)){
                Object obj = null;
                try {
                    obj =   Class.forName(className).newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return obj;
            }else{
                return ioc.get(className);
            }

        }
    }
}
