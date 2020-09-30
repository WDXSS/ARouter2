package com.alibaba.android.arouter.facade.model;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Used for get type of target object.
 *
 * @author Alex <a href="mailto:zhilong.liu@aliyun.com">Contact me.</a>
 * @version 1.0
 * @since 17/10/26 11:56:22
 */
public class TypeWrapper<T> {
    //【1】用于保存泛型 T；
    protected final Type type;

    protected TypeWrapper() {
        //【2】调用 getClass() 获得当前类的 class 对象；
        //【3】然后再调用 getGenericSuperclass() 获得带有泛型的父类；
        Type superClass = getClass().getGenericSuperclass();
        //【4】将 superClass 强转为 ParameterizedType 类型；
        //【5】getActualTypeArguments() 返回表示此类型实际类型参数的 Type 对象的数组；
        //【6】[0] 就是这个数组中第一个了，简而言之就是获得超类的泛型参数的实际类型
        type = ((ParameterizedType) superClass).getActualTypeArguments()[0];
    }

    public Type getType() {
        return type;
    }
}
