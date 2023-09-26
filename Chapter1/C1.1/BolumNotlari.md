#Aliasing(İsimlendirme)
Bir dizi ismine yapılan atamalar dizinin tümüne işaret eder.
Aşağıdaki kod parçasında 2 dizi de aynı diziyi gösterir.
int[] a = new int[N];
...
a[i] = 1234;
...
int[] b = a;
...
b[i] = 5678; // a[i] şimdi 5678 oldu.
Sonuç olarak bir diziyi kopyalamak istiyorsak yeni diziyi tanımlamaya,
oluşturmaya ve ilk değerini vermeye ve yeni diziyi ilk diziden kopyalamaya
ihtiyacımzı vardır.

