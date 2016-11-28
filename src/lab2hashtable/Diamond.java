package lab2hashtable;

/**
 * Created by 1 on 30.10.2016.
 */
class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

public class Diamond {
    Point x1;
    Point x2;
    Point x3;
    Point x4;


    //length of sides


    public Diamond() {
        this.x1 = new Point((int) (Math.random() * 10), (int) (Math.random() * 10));
        this.x2 = new Point((int) (Math.random() * 10), (int) (Math.random() * 10));
        this.x3 = new Point((int) (Math.random() * 10), (int) (Math.random() * 10));
        this.x4 = new Point((int) (Math.random() * 10), (int) (Math.random() * 10));
    }

    public static double getDistance(Point p1, Point p2) {
        if (p1 != null && p2 != null) {
            double diffX = p1.getX() - p2.getX();
            double diffY = p1.getY() - p2.getY();
            double dist = Math.sqrt(diffX * diffX + diffY * diffY);
            return dist;
        } else System.out.println("Points are null");
        return 0;
    }

    public int getPerimetr() {
        int perim;
        perim = (int) getDistance(x1, x2) + (int) getDistance(x2, x3) +
                (int) getDistance(x3, x4) + (int) getDistance(x4, x1);
        return perim;
    }

    /*
    public void setPerimeter(int value)
    {
   this.perimeter=value;
        private int perimeter = this.getPerimetr();
    }
    */
    boolean isDiamond() {
        if ((int) getDistance(x1, x2) == (int) getDistance(x2, x3)
                && (int) getDistance(x3, x4) == (int) getDistance(x4, x1) &&
                (int) getDistance(x3, x4) == (int) getDistance(x1, x2)) {
            return true;
        } else return false;
    }

    //Площадь ромба равна половине произведения его диагоналей.
    public int getSquare() {
        int diag1 = (int) getDistance(x1, x3);
        int diag2 = (int) getDistance(x2, x4);
        int square = (diag1 * diag2) / 2;

        return square;
    }

    @Override
    public String toString() {
        return "Diamond " + " point1 = " + this.x1.getX() + ", " + this.x1.getY() + " point2= " +
                this.x2.getX() + ", " + this.x2.getY() +
                " point3= " +
                this.x3.getX() + ", " + this.x3.getY() + " point4= " +
                this.x4.getX() + ", " + this.x4.getY();
    }


}
