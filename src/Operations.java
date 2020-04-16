class Operations {
    public double calculateSegmentLineLenght(SegmentLine segmentLine) {
        double partOne = (segmentLine.getPointB().getX() - segmentLine.getPointA().getX())
                * (segmentLine.getPointB().getX() - segmentLine.getPointA().getX());
        double partTwo = (segmentLine.getPointB().getY() - segmentLine.getPointA().getY())
                * (segmentLine.getPointB().getY() - segmentLine.getPointA().getY());
        double sum = partOne + partTwo;
        return Math.sqrt(sum);
    }

    public boolean possibilityOfBiuldingATriangle(Point pointA, Point pointB, Point pointC) {
        return !((pointA.getY() == pointB.getY() && pointA.getY() == pointC.getY()) || (pointA.getX() == pointA.getX() && pointA.getX() == pointC.getX()));
    }
}
