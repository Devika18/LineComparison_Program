/* As a fan of geometry, I want to compare two lines based on the end points, So that I know one line is equal, greater or
less than the other line.
- Using Java compareTo method to compare 2 Lengths is preferable.
*/

import java.util.Scanner;
public class UC3 {
    public static void main(String[] args) {
        System.out.println("Enter value for Co-ordinates: ");
        Scanner c = new Scanner(System.in);
        int x1=c.nextInt();
        int y1=c.nextInt();
        int x2=c.nextInt();
        int y2=c.nextInt();

        int result1 = Integer.compare(x1,y1);
        System.out.println("Result of compare(x1,y1)is:"+ result1);
        int result2 = Integer.compare(x2,y2);
        System.out.println("Result of compare(x2,y2)is:"+ result2);
    }
}
