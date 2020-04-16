class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

//    I : x>0 & y>0
//    II : x<0 & y>0
//    III : x<0 & y<0
//    IV : x>0 & y<0

    public boolean isInTheFirstQuarter() {
        return (x > 0) && (y > 0);
    }

    public boolean isInTheSecondQuarter() {
        return (x < 0) && (y > 0);
    }

    public boolean isInTheThirdQuarter() {
        return (x < 0) && (y < 0);
    }

    public boolean isInTheFourthQuarter() {
        return (x > 0) && (y < 0);
    }

    public boolean isInTheMiddle() {
        return (x == 0) && (y == 0);
    }

    public boolean isOnTheAxisX() {
        return y == 0;
    }

    public boolean isOnTheAxisY() {
        return x == 0;
    }
}
