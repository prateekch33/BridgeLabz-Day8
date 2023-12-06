import java.util.Scanner;

public class Main<T extends Comparable<T>> {
    T a,b,c;
    public Main(T a,T b,T c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public T max(){
        return max(a,b,c);
    }
    private static <T extends Comparable<T>> T max(T a,T b,T c) {
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
        int choice;
        do{
            System.out.println("Choose any one of the following:");
            System.out.println("1. Integer");
            System.out.println("2. Floating No.");
            System.out.println("3. Strings");
            System.out.println("4. Exit");
            choice=in.nextInt();
            switch(choice) {
                case 1: {
                    System.out.println("Enter 3 Integers.");
                    Integer a=in.nextInt();
                    Integer b=in.nextInt();
                    Integer c=in.nextInt();
                    Main<Integer> ob=new Main<>(a,b,c);
                    System.out.printf("Maximum among all the 3 Integers: %s\n",ob.max());
                    break;
                }
                case 2: {
                    System.out.println("Enter 3 Floating No.");
                    Double a=in.nextDouble();
                    Double b=in.nextDouble();
                    Double c=in.nextDouble();
                    Main<Double> ob=new Main<>(a,b,c);
                    System.out.printf("Maximum among all the 3 Integers: %s\n",ob.max());
                    break;
                }
                case 3: {
                    System.out.println("Enter 3 Strings.");
                    String a=in.nextLine();
                    String b=in.nextLine();
                    String c=in.nextLine();
                    Main<String> ob=new Main<>(a,b,c);
                    System.out.printf("Maximum among all the 3 Integers: %s\n",ob.max());
                    break;
                }
                case 4:
                    break;
                default:
                    System.out.println("Wrong Choice!!");
                    break;
            }
        } while(choice!=4);
        System.out.println("Thank you!!");

        in.close();
    }
}