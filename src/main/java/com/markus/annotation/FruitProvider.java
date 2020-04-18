package com.markus.annotation;

import java.lang.annotation.*;

/**
 * Author:markusZhang
 * degree of proficiency:
 * Date:Create in 2020/4/18 22:52
 */
@Target(value = {ElementType.FIELD})
@Retention(value = RetentionPolicy.RUNTIME)
@Documented
public @interface FruitProvider {
    //供应商编号
    public int id() default -1;
    //供应商名称
    public String name() default "";
    //供应商地址
    public String address() default "";
}
