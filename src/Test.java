public class Test {
    public static void main(String[] args) {
        Point pointA = new Point(1.0, 6.0);
        Point pointB = new Point(3.0, -6.0);

        SegmentLine segmentLine = new SegmentLine(pointA, pointB);

        System.out.println("Długość odcinka: " + segmentLine.calculateSegmentLineLenght());

        Operations oper = new Operations();

        System.out.println("Długość odcinka: " + oper.calculateSegmentLineLenght(segmentLine));

        Point pointC = new Point(6.0, 3.0);

        System.out.println("Czy z podanych trzech punktów można zbudować trójkąt? "
                + oper.possibilityOfBiuldingATriangle(pointA, pointB, pointC));
    }
}
