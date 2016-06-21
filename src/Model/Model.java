package Model;

import java.util.Stack;

public class Model {
    Stack<WayPoint> stack;

    public Model(Stack<WayPoint> stack) {
        this.stack = stack;
    }

    public WayPoint initalizeGivenPoints() {
        WayPoint temp;
        temp = stack.pop();
        return temp;
    }

    public WayPoint getNextPoint(boolean stillInVision) {
        WayPoint temp;
        if (!stack.empty()) {
        if (stillInVision) {
            temp = stack.pop();
            pushNextPoints(temp);
        } else {
            stack.pop();
            temp = null;
        }
        return temp;
        }
        return null;
    }

    private void pushNextPoints(WayPoint root) {
        int x,y;
        x = root.getB().getX()+5;
        y = root.getB().getY()+5;
        stack.push(new WayPoint(root.getB(), new Point(x,y)));
        x = root.getB().getX()-5;
        y = root.getB().getY()+5;
        stack.push(new WayPoint(root.getB(), new Point(x,y)));
    }
}
