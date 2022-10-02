/* As a fan of geometry, I want to model a line based on a point consisting of (x, y) co-ordinates
using the Cartesian system, So that I can calculate its length.
- A Length as 2 Points (x1, y1) and (x2, y2)
- Length of a Line = sqrt( (x2 - x1) ^ 2 + (y2- y1) ^ 2)
*/

import java.util.Scanner;
public class UC1 {
    public static void main(String[] args){
        System.out.println("Enter the value of Co-ordinates x1, y1, x2, y2: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1: ");
        int x1=sc.nextInt();
        System.out.println("Enter y1: ");
        int y1=sc.nextInt();
        System.out.println("Enter x2: ");
        int x2=sc.nextInt();
        System.out.println("Enter y2: ");
        int y2=sc.nextInt();
        double len = Math.sqrt((x2-x1)^2 + (y2-y1)^2);
        System.out.println("Length Of Line is:"+len);
    }
}
