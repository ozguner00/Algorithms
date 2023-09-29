import java.util.Scanner;

public class Page54Alistirmalar {
    public static void main(String[] args) {

        //1.1.1
        System.out.println("(0+15) / 2 = " + (0+15) / 2 ); // 7
        System.out.println("2.0e-6 * 100000000.1 = " + 2.0e-6 * 100000000.1); // 200.0000002
        System.out.println("true && false || true && true = " + (true && false || true && true)); // true
        System.out.println("---------------------------------------------------------");

        //1.1.2
        System.out.println("(1+2.236)/2 = " + (1+2.236)/2) ; // 1.1618
        System.out.print("1+2+3+4.0 = "); System.out.println(1+2+3+4.0); // 10.0
        System.out.println("(4.1 >= 4) = " + (4.1 >= 4)); // true
        System.out.print("1 + 2 + \"3\" = "); System.out.println(1 + 2 + "3"); // 33
        System.out.println("---------------------------------------------------------");

        //1.1.3
        System.out.println("Soru 3 için 3 adet parametre girmelisiniz.");
        Scanner sc = new Scanner(System.in);
        int n = 0;
        String[] str = new String[3];
        while (n < 3){
            try {
                str[n] = sc.nextLine();
            }catch (Exception exception){
                System.out.println(exception);
            }
            n++;
        }
        System.out.println("ex1_1_3(str) : " + ex1_1_3(str));
        System.out.println("---------------------------------------------------------");

        //1.1.4
        int a = 1, b = 2, c = 3;// koşulları denemek amacıyla random değişkenler
        //if(a > b) then c = 0; // cannot resolve symbol 'then' if(a > b) c = 0;
        //if a > b {c = 0;} // '(' expected -> if (a > b) {c = 0;}
        if(a > b) c = 0; // doğru
        //if(a > b) c = 0 else b = 0; // ';' expected -> if(a > b) c = 0; else b = 0;
        System.out.println("---------------------------------------------------------");

        //1.1.5
        double x = 0.000000000000000000000000000000000000000000000000000000000000000000000000000001,y = 0.9999999999999999; //testcase
        System.out.println("ex1_1_5(x,y) : " + ex1_1_5(x,y));
        System.out.println("---------------------------------------------------------");

        //1.1.6
        int f = 0;
        int g = 1;
        for(int i = 0; i <= 15; i++){
            System.out.println(f);
            //System.out.println("g = " + g);
            f = f + g;
            g = f - g;
        }
        System.out.println("---------------------------------------------------------");

    }
    //1.1.3 Method
    public static boolean ex1_1_3(String[] a){

        if(a[0].equals(a[1]) && a[1].equals(a[2])) return true;
        return false;
    }

    //1.1.5 Method
    public static boolean ex1_1_5(double x, double y){
        if (x > 0 && x < 1 && y > 0 && y < 1) {
            return true;
        }
        return false;
    }


}
