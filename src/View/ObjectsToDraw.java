package View;

import java.awt.*;
import java.awt.geom.Line2D;
import java.util.LinkedList;


/**
 * Created by effi on 6/20/16.
 */
public class ObjectsToDraw {
    private LinkedList<Line2D> lines = new LinkedList<>();
    private LinkedList<Color> colors = new LinkedList<>();

    public void addLineAndColor(int startX, int startY, int endX, int endY, Color color) {
        startX = Viewer.height-startX;
        startY = Viewer.width-startY;
        endX = Viewer.height-endX;
        endY = Viewer.width-endY;
        lines.add(new Line2D.Double(startX,startY,endX,endY));
        colors.add(color);
    }
    public LinkedList<Line2D> getLines() {
        return lines;
    }
}
