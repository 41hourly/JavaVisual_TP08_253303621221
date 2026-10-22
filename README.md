## TP8 — Character Manager Sprint #3 (MainWindow, Data Dinamis & Analisis MVC)

### 2. Screenshot Aplikasi
1. Screenshot 2026-10-22 134433.png
2. Screenshot 2026-10-22 135148.png

### 2. Aliran Data & Kaitannya dengan Prinsip MVC
* Aliran data dimulai dari kelas `Main` yang menginisialisasi objek dan mendaftarkan data karakter ke dalam `CharacterManager`.
* `CharacterManager` bertindak sebagai **Model** yang menyimpan serta mengelola seluruh data koleksi karakter dan perhitungan logika bisnis[cite: 1].
* Objek data tersebut kemudian diteruskan ke `MainWindow` yang bertindak sebagai **View** untuk dirender dan ditampilkan secara dinamis ke antarmuka grafis pengguna[cite: 1].
* Pemisahan tugas ini menerapkan prinsip arsitektur **MVC (Model-View-Controller)**, di mana logika data terisolasi dari tampilan visual agar kode lebih terstruktur[cite: 1].

### 3. Daftar Karakter (Termasuk Karakter Baru & Alasan Pemilihan)
Berikut adalah daftar 5 karakter yang dimuat di dalam aplikasi:
* **Arjuna (WARRIOR, Level 5)**: Dipilih sebagai tipe pejuang garis depan dengan keseimbangan HP dan attack power yang solid[cite: 2].
* **Merlin (MAGE, Level 3)**: Dipilih sebagai karakter penyihir dengan kemampuan sihir khusus[cite: 2].
* **Athena (ARCHER, Level 4)**: Dipilih sebagai pemanah tangkas dengan fleksibilitas serangan jarak jauh[cite: 2].
* **Valeera (ASSASSIN, Level 5)**: Karakter baru yang dipilih karena memiliki tipe kelincahan tinggi dan serangan mematikan.
* **Malganis (TANK, Level 7)**: Karakter baru yang dipilih untuk melengkapi komposisi tim dengan ketahanan HP maksimal di lini depan.

### Laporan Analisis Lengkap
Link Google Docs Analisis GUI & MVC : https://docs.google.com/document/d/1ggPZxv__ukDL2dmZWv-7JK11ZK05elbqGsXBY1PNacE/edit?usp=sharing
