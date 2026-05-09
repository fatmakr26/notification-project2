# 🏗 Notification System - Full Design Patterns Project

Bu proje, bir yazılımın "if-else" yığınından profesyonel tasarım örüntülerine geçiş sürecini kapsayan 2025-2026 Güz/Bahar dönemi Yazılım Tasarım Örüntüleri bireysel ödevidir.

## 📝 Projenin Amacı
Sistem; E-posta, SMS ve Push bildirimlerini yönetir. Temel amacı, tasarım örüntülerini soyut bir kavram olarak değil, "önce acıyı hissedip sonra çözümü uygulamak" felsefesiyle gerçek bir ihtiyacın çözümü olarak sunmaktır.

## 🛠 Kullanılan Örüntüler (Patterns Used)
Projede üç ana kategoride toplam 5 farklı tasarım örüntüsü uygulanmıştır:

### 1. Creational (Nesne Yaratma)
* **Factory Method:** Bildirim nesnelerinin (`Email`, `SMS`, `Push`) yaratılma sorumluluğunu `NotificationFactory` sınıfına vererek istemciyi somut sınıflardan kurtarır.

### 2. Structural (Yapısal)
* **Adapter:** Sistemin doğrudan desteklemediği `ThirdPartyEmailService` servisini, `EmailAdapter` aracılığıyla mevcut sisteme uyumlu hale getirir.
* **Facade:** Karmaşık alt sistem işlemlerini `NotificationFacade` arkasında gizleyerek istemciye basit bir `send()` metodu sunar.

### 3. Behavioral (Davranışsal)
* **Strategy:** Bildirimlerin gönderim biçimini (Anlık veya Gecikmeli) çalışma zamanında dinamik olarak değiştirmeyi sağlar.
* **Observer:** `NotificationPublisher` üzerinden kurulan abonelik sistemiyle, kayıtlı tüm kullanıcılara (Örn: Fatma, Sevil) otomatik duyuru iletilmesini sağlar.

## 📅 Proje Fazları (Phases)
Ödev, GitHub branch disiplinine uygun olarak şu aşamalardan oluşmaktadır:
* **Phase 0:** Başlangıç kodu ve tasarım sorunlarının tespiti (PROBLEMS.md).
* **Phase 1:** Creational örüntü (Factory) uygulaması.
* **Phase 2:** Structural örüntüler (Adapter & Facade) uygulaması.
* **Phase 3:** Behavioral örüntüler (Strategy & Observer) ve CI Pipeline kurulumu.

## 📊 Mimari Diyagram
Aşağıdaki görsel, projenin son halindeki tüm sınıfların ve örüntülerin birbirleriyle olan ilişkisini göstermektedir:

![UML Diyagramı](docs/diagrams/faz3_final_uml.png)

## ⚙️ Nasıl Çalıştırılır? (How to Run)
1. Projeyi bilgisayarınıza klonlayın.
2. `src/com/example/notification` klasöründeki dosyaları Java derleyicisi ile derleyin.
3. Uygulamanın giriş noktası olan **Main.java** dosyasını çalıştırın.

---

### 👤 Geliştirici
* **İsim:** Fatma
* **Bölüm:** Yazılım Mühendisliği 2. Sınıf
* **Teslim Tarihi:** 15 Mayıs 2026
