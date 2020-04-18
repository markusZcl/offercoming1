package com.markus.reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Author:markusZhang
 * degree of proficiency:
 * Date:Create in 2020/4/18 22:04
 */
public class GetClass {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = Class.forName("com.markus.reflect.Person");
        //获取方法
        Method[] methods = clazz.getMethods();
        for(Method method:methods){
            System.out.println(method.toString());
        }
        System.out.println("============");
        //获取字段值
//        Field[] fields = clazz.getFields();//不包括私有属性
        Field[] fields = clazz.getDeclaredFields();//包括私有属性
        for (Field field : fields) {
            System.out.println(field.toString());
        }
        System.out.println("===========");
        //获取构造方法
//        Constructor[] constructors = clazz.getConstructors();
        Constructor[] constructors = clazz.getDeclaredConstructors();
        for (Constructor constructor:constructors){
            System.out.println(constructor.toString());
        }
        //创建对象的两种方式
    }
    @Test
    public void test01() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //创建对象
        System.out.println("创建对象的第一种方式,无参构造器");
        Class clazz = Class.forName("com.markus.reflect.Person");
        Person p = (Person) clazz.newInstance();
        System.out.println(p);
        System.out.println("创建对象的第二种方式,有参构造器");
        Constructor constructor = clazz.getConstructor(Integer.class,String.class,String.class,Integer.class);
        Person p1 = (Person) constructor.newInstance(1,"markus","男",21);
        System.out.println(p1);
    }

    @Test
    public void test02() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class clazz = Class.forName("com.markus.reflect.Person");
        Method method = clazz.getMethod("getName");
        Constructor constructor = clazz.getConstructor();
        Object obj = constructor.newInstance();
        System.out.println(method.invoke(obj));
        Method method1 = clazz.getMethod("setName", String.class);
        method1.invoke(obj,"markus");
        System.out.println(method.invoke(obj));
    }
}
