import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the cost of pencil");
        float pencil = scan.nextFloat();
        System.out.println("enter the cost of pen");
        float pen = scan.nextFloat();
        System.out.println("enter the cost of eraser");
        float eraser = scan.nextFloat();
        float total_cost = pencil+pen+eraser;
        System.out.println("Bill is "+ total_cost+" with out GST");
        double total_cost_with_gst = total_cost + 0.18 * total_cost ;
        System.out.println("Bill Including GST is "+ total_cost_with_gst);
    }
}
