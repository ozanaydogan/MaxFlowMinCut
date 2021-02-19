# MaxFlowMinCut
Max Flow ve Min cut algoritmalarıyla maksimum kapasitede su akışının tespiti

ilk olarak kaç adet boru bağlantı noktası olduğunu tespit ediyoruz,
daha sonra suyun girdiği düğümü ve suyun çıktığı düğümleri belirliyoruz, 1. düğümü 0. düğüm olarak girmeliyiz, yani -1 olarak düşünülmeli

![2](https://user-images.githubusercontent.com/49997690/108436647-e20d1d00-725c-11eb-9c9b-e158a3b03c16.PNG)

düğümleri birbirine bağlayan boruların kapasitelerini belirliyoruz,

2. düğümden 3. düğüme 8 kapasiteli boru kullandık

![3](https://user-images.githubusercontent.com/49997690/108437597-bab74f80-725e-11eb-8c90-42cae6c34102.PNG)

deneme butonuna tıkladıktan sonra karşımıza oluşturduğumuz boru hattı gelecek.

![4](https://user-images.githubusercontent.com/49997690/108436696-f6511a00-725c-11eb-97ff-58527716e9ac.PNG)

max flow butonuna tıklayarak, giriş düğümünden çıkış düğümüne kadar suyun kaç kapasitede ulaşacağını ve hangi borulardan geçeceğini görmüş oluruz,

![5](https://user-images.githubusercontent.com/49997690/108436713-fe10be80-725c-11eb-9f2f-692e92237704.PNG)

min cut butonuna tıklayarak, en az sayıda hangi boru hatlarını yok edersek girişten çıkışa su akışını durdurma durumunu incelemiş oluruz.

![6](https://user-images.githubusercontent.com/49997690/108437606-c0ad3080-725e-11eb-97db-c0c55b348e9a.PNG)

görüldüğü gibi kesilmesi gereken borular kırmızı renkli gösterilmiş.

MAX FLOW için "Ford Fulkerson", min cut için "EDMONDS KARP" algoritmaları kullanılmıştır.
