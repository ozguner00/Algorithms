public class Page55Alistirmalar {
    public static void main(String[] args) {
        //1.1.7
        double t = 9.0;
        while(Math.abs(t - 9.0/t) > .001){
            t = (9.0/t + t) / 2.0;
        }
        System.out.printf("%.5f\n",t); // 3,00009

        int sumb = 0;
        for(int i = 1; i < 1000; i++)
            for(int j = 0; j < 1000; j++)
                sumb++;
        System.out.println(sumb); // sumb = 999000

        int sumc = 0;
        for(int i = 1; i < 1000; i *= 2)
            for(int j = 0; j < 1000; j++)
                sumc++;
        System.out.println(sumc); // 10000
        System.out.println("---------------------------------------------------------");
        //1.1.8
        System.out.println('b'); // b -> karakteri basar.
        System.out.println('b' + 'c'); // 197 -> ascii2 değerlerine göre matematiksel işlem yapıp ascii2 değerini basar.
        System.out.println((char) ('a' + 40));  // -> ascii2 ye göre matamatiksel işlem yapıp char type casting ile karakteri basar.
        //1.1.9 Kitapta çözüm ve açıklaması mevcut.
    }
}
