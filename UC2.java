/*As a fan of geometry, I want to check equality of two lines based on the end points,So
that I know when two lines are the equal.
- Using Java equals method to check equality of 2 Lengths is preferable.
*/

import java.util.Scanner;
public class UC2 {
    public static void main(String[] args){
        System.out.println("Enter value for Co-ordinates: ");
        Scanner c = new Scanner(System.in);
        Integer x1=c.nextInt();
        Integer y1=c.nextInt();
        Integer x2=c.nextInt();
        Integer y2=c.nextInt();
        boolean result1 = x1.equals(y1);
        System.out.println("Result of equals()="+result1);
        boolean result2 = x2.equals(y2);
        System.out.println("Result of equals()="+result2);
    }
}
