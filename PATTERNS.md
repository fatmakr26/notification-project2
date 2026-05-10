# Kullanılan Tasarım Örüntüleri

---

# Factory Method

## Nerede Kullanıldı?
NotificationFactory sınıfında kullanıldı.

## Neden Kullanıldı?
Bildirim nesnelerinin merkezi şekilde oluşturulmasını sağlamak için kullanıldı.

## Kazanımlar
- Esnek yapı
- Daha temiz kod
- Yeni bildirim türü ekleme kolaylığı

---

# Facade Pattern

## Nerede Kullanıldı?
NotificationFacade sınıfında kullanıldı.

## Neden Kullanıldı?
Karmaşık bildirim işlemlerini kullanıcı için basitleştirmek amacıyla kullanıldı.

## Kazanımlar
- Daha sade kullanım
- Daha okunabilir yapı

---

# Adapter Pattern

## Nerede Kullanıldı?
EmailAdapter sınıfında kullanıldı.

## Neden Kullanıldı?
Üçüncü parti email servisini mevcut sisteme uyarlamak için kullanıldı.

## Kazanımlar
- Uyumluluk
- Mevcut kodu değiştirmeden entegrasyon

---

# Strategy Pattern

## Nerede Kullanıldı?
NotificationContext sınıfında kullanıldı.

## Neden Kullanıldı?
Farklı gönderim davranışlarını çalışma anında değiştirmek için kullanıldı.

## Kazanımlar
- Davranış değiştirilebilirliği
- Açık/Kapalı prensibine uygunluk

---

# Observer Pattern

## Nerede Kullanıldı?
NotificationPublisher sınıfında kullanıldı.

## Neden Kullanıldı?
Bildirim gönderildiğinde kullanıcıların otomatik haberdar edilmesi için kullanıldı.

## Kazanımlar
- Gevşek bağlı yapı
- Dinamik abonelik sistemi

##UML diyagramı

oncesi

<img width="641" alt="uml_oncesi_diyagramı" src="./docs/diagrams/phase1_before.png" />


sonrası

<img width="636" alt="uml_sonrası_diyagramı" src="./docs/diagrams/uml_diyagramı.PNG" />




