
    import java.util.Scanner;

    public class LineComparison {
        public static void main(String[] args) {
            System.out.println("Welcome to Line Comparison Computation Program!");

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the coordinates of the first line (x1, y1, x2, y2):");
            double x1 = scanner.nextDouble();
            double y1 = scanner.nextDouble();
            double x2 = scanner.nextDouble();
            double y2 = scanner.nextDouble();

            double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            System.out.println("Length of the first line: " + length1);

            System.out.println("Enter the coordinates of the second line (x3, y3, x4, y4):");
            double x3 = scanner.nextDouble();
            double y3 = scanner.nextDouble();
            double x4 = scanner.nextDouble();
            double y4 = scanner.nextDouble();

            double length2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
            System.out.println("Length of the second line: " + length2);

            if (length1 == length2) {
                System.out.println("The two lines are equal in length.");
            } else if (length1 > length2) {
                System.out.println("The first line is longer than the second line.");
            } else {
                System.out.println("The second line is longer than the first line.");
            }

            scanner.close();
        }
    }


