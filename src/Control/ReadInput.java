package Control;

import Model.Point;
import Model.WayPoint;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

/**
 * Created by effi on 6/20/16.
 */
public class ReadInput {
    String fileName;
    FileReader getText = new FileReader(fileName);
    Stack<WayPoint> newStack = new Stack<>();

    int next,prev;
    public ReadInput(String fileName) throws FileNotFoundException {
        this.fileName = fileName;
    }

    public Stack getStack() throws IOException {
        Point[] points = new Point[2];
        BufferedReader bufferText = new BufferedReader(getText);

        String line = bufferText.readLine();
        next=0;
        int count=1;
        while (line!=null && next < line.length()) {

            points[count-1] = new Point(getNextCoordinate(line), getNextCoordinate(line));
            if (count%2==0) {
                count=1;
                newStack.push(new WayPoint(points[0],points[1]));
            }
            count++;
        }

        return newStack;
    }

    private int getNextCoordinate(String line) {
        prev = next;
        next = line.indexOf(',', next);
        next++;
        return Integer.parseInt(line.substring(prev, next));
    }

}
