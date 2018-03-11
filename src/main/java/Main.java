import Figures.Circle;
import Figures.Shape;
import Figures.Square;
import Util.AnnotationWork;
import Util.Reflect;

import java.util.Arrays;
import java.util.List;

/**
 * Created by 1 on 06.03.2018.
 */
public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException, ClassNotFoundException {
        List<Shape> list = Arrays.asList(new Circle(), new Square());
        list.forEach(System.out::println);

        Reflect.classInfo(Circle.class);
        System.out.println("--------------------------");

        Reflect.reflectionInfo(Shape.class);
        System.out.println("--------------------------");

        Reflect.createObj(Circle.class);
        System.out.println("--------------------------");

        AnnotationWork.familyTree(Circle.class);
    }
}
