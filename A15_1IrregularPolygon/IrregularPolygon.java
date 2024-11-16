import java.awt.Color;
import java.awt.geom.*;
import java.util.*;
import gpdraw.*;

/**
 * TODO Write a one-sentence summary of your class here. TODO Follow it with
 * additional details about its purpose, what abstraction it represents, and how
 * to use it.
 *
 * @author TODO Your Name
 * @version TODO Date
 * @author Period - TODO Your Period
 * @author Assignment - TODO Assignment Name
 * @author Sources - TODO list collaborators
 */
public class IrregularPolygon
{
    private DrawingTool               pen; // = new DrawingTool(new
                                           // SketchPad(300, 300, 0));
    private ArrayList<Point2D.Double> myPolygon;

    // constuctors

    public IrregularPolygon()
    {
        myPolygon = new ArrayList<>();
    }


    // public methods
    public void add(Point2D.Double aPoint)
    {
        myPolygon.add(aPoint);

    }


    public double perimeter()
    {
        double perimeter = 0;
        for (int i = 0; i < myPolygon.size(); i++)
        {
            if (i >= myPolygon.size()-1)
            {
                double xComp = Math.pow(myPolygon.get(i).getX() - myPolygon.get(0).getX(), 2);
                double yComp = Math.pow(myPolygon.get(i).getY() - myPolygon.get(0).getY(), 2);
                double distance = Math.sqrt(xComp + yComp);
                perimeter += distance;
            }
            else
            {
                double xComp = Math.pow(myPolygon.get(i).getX() - myPolygon.get(i + 1).getX(), 2);
                double yComp = Math.pow(myPolygon.get(i).getY() - myPolygon.get(i + 1).getY(), 2);
                double distance = Math.sqrt(xComp + yComp);
                perimeter +=  distance;
            }

        }

        return perimeter;
    }


    public double area()
    {
        double area = 0;
        for (int i = 0; i < myPolygon.size(); i++)
        {
            if (i >= myPolygon.size() - 1)
            {
                double xComp = myPolygon.get(i).getX();
                double yComp = myPolygon.get(0).getY();
                double distance = xComp * yComp;
                // System.out.println(xComp + " " + yComp + " " + distance);

                area += distance;
            }
            else
            {
                double xComp = myPolygon.get(i).getX();
                double yComp = myPolygon.get(i + 1).getY();
                double distance = xComp * yComp;
                // System.out.println(xComp + " " + yComp + " " + distance);

                area += distance;
            }

        }

        for (int i = 0; i < myPolygon.size(); i++)
        {
            if (i >= myPolygon.size() - 1)
            {
                double xComp = myPolygon.get(0).getX();
                double yComp = myPolygon.get(i).getY();
                double distance = xComp * yComp;
                // System.out.println(xComp + " " + yComp + " " + distance);
                area -= distance;
            }
            else
            {
                double xComp = myPolygon.get(i + 1).getX();
                double yComp = myPolygon.get(i).getY();
                double distance = xComp * yComp;
                // System.out.println(xComp + " " + yComp + " " + distance);

                area -= distance;
            }

        }

        return Math.abs(0.5 * area);
    }


    public void draw()
    {
        System.out.println("ji");

    }


    public static void main(String[] args)
    {
        IrregularPolygon a = new IrregularPolygon();
        a.add(new Point2D.Double(1, 1));
        a.add(new Point2D.Double(1, 2));
        a.add(new Point2D.Double(2, 2));
        a.add(new Point2D.Double(2, 1));

        a.perimeter();
        System.out.println(a.area());

    }
}
