package Figures;

import Util.Utils;

/**
 * Created by 1 on 06.03.2018.
 */
public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException, ClassNotFoundException {
        /*List<Shape> list = Arrays.asList(new Circle(),new
                Square());
        list.forEach(System.out::println);*/


        /*Utils.classInfo(Circle.class);
        System.out.println("--------------------------");
        Utils.reflectionInfo(Shape.class);
        System.out.println("--------------------------");
        Utils.createObj(Circle.class);
        System.out.println("--------------------------");*/
        Utils.familyTree(Circle.class);
        //Utils.test(Shape.class);

        //Object object = new Object();

        //System.out.println(Utils.haveParent(Object.class));

        //Utils.showMethods(Shape.class);

    }
}
