package Realization;

import Annotation.Sum;

import java.lang.reflect.Method;

public class Test {
    public static void ref(Class<?> ... classes) {
        MyMethod mm = new MyMethod();
        try {
            for (Class<?> cls : classes) {
                Method[] myMethod = cls.getDeclaredMethods();
                for (Method method : myMethod) {
                    if (method.isAnnotationPresent(Sum.class)) {
                        Sum sum = method.getAnnotation(Sum.class);
                        int res = (int)method.invoke(mm, sum.value1(), sum.value2());
                        System.out.println(res);
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
