package Util;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 1 on 06.03.2018.
 */
public class Reflect {
    public static void classInfo(Class clazz) {
        StringBuilder str = new StringBuilder();

        str.append("Class name: ").append(clazz.getName()).append("\n")
                .append("Simple name: ").append(clazz.getSimpleName()).append("\n")
                .append("Canonical name: ").append(clazz.getCanonicalName()).append("\n")
                .append("This is interface? ").append(clazz.isInterface());

        System.out.println(str);
    }

    public static void reflectionInfo(Class clazz) throws NoSuchMethodException {
        StringBuilder str = new StringBuilder();

        str.append("Methods: ").append(clazz.getMethod("toString", null)).append("\n")
                .append("Constructor: ").append(clazz.getConstructor()).append("\n")
                .append("Fields: ").append(clazz.getFields());

        System.out.println(str);
    }

    public static void createObj(Class clazz) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class ex = clazz.forName(clazz.getName());
        Object obj = ex.newInstance();
    }
}


