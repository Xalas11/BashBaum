package View;

import Model.Model;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by effi on 6/17/16.
 */
public class Viewer {

    public static int width = 400;
    public static int height = 600;

    public static void main(String[] args) {


        JFrame jf = new JFrame();

        JPanelDraw t = new JPanelDraw();

        jf.setSize(height,width);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(t);



        ActionListener taskPerformer = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // animation if wanted
            }
        };

        int delay = 10;
        new Timer(delay, taskPerformer).start();

    }
}
