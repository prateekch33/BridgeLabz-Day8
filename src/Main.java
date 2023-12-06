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
    public static String max(String a,String b,String c) {

        if(a.compareTo(b)>0 && a.compareTo(c)>0) {
            return a;
        } else if (b.compareTo(a)>0 && b.compareTo(c)>0){
            return b;
        } else {
            return c;
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter 3 Strings.");
        String a=in.nextLine();
        String b=in.nextLine();
        String c=in.nextLine();
        System.out.printf("Maximum among all the 3 Strings.: %s\n",max(a,b,c));

        in.close();
    }
}