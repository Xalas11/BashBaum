package Model;

import java.util.Stack;

/**
 * Created by effi on 6/20/16.
 */
public class TestModel {



    public static void main(String[] args) {




        //Stack init
        int height = 200;
        int width = 200;
        WayPoint w1 = new WayPoint(new Point(100,0),new Point(100,10));
        WayPoint w2 = new WayPoint(new Point(100,10),new Point(90,15));
        WayPoint w3 = new WayPoint(new Point(100,10),new Point(110,15));
        //Stack init
        Stack<WayPoint> test = new Stack<>();
        test.push(w1);
        test.push(w3);
        test.push(w2);

        Model tester = new Model(test);

        System.out.print(tester.initalizeGivenPoints().getB().getX()+" ");
        boolean stillinView = true;
        for (int i=0; i<1000; i++) {
            WayPoint temp;
            temp = tester.getNextPoint(stillinView);
            if (temp==null) {
            } else {
                System.out.println("X="+temp.getB().getX()+"Y="+temp.getB().getY());
            }
            if (temp != null && temp.getB().getX()<=width && temp.getB().getX() >= 0 && temp.getB().getY() <= height && temp.getB().getY() >= 0) {
            } else {
                stillinView = false;
            }
        }
    }
}
