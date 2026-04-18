# 🍰 Modul 7 - Polimorphisme

> Praktikum OOP Java — Studi Kasus Toko Kue

## 📖 Deskripsi

Proyek ini merupakan implementasi konsep **Polimorfisme** dalam pemrograman berorientasi objek (OOP) menggunakan Java. Studi kasus yang digunakan adalah sistem pencatatan kue pada sebuah toko, di mana terdapat dua jenis kue: **Kue Jadi** (ready stock) dan **Kue Pesanan** (order by weight).

---

## 🗂️ Struktur Proyek

```
Modul7-Polimorphisme/
└── src/
    ├── App.java          # Entry point — menjalankan demo daftar kue
    ├── Kue.java          # Abstract class (parent)
    ├── KueJadi.java      # Subclass — kue ready stock (harga per jumlah)
    └── KuePesanan.java   # Subclass — kue pesanan (harga per berat)
```

---

## 🧩 Diagram Kelas


<img src="Class Diagram.png">


---

## ⚙️ Konsep OOP yang Diimplementasikan

| Konsep | Penerapan |
|---|---|
| **Abstract Class** | `Kue` sebagai blueprint yang tidak bisa di-instantiate langsung |
| **Inheritance** | `KueJadi` dan `KuePesanan` mewarisi `Kue` |
| **Polymorphism** | Array `Kue[]` menampung objek dari subclass yang berbeda |
| **Method Overriding** | `hitungHarga()` dan `getInfo()` di-override di setiap subclass |
| **Encapsulation** | Field `berat` pada `KuePesanan` bersifat `private` |

---

## 🚀 Cara Menjalankan

### Prasyarat
- Java JDK 8 atau lebih baru
- Terminal / Command Prompt

### Kompilasi & Jalankan

```bash
# Masuk ke direktori src
cd Modul7-Polimorphisme/src

# Kompilasi semua file Java
javac *.java

# Jalankan program
java App
```

### Contoh Output

```
1. Nama : Croissant
   Harga : 100000.00
   Berat : 3.00

2. Nama : Tart
   Harga : 200000.00
   Jumlah : 3.0

...
```

---

## 📌 Catatan

- `KuePesanan` → harga dihitung berdasarkan **berat (kg)**
- `KueJadi` → harga dihitung berdasarkan **jumlah (pcs)**
- Method `hitungHarga()` belum dipanggil di `App.java`, sehingga harga yang ditampilkan masih merupakan **harga satuan**, bukan total

### 🐛 Known Issue

Di `Kue.java`, label print untuk `harga` salah:

```java
// ❌ Sekarang
System.out.printf("Nama : %.2f\n", this.harga);

// ✅ Seharusnya
System.out.printf("Harga : %.2f\n", this.harga);
```

*Mata Kuliah Pemrograman Berorientasi Objek — Universitas Brawijaya*