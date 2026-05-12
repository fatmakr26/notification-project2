# PROBLEMS.md

## Başlangıç Kod Analizi

Başlangıçta tüm bildirim işlemleri tek bir sınıfta yapılmaktadır.

### Tespit Edilen Problemler

1. **God Class **
   - Tüm bildirim türleri (Email, SMS, Push) tek sınıfta toplanmış.
   - Bu durum bakım ve okunabilirliği zorlaştırır.

2. **if-else / switch bağımlılığı**
   - Bildirim tipi kontrolü if-else ile yapılıyor.
   - Yeni bir bildirim türü eklemek için mevcut kod değiştirilmeli.

3. **Open/Closed Principle ihlali**
   - Yeni özellik eklemek için mevcut kod değiştiriliyor.
   - Bu OCP’ye aykırıdır.

4. **Kod tekrarına açık yapı**
   - Her bildirim türü için benzer kod blokları yazılıyor.

5. **Bağımlılıkların sıkı olması**
   - Sınıf doğrudan tüm bildirim tiplerine bağımlı.
   - Esnek değil, genişletilebilir değil.



## AI Analizi

### AI ne dedi:
- Factory Pattern kullanılabilir
- Kod genişlemeye kapalı
- Nesne oluşturma sorumluluğu ayrılmalı

### Benim analizim:
- AI ile büyük ölçüde aynı
- Benim analizimde ise özellikle if-else bağımlılığı, OCP ihlali ve genişletilebilirlik problemleri olduğunu tespit ettim

### Farklar:
- AI daha çok pattern önerdi
- Ben daha çok yapısal sorunlara odaklandım
