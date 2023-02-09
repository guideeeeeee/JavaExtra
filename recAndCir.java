import java.util.Scanner;
public class recAndCir{
  public static void main(String[]args){
    Scanner sn = new Scanner(System.in);
    System.out.println("Enter a point with two coordinates:");
    double x = sn.nextDouble();
    double y = sn.nextDouble();
    double distance = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    if (distance <= 7){
      if (Math.abs(x)<=(12/2) && (Math.abs(y)<=(10/2))){
        System.out.printf("Point(%.1f,%.1f) is in the circle and the rectangle",x,y);
      }
      else
        System.out.printf("Point(%.1f,%.1f) is in the circle but the point is not in the rectangle",x,y);
    }
    else
      System.out.printf("Point(%.1f,%.1f) is not in the circle",x,y);
  }
}