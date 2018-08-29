public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint myPoint = new MyPoint(0, 0);
        System.out.println(myPoint.distance());

        myPoint = new MyPoint(10, 30);
        System.out.println(myPoint.distance());
    }
}
