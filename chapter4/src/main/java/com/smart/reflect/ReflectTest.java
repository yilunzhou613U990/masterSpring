package com.smart.reflect;

import com.smart.domain.Car;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectTest {
    public static Car initByDefaultConst() throws Throwable {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class<?> clazz = loader.loadClass("com.smart.domain.Car");
        Constructor<?> cons = clazz.getDeclaredConstructor();
        Car car = (Car) cons.newInstance();
        Method setBrand = clazz.getMethod("setBrand", String.class);
        setBrand.invoke(car,"红旗");
        return car;
    }

    public static void main(String[] args) throws Throwable {
        Car car = initByDefaultConst();
        System.out.println(car);
    }
}
