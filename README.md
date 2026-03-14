# Automation Bookstore Testing

## 📖 Deskripsi
Project ini berisi test case otomatisasi menggunakan **Katalon Studio** untuk menguji fitur pencarian buku di [Automation Bookstore](https://automationbookstore.dev/). Fokus utama adalah **Handling Dynamic Elements & Wait Strategy** agar eksekusi lebih stabil dan hasil verifikasi konsisten.

## 🎯 Tujuan
- Melakukan pencarian buku berdasarkan keyword (contoh: `Agile`).
- Memastikan hasil pencarian menampilkan buku yang sesuai.
- Menerapkan strategi wait untuk menangani elemen dinamis pada DOM.

## 🛠️ Tools & Framework
- Katalon Studio 11.0.1  
- Groovy scripting  
- Selenium WebDriver (via Katalon)  
- Object Repository untuk elemen UI  

## 📝 Test Case Flow
1. Open Browser dan navigasi ke URL.  
2. Click Search Bar.  
3. Input Keyword (misalnya `Agile`).  
4. Send Keys (Enter) untuk submit pencarian.  
5. Wait Strategy → `delay` / `waitForElementVisible` agar hasil stabil.  
6. Verify Text Present → cek kata `Agile` muncul.  
7. Verify Element Text → cek judul buku spesifik (contoh: `Agile Testing`).  
8. Close Browser.  

## 💡 Handling Dynamic Elements
- Gunakan `WebUI.waitForElementVisible()` sebelum verifikasi.  
- Hindari `findTestObject(null)` → pastikan semua objek ada di Object Repository.  
- Buat locator dinamis dengan XPath seperti:
  ```xpath
  //h2[contains(text(),'Agile')]
  
  
  
  ## 🚀 Eksekusi
- Jalankan test case **search dan verify keyword**.  
- Pastikan browser driver sesuai dengan versi Chrome.  
- Hasil log akan menunjukkan apakah kata **Agile** ditemukan.  
  