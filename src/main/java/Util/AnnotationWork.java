package Util;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 1 on 11.03.2018.
 */
public class AnnotationWork {
    public static void familyTree(Class clazz) throws NoSuchMethodException {
        List<Class> parentList = new ArrayList<>();
        boolean next = haveParent(clazz);
        if (!next) {
            System.out.println(clazz.getName() + " don't have a parent.");
            showMethods(clazz);
        } else {
            Class temp;
            parentList.add(clazz);
            for (int i = 0; ; i++) {
                temp = parentList.get(i);
                showMethods(temp);
                if (haveParent(temp)) {
                    temp = parentList.get(i).getSuperclass();
                    parentList.add(temp);
                } else {
                    return;
                }
            }
        }
    }

    private static void showMethods(Class clazz) {
        Method[] methods = clazz.getDeclaredMethods();
        System.out.println("Class: " + clazz.getName());
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyAnnotation.class)) {
                System.out.print("* ");
            }

            System.out.println("Method name: " + method.getName() + "()");
            System.out.println("Return type: " + method.getReturnType().getName());
            System.out.println("");
        }
        System.out.println("-------------------------------");
        System.out.println("");
    }

    private static boolean haveParent(Class clazz) {
        boolean parent = false;
        if (clazz.getSuperclass() != null) parent = true;
        return parent;
    }
}
