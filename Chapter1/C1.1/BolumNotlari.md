### Algoritmalar 
- Algoritmalar veri yapıları ile iç içedir. Verinin bir algoritma tarafından etkili bir şekilde işlenmesine uygun
olarak verilerin saklanmasına yönelik şemalardır.
- Ne kadar kaynak kullanacağını hakkında fikrimiz olmayan algoritmaları kullanmamalıyız. Bu yüzden algoritmalarımızın çalışma sürelerini tahmin edebilmeliyiz.

``` java
public static int gcd(int p, int q){
        if(q == 0) return p;
        int r = p % q;
        return gcd(q,r);
    }
```
### Java Programlarının Temel Yapısı
- Bir java programını çağırmak için onu önce *javac* kodu ile derlememiz sonra da *java* komutu ile çalıştırmamız gerekmektedir.
### Temel Veri Tipleri ve İfadeleri
- +, -, *, / işlemlerinin üzerine yüklemeli(overload) olduğunun altını çizmek gerekir.Bu semboller kullanıldıkları yere bağlı olarak birçok farklı işlemi temsil edebilir.Bu temel işlemlerin en önemli özelliği, bir tipte işleme giren değerlerin yine aynı tipte bir değere sahiptir kuralıdır. Bu kural *genellikle yaklaşık değerlerle* çalıştığımız
fikrinin altını çizmektedir. Örnek olarak : 5/3 -> 1 ve 5.0/3.0 -> 1.6666666666666667
### İşlemler
- İşlem önceliği java dilinin bir özelliğidir. ( *,/, %) daha önce işleme alınır.
- Mantıksal operatörler arasında **!** en yüksek önceliklidir. Sonra sırasıyla *&&* ve *||* gelir.
### Tip Değiştirilmesi
- Bilginin kaybolmaması için sayıların otomatik olarak daha kapsamlı veri tiplerine dönüştürülmesi mümkündür.Örneğin : 1 + 2.5 ifadesi 3.5 değerini alır.
- int(3.7) ifadesinin değeri 3'tür. (Yuvarlama değil **kesme** işlemi uygulanır.)
### Komutlar
- Bir program; tanımlamalar, atamalar, koşullar, döngüler ve dönüş değerleri ile bir dizi komuttan oluştur.
- **Tanımlamalar:** Bir tanımlama komutu değşilen ismi ile bir tipi *derleme sırasında* ilişkilendirir.
- **Atamalar:** Bir atama komutu, veri tipi derleri ile değişkeni ilişkilendirir. `c = a + b ` dediğimizde bir matematiksel eşitlikten bahsetmiyoruz. a + b toplanıp c'ye atanmasını kastediyoruz.
- 
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




