# Phase 3 AI Log

## Pair Programming Süreci

Bu faz kapsamında AI ile yaklaşık 30 dakika boyunca pair programming yapılmıştır.

Süreç boyunca aşağıdaki konular tartışılmıştır:

- Behavioral pattern seçimi
- Strategy pattern yapısı
- Observer pattern kullanımı
- Sınıflar arası ilişkiler
- Runtime sırasında davranış değiştirme
- Kullanıcı abonelik sistemi oluşturma
- GitHub branch ve PR düzeni
- UML diyagram yapısı
- GitHub Actions kurulumu

---

# Süreç Nasıl İlerledi?

İlk olarak mevcut sistem analiz edildi ve behavioral pattern ihtiyacı belirlendi.

AI ile birlikte:
- farklı gönderim davranışlarının nasıl yönetileceği tartışıldı,
- Strategy pattern için uygun sınıf yapısı oluşturuldu,
- Observer pattern ile abonelik sistemi tasarlandı.

Daha sonra:
- Main.java düzenlendi,
- UML diyagramları oluşturuldu,
- README güncellendi,
- GitHub workflow yapısı planlandı.

Son aşamada:
- Pull Request düzeni,
- commit yapısı,
- GitHub Actions CI pipeline

oluşturuldu.

---

# Kullanılan Behavioral Patternler

## Strategy Pattern

Farklı gönderim davranışlarının çalışma anında değiştirilebilmesi için kullanıldı.

Kullanılan sınıflar:
- SendStrategy
- InstantSendStrategy
- DelayedSendStrategy
- NotificationContext

---

## Observer Pattern

Kullanıcıların bildirim sistemine abone olabilmesi için kullanıldı.

Kullanılan sınıflar:
- Observer
- User
- NotificationPublisher

---

# AI'ın Yardımcı Olduğu Noktalar

AI aşağıdaki konularda yardımcı oldu:

- Uygun pattern seçimi
- UML diyagram yapısı
- GitHub branch düzeni
- Pull Request hazırlığı
- GitHub Actions kurulumu
- Kod organizasyonu

Özellikle behavioral patternlerin projeye nasıl entegre edileceği konusunda faydalı yönlendirmeler sağladı.

---

# AI'ın Yanılttığı Noktalar

AI bazı durumlarda:
- gereğinden fazla sınıf önerdi,
- daha karmaşık yapılar oluşturdu,
- bazı UML ilişkilerini fazla detaylı tasarladı.

Bu nedenle daha sade ve okunabilir bir yapı tercih edildi.

---

# AI Olmadan Bu Faz Ne Kadar Sürerdi?

AI olmadan bu fazın yaklaşık 2-3 kat daha uzun süreceği düşünmekteyim.

Özellikle:
- uygun behavioral pattern seçimi,
- GitHub workflow düzeni,
- UML oluşturma,
- CI pipeline kurulumu

konularında AI önemli ölçüde zaman kazandırmıştır.

