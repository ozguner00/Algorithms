public class Page21Ex {
    public static void main(String[] args) {
        double[] arr = {2.1,3.3,4,5,6,7,1,8.2,5};
        System.out.println("Dizinin ilk hali :");
        for(double i : arr){
            System.out.print(i + " ");
        }
        //Dizi elemanlarının en büyüğünün bulunması
        double max = arr[0];
        for(double i : arr){
            if(max < i) max = i;
        }
        System.out.println();
        System.out.println("Dizinin en büyük elemanı :" + max);
        //Dizi elemanlarının ortalamasının bulunması
        double sum = 0;
        for(double i : arr){
            sum += i;
        }
        double avr = sum/ arr.length;
        System.out.println("Dizinin ortalaması :" + avr);
        //Başka bir dizinin kopyalanması
        double[] arr2 = new double[arr.length];
        for(int i = 0; i<arr.length; i++){
            arr2[i] = arr[i];
        }
        //Kopyalanan dizinin elemanlarının ters çevrilmesi
        double temp;
        for(int i = 0; i<arr.length/2; i++){
            temp = arr2[i];
            arr2[i] = arr[arr.length-i-1];
            arr2[arr.length-i-1] = temp;
        }
        System.out.println("Dizinin elemanlarının ters çevrilmiş hali.");
        for (double i : arr2){
            System.out.print(i + " ");
        }
        //İki matrisin çarpımı(Kare Matris) a[][]*b[][] = c[][]
        double[][] a = {{1,2},{3,4}};
        double[][] b = {{5,5},{1,1}};
        double[][] c = new double[a.length][b.length];
        for(int i = 0; i<a.length;i++){
            for(int j=0; j<a.length; j++){
                for(int k=0; k<a.length; k++){
                    c[i][j] += a[i][j] * b[j][i];
                }
            }
        }
        System.out.println();
        System.out.println("A Matrisi");
        for (double[] i : a){
            for (double k : i){
                System.out.print(k + " ");
            }
            System.out.println();
        }
        System.out.println("B Matrisi");
        for (double[] i : b){
            for (double k : i){
                System.out.print(k + " ");
            }
            System.out.println();
        }
        System.out.println("C Matrisi");
        for (double[] i : c){
            for (double k : i){
                System.out.print(k + " ");
            }
            System.out.println();
        }

    }
}
