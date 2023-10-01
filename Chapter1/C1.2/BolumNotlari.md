###  Nesnelerin Oluşturulması
Her veri tipi değeri bir nesnede saklanır. Kendi başına nesneyi 
oluşturmak(ya da somutlaştırmak) için new anahtar sözcüğünü 
kullanarak bir yapıcı çağırırız. new anahtar sözcüğü sırası ile 
sınıf ismi ve () parantez işaretleri takip eder.

Yapıcının dönüş değeri yoktur çünkü daima kendi veri tipinde bir
nesneye ait bir adresi geri döndürür. Bir programın her new() 
kullanışında sistem;
- Nesne için hafızada yer ayırır.
- Bir başlangıç değeri vermek için bir yapıcı çağırır.
- Nesneye ait bir referans döner.

İlkel tipteki değişkenlerde sık sık yaptığımız gibi istemci kodunda
nesneleri genellikle bir değişken ile bir nesneyi ilişkilendiren
bir başlangıçtanımlamasında oluştururuz. İlkel tiplerden farklı 
olarak değişkenler veri-tipi değerleri yerine nesne referansları
ile ilişkilidir.

```Eğer x ve y ilkel tiplere ait değişkenler ise bu durumda x = y ataması y'nin değerini x'e kopyalar. Referans tipler için , değer yerine referans kopyalanır.```

### Nesneler argümanlardır.

Nesneleri argüman olarak bir metoda iletebiliriz. Bir metodu 
argümanlar ile çağırdığımızda javadaki etkisi, her bir argüman
değeri bir eşitliğin solundaymış gibidir.Bu da Java'nın argüman
değerinin bir kopyasını çağıran programdan metoda göndermesidir.
Bu düzenleme, değerin iletilmesi olarak bilinir. Bu metodun önemli
bir sonucu çağıran uygulamanın değişkenin değeri metot tarafından
değiştirilememesidir. İlkel veri tipleri için bu beklediğimiz bir 
sonuçtur.(iki değişken birbirinden bağımsızdır). Ancak bu metodun
bir argümanı olarak bir referans tip kullandığımızda bir takma isim 
oluşturmuş oluruz; bu nedenle temkinli davranmalıyız. Diğer bir 
deyişle, kullanım referansı olarak değer olarak iletilmesidir.(bir
kopyasının çıkarılması). Fakat nesneyi referans olarak iletmektir.
`Sonuç olarak; metot orjinal referansı değiştiremez fakat nesnenin değerini değiştirebilir.`

```Java'da nesnelerden oluşmuş bir dizi, bu nesnelere referanslarından oluşmuş bir dizidir ve nesnelerin kendileri değildir. Eğer kullandığımız neseneler büyük nesneler ise bunları bir yerlere taşımak zorunda olmayıp sadece bunlara ait referansları taşığımızdan dolayı verimlilik kazanmış oluruz. Eğer küçük nesnelerse herhangi bir bilgi almka istediğimizde her seferinde referans takip etmek zorunda kaldığımız iiçin verimlilikten ödün vermiş oluruz.```

### Nesnelere odaklı veri soyutlama
- İstemci kodu, new yapıcsını kullanarak nesne oluşturan bir yapıcı çağırıp nesneler yaratabilir(kimlik sağlar) nesne değişkenine başlangıç değerini verip, nesneye ait bir referans döner.
- İstemci kodu nesnenin örnek değişkenleri üzerinde işlem yapan bir örnek metot çağırmak için bir nesne ile ilişkilendirilmiş bir değişkeni kullanarak veri tip değerini değiştirebilir.(Nesne davranışını kontrol eder ve durumunu değiştirebilir).
- İstemci kodu ilkel veri tipteki değişkenlerde olduğu gibi(değerlerin kendisini tutmayan değerlere referansları tutan değişkenler hariç) nesnelerden diziler oluşturarak ve bunları metotlara ileterek ve metotlara geri döndürerek nesneleri değiştirebilir.

`Nesne değişkenlerinin ilkel nümerik veri tipleri için varsayılan değeri 0, boolean tip için false ve referans tipi için null olur.`

