import java.util.Scanner;

public class StarTower {
    /**
     * Draw Star Tower isosceles triangle
     * @param hight
     */
    public void drawStarTower(int hight){
        int k = 0;
        for (int i = 1; i <= hight; ++i, k = 0) {
            for (int space = 1; space <= hight - i; ++space) {
                System.out.print("  ");
            }
            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }
            System.out.println();
        }

        System.out.println("\n----------------------------------");
    }

    public static void main(String[] args) {
        System.out.println("Entered Star Tower height: ");
        Scanner input = new Scanner(System.in);
        int hight = input.nextInt();

        StarTower test = new StarTower();
        test.drawStarTower(hight);
    }
}
