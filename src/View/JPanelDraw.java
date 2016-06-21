package View;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

public class JPanelDraw extends JPanel {
    public ObjectsToDraw asd = new ObjectsToDraw();

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.green);
        g2.setStroke(new BasicStroke(4));

        asd.addLineAndColor(300,0,300,100, Color.cyan);
        for (Line2D n: asd.getLines()) {
            g2.draw(n);
        }
    }
}
