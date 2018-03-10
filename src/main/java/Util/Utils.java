package Util;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 1 on 06.03.2018.
 */
public class Utils {
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
        //Class p = () obj;
    }

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

    public static void showMethods(Class clazz) {
        Method[] methods = clazz.getMethods();
        System.out.println("Class: " + clazz.getName());
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyAnnotation.class)) System.out.print("* ");
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

    public static void findAnnotation(Class clazz){
        //System.out.println(clazz.getAnnotation(clazz.getClass()));
        //System.out.println(clazz.isAnnotation());
    }
}


