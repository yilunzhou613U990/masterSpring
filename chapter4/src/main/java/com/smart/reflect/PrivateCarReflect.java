package com.smart.reflect;

import com.smart.domain.PrivateCar;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PrivateCarReflect {
    public static void main(String[] args) throws Throwable {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class clazz = loader.loadClass("com.smart.domain.PrivateCar");
        PrivateCar privateCar = (PrivateCar) clazz.newInstance();
        Field colorFld = clazz.getDeclaredField("color");
        colorFld.setAccessible(true);
        colorFld.set(privateCar, "红色");
        Method driveMtd = clazz.getDeclaredMethod("drive", (Class[]) null);
        driveMtd.setAccessible(true);
        driveMtd.invoke(privateCar, (Class[]) null);


    }
}
