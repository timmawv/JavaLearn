package avlyakulov.timur.tp;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;


public class DonutPolygon {


    public static void main(String[] args) throws Exception {

        Polygon out1 = new Polygon(new int[]{60,180,240,180,30}, new int[]{60,30,90,240,150}, 5);
        Polygon in1 = new Polygon(new int[]{120,150,180,150,120}, new int[]{60,60,90,120,90}, 5);
        Polygon in2 = new Polygon(new int[]{60,120,120,150,150,90,90,60}, new int[]{120,120,150,150,180,180,150,150}, 8);

        Area area = new Area();
        area.add(new Area(out1));
        area.subtract(new Area(in1));
        area.subtract(new Area(in2));

        // print PathIterator
        printPathIterator(area.getPathIterator(new AffineTransform()));
        long time = System.currentTimeMillis();
// some code
        BufferedImage image = new BufferedImage(300, 300, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = image.createGraphics();
        g.setPaint(Color.BLUE);
        g.fill(area);
        g.setStroke(new BasicStroke(5.0f));
        g.setPaint(Color.RED);
        g.draw(area);
        g.dispose();
        System.out.print("Швидкість роботи програми ");
        System.out.println(System.currentTimeMillis() - time);


        ImageIO.write(image, "png", new File("donut_polygon.png"));
    }

    private static void printPathIterator(PathIterator pi) {

        switch (pi.getWindingRule()) {
            case PathIterator.WIND_EVEN_ODD:
                System.out.println("WindingRule: WIND_EVEN_ODD");
                break;
            case PathIterator.WIND_NON_ZERO:
                System.out.println("WindingRule: WIND_NON_ZERO");
                break;
        }

        while (!pi.isDone()) {
            double coords[] = new double[6];
            int type = pi.currentSegment(coords);
            switch (type) {
                case PathIterator.SEG_MOVETO:
                    System.out.print("SEG_MOVETO: ");
                    break;
                case PathIterator.SEG_CLOSE:
                    System.out.print("SEG_CLOSE: ");
                    break;
                case PathIterator.SEG_LINETO:
                    System.out.print("SEG_LINETO: ");
                    break;
                case PathIterator.SEG_CUBICTO:
                    System.out.print("SEG_CUBICTO: ");
                    break;
                case PathIterator.SEG_QUADTO:
                    System.out.print("SEG_QUADTO: ");
                    break;
            }
            System.out.println(
                    "(" + coords[0] + "," + coords[1] + ") " +
                            "(" + coords[2] + "," + coords[3] + ") " +
                            "(" + coords[4] + "," + coords[5] + ")");
            pi.next();
        }
    }
}