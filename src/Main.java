import java.util.Scanner;

public class Main {
    public static int max(int a,int b,int c) {
        Integer x1= a;
        Integer x2=b;
        Integer x3=c;
        if(x1.compareTo(x2)>0 && x1.compareTo(x3)>0) {
            return a;
        } else if (x2.compareTo(x1)>0 && x2.compareTo(x3)>0){
            return b;
        } else {
            return c;
        }
    }
    public static double max(double a,double b,double c) {
        Double x1= a;
        Double x2=b;
        Double x3=c;
        if(x1.compareTo(x2)>0 && x1.compareTo(x3)>0) {
            return a;
        } else if (x2.compareTo(x1)>0 && x2.compareTo(x3)>0){
            return b;
        } else {
            return c;
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter 3 Integers.");
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        System.out.println("Enter 3 Decimals.");
        double a1=in.nextDouble();
        double b1=in.nextDouble();
        double c1=in.nextDouble();
        System.out.printf("Maximum among all the 3 integers.: %d\n",max(a,b,c));
        System.out.printf("Maximum among all the 3 decimals.: %f\n",max(a1,b1,c1));
        in.close();
    }
}