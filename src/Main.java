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

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter 3 Integers.");
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        System.out.printf("Maximum among all the 3 integers.: %d\n",max(a,b,c));
        in.close();
    }
}