public class Page23Ex {
    public static void main(String[] args) {
        System.out.println("Metodlar kitaptakinin aynısıdır. Test için yazılmıştır.");
    }
    //Sayının mutlak değerini bulmak
    public static int abs(int x){
        if(x < 0) return -x;
        return x;
    }
    //Asal sayı testi
    public static boolean isPrime(int N){
        if(N < 2 ) return false;
        for(int i=2; i*i<=N; i++){
            if(N%i == 0) return false;
        }
        return true;
    }
    //Karakök bulma(Newton Yöntemi)
    public static double sqrt(double num){
        if(num < 0.0) return Double.NaN;
        double err = 1e-15;
        double temp = num;
        while(Math.abs(temp-num/temp) > err*temp){
            temp = (num/temp + num) / 2.0;
        }
        return temp;
    }
    //Dik üçgenin hipotenüsü
    public static double hypotenuse(double a, double b){
        return sqrt(a*a + b*b);
    }
    //Harmonik sayılar
    public static double H(int N){
        double sum = 0;
        for(int i = 1; i<=N; i++){
            sum += 1.0/i;
        }
        return sum;
    }


}
