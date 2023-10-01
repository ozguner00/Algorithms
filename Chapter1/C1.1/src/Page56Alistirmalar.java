public class Page56Alistirmalar {
    public static void main(String[] args) {
        //1.1.10
        int[] a; // int[] a = new int[10]
        for(int i = 0; i < 10; i++){
            // a[i] = i * i; // bu bölümün çalışması için yukarıdaki gibi new ile bellek ayırılmalıdır.
        }
        System.out.println("New ile a[] için bellek ayırmamaktadır. Bu kod variable a might not have been initialized derleme hatası alır.");
        System.out.println("---------------------------------------------------------");
        //1.1.11
        boolean[][] example = {{false,false,true},{true,false,true},{true,true,false},{false,true,false}};
        ex1_1_11(example);
        System.out.println("---------------------------------------------------------");
        //1.1.12
        int[] b = new int[10];
        for(int i = 0; i < 10; i++)
            b[i] = 9-i;
        for(int i = 0; i < 10; i++)
            b[i] = b[b[i]];
        for(int i = 0; i < 10; i++)
            System.out.println(i); // 0 - 1 - 2 - 3 - 4 - 5 - 6 - 7 - 8  - 9
        System.out.println("---------------------------------------------------------");
        //1.1.13
        boolean[][] res = ex1_1_13(example);
        for(boolean[] i : res){
            for(boolean j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------------------");
        //1.1.14
        System.out.println("-5 :" + ex1_1_14(-5) + " 0 :" + ex1_1_14(0) +" 15 :" + ex1_1_14(15) +" 32 :" +ex1_1_14(32));
        System.out.println("---------------------------------------------------------");
        //1.1.15
        int c[] = {1,2,3,4,5,6,3,3};
        int c2[] = {1,3,5,7,9,1};
        int M = 7;
        int[] cex = ex_1_1_15(c,M);
        int sumcex = 0;
        int sumc2ex = 0;
        System.out.println("c dizinin elemanlarının hepsi M(7) den küçük olduğu için cex değerler toplamı c.length(8) olmalı");
        for(int i : cex){
            sumcex += i;
        }
        System.out.println("sumcex : " +  sumcex + " c.length : " + c.length);
        int[] c2ex = ex_1_1_15(c2,M);
        for(int i : c2ex){
            sumc2ex += i;
        }
        System.out.println("sumc2ex : " +  sumc2ex + " c2.length : " + c2.length);
        System.out.println("---------------------------------------------------------");
        //1.1.16
        System.out.println(exR1(6)); //311361142246


    }
    public static void ex1_1_11(boolean[][] key){
        int M = key.length;
        int N = key[0].length;
        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                System.out.print("M : " + i + " N : " + j + " Value :");
                if(key[i][j] == false ) System.out.println("*");
                else System.out.println(" ");
            }
        }
    }

    public static boolean[][] ex1_1_13(boolean[][] key){
        int M = key.length;
        int N = key[0].length;
        boolean[][] key2 = new boolean[N][M];
        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                key2[j][i] = key[i][j];
            }
        }
        return key2;
    }
    // 0 ve negatif sayılar için double.Nan ve Double.NEGATIVE_INFINITY kullanabilmek için metot double yazılmıştır.
    // Büyük olmayan değer istediği için log2(32) = 5 de görüldüğü gibi eşit değerler döndürülebilir.
    public static double ex1_1_14(int N){
        int count = 0;
        double temp = N;
        if(N < 0) return  Double.NaN;
        else if(N == 0) return Double.NEGATIVE_INFINITY;
        else if(N <=2 ) return count;
        else{
            while (temp >= 2){
                count ++;
                temp /= 2;
            }
        }
        return count;
    }

    public static int[] ex_1_1_15(int[] a, int M){
        int[] histogram = new int[M];
        for(int i = 0; i < M; i++){
            for(int j = 0; j < a.length; j++){
                if(a[j] == i) histogram[i]++;
            }
        }
        return histogram;
    }

    public static String exR1(int n){
        if(n <= 0) return "";
        return exR1(n-3) + n + exR1(n-2) + n;
    }

}
