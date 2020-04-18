package com.markus.annotation;

import java.lang.reflect.Field;

/**
 * Author:markusZhang
 * degree of proficiency:
 * Date:Create in 2020/4/18 22:56
 */
public class FruitInfoUtil {
    public static void getFruitInfo(Class<?> clazz){
        String strFruitProvider = "供应商信息：";
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            if(field.isAnnotationPresent(FruitProvider.class)){
                FruitProvider fruitProvider = field.getAnnotation(FruitProvider.class);
                //处理注解信息
                strFruitProvider = "供应商编号："+fruitProvider.id()+" 供应商名称："+fruitProvider.name()
                        +" 供应商地址："+fruitProvider.address();
                System.out.println(strFruitProvider);
            }
        }
    }
}
