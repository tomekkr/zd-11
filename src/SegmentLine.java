class SegmentLine {
    private Point pointA;
    private Point pointB;

    public SegmentLine(Point pointA, Point pointB) {
        this.pointA = pointA;
        this.pointB = pointB;
    }

    public SegmentLine() {
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public double calculateSegmentLineLenght() {
//        |AB|=sqrt((x2−x1)^2+(y2−y1)^2)
        double partOne = (pointB.getX() - pointA.getX()) * (pointB.getX() - pointA.getX());
        double partTwo = (pointB.getY() - pointA.getY()) * (pointB.getY() - pointA.getY());
        double sum = partOne + partTwo;
        return Math.sqrt(sum);
    }
}
