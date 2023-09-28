### Aliasing(İsimlendirme)

Bir dizi ismine yapılan atamalar dizinin tümüne işaret eder.
Aşağıdaki kod parçasında 2 dizi de aynı diziyi gösterir.

``` java
int[] a = new int[N];
//...
a[i] = 1234;
//...
int[] b = a;
//...
b[i] = 5678; // a[i] şimdi 5678 oldu. 
```
Sonuç olarak bir diziyi kopyalamak istiyorsak yeni diziyi tanımlamaya,
oluşturmaya ve ilk değerini vermeye ve yeni diziyi ilk diziden kopyalamaya
ihtiyacımzı vardır.
### Recursion(Özyineleme)

- Özyinelemenin temel durumu - ilk komut olarak daima return ifadesi olan bir koşul cümlesi yerleştiririz.
- Özyinelemeli çağırmalar problemin küçük alt parçalarını çözmek için kullanılmalı ve bu döngüden çıkılabilmelidir.
- Özyinelemeli çağırmalar üst üste çakışan problemler için kullanılmamalıdır.

### Nesne Tabanlı Programlama(Veri Soyutlama)

Veri soyutlamanın arkasındaki fikir, sadece önceden tanımlanmamış veri tipleri üzerinde çalışacak static metotlar değil aynı zamanda bir programa, veri tiplerini(bir dizi değer ve bu değerlerle ilgili bir dizi işlem) tanımlamak için izin vermektir.

- Modüler programlama ile kodumuzu tekrar kullanabilme imkanı verir.
- Dizilerden çok daha fazla esneklik sağlayan ve birçok özelliği ile etkin algoritmaların temelini oluşturan bağlı veri yapıları olarak adlandırılan veri yapılarının oluşturulması için uygun altyapı sağlar.
- Karşılaştığımız algoritmik zorlukları tam olarak tanımlamamıza imkan verir.




