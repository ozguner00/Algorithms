import jdk.jfr.consumer.RecordedThread;

public class Page57Alistirmalar {
    public static void main(String[] args) {
        //1.1.17
        System.out.println("ex_1_1_17exR2 fonksiyonu if kontrolüne giremeden sürekli işlem yapmaya devam ediyor ve StackOverflowError Exception fırlatır.");
        /*örnek n = 3 olarak exR2(n-3) = exR2(0) fonksiyonu için "" return olarak "" döndürmesini beklerken foksiyon
        if(n <= 0) deyimini görmeden exR2(0) için hesaplama yapmaya devam ediyor. Bu sebeple fonksiyon sonsuz kere kendini
        çağırmaya devamm edip StackOverflowError atmasına sebep oluyor.
        */
        //System.out.println("n : 6 için " + ex_1_1_17exR2(3));
        System.out.println("---------------------------------------------------------");
        //1.1.18
        System.out.println("mystery(2,25) : " + ex_1_1_18Mystery(2,25) + " mystery(3,11) : " + ex_1_1_18Mystery(3,11));
        System.out.println("mysteryMulti(2,25) : " + ex_1_1_18MysteryMulti(2,25) + " mysteryMulti(3,11) : " + ex_1_1_18MysteryMulti(3,11));
        System.out.println("mystery1(2,25) : " + ex_1_1_18Mystery1(2,25) + " mystery1(3,11) : " + ex_1_1_18Mystery1(3,11));
        System.out.println("---------------------------------------------------------");
        //1.1.19
        System.out.println("ex1_1_19Fibo(N) foknsiyonu tüm değerleri tekrar tekrar hesapladığı için yavaş çalışıyor.");
        /*
        for(int i = 0; i < 90; i++){
            System.out.println(i + " " + ex1_1_19Fibo(i));
        }*/
        int N = 90;
        long[] arrFibo = new long[N]; // Fibo dizisi oluşturduk.
        ex1_1_19FillFibo(N,arrFibo); // Fibo dizimizin içini doldurduk.
        for (int i = 0; i < N; i++){
            System.out.println(i + " " + arrFibo[i] ); // direkt olarak istediğimiz elemanı diziden yazdırdık.
        }
        //Yukarıdaki şekilde yazdığımızda performans olarak kazanç, bellek olarak zarar söz konusudur.
        System.out.println("---------------------------------------------------------");


    }

    public static String ex_1_1_17exR2(int n){
        //if(n <= 0) return ""; // burada olmalı örnek 1.1.16 da olduğu gibi.
        String s = ex_1_1_17exR2(n-3) + n + ex_1_1_17exR2(n-2) + n;
        if(n <= 0) return "";
        return s;
    }

    public static int ex_1_1_18Mystery(int a, int b){
        if(b == 0) return 0;
        if(b%2 == 0) return ex_1_1_18Mystery(a+a,b/2);
        return ex_1_1_18Mystery(a+a,b/2) + a;
    }
    public static int ex_1_1_18MysteryMulti(int a, int b){
        if(b == 0) return 0;
        if(b%2 == 0) return ex_1_1_18Mystery(a*a,b/2);
        return ex_1_1_18MysteryMulti(a*a,b/2) + a;
    }

    public static int ex_1_1_18Mystery1(int a, int b){
        if(b == 0) return 1;
        if(b%2 == 0) return ex_1_1_18Mystery(a+a,b/2);
        return ex_1_1_18Mystery1(a+a,b/2) + a;
    }
    
    public static long ex1_1_19Fibo(int N){
        if(N == 0) return 0;
        if(N == 1) return 1;
        return ex1_1_19Fibo(N-2) + ex1_1_19Fibo(N-1);
    }
    public static void ex1_1_19FillFibo(int N, long[] arr){
        arr[0] = 0; arr[1] = 1;
        for(int i = 2; i < N ; i++){
            arr[i] = arr[i-2] + arr[i-1];
        }

    }


}
