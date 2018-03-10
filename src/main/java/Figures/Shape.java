package Figures;

import Util.MyAnnotation;

/**
 * Created by 1 on 06.03.2018.
 */
public abstract class Shape {

    @MyAnnotation
    public void draw() {
        System.out.println(this + ".draw");
    }

    public abstract String toString();
}
