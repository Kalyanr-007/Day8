import java.util.Scanner;

class Line {
    private double x1, y1, x2, y2;

    public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public boolean equals(Line otherLine) {
        return (this.x1 == otherLine.x1 && this.y1 == otherLine.y1 &&
                this.x2 == otherLine.x2 && this.y2 == otherLine.y2);
    }
}

public class LineEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coordinates of the first line (x1, y1, x2, y2): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        Line line1 = new Line(x1, y1, x2, y2);

        System.out.println("Enter the coordinates of the second line (x1, y1, x2, y2): ");
        double a1 = scanner.nextDouble();
        double b1 = scanner.nextDouble();
        double a2 = scanner.nextDouble();
        double b2 = scanner.nextDouble();
        Line line2 = new Line(a1, b1, a2, b2);

        if (line1.equals(line2)) {
            System.out.println("The two lines are equal.");
        } else {
            System.out.println("The two lines are not equal.");
        }

        scanner.close();
    }
}
