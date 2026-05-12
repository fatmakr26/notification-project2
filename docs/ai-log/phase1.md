## PHASE  AI LOG

**AI’a Sorulan Soru**

"Bu projede nesne oluşturma problemini çözmek için hangi design pattern uygundur?"

**AI’ın Verdiği Yanıt**

AI, Factory Method örüntüsünü önerdi. Bildirim türlerinin ayrı sınıflarda oluşturulmasının daha doğru olacağını belirtti.

**Uygulanan Çözüm**

NotificationFactory sınıfı oluşturuldu. EmailNotification, SMSNotification ve PushNotification nesneleri bu sınıf üzerinden üretildi.

**Neden Bu Yapı Seçildi?**

Merkezi nesne üretimi sayesinde sistem daha genişletilebilir hale geldi.
