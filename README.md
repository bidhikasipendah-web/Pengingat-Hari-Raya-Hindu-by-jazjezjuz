# Pengingat Hari Raya Hindu Bali — Android Native

Project Android Studio siap dikembangkan/build menjadi APK.

## Build
1. Buka folder project ini di Android Studio.
2. Tunggu Gradle sync.
3. Pilih **Build > Generate App Bundles or APKs > Generate APKs**.
4. APK debug biasanya berada di `app/build/outputs/apk/debug/`.

## Fitur dasar
- Permintaan izin notifikasi Android 13+
- Channel notifikasi prioritas tinggi
- Tombol tes notifikasi
- Daftar kategori hari suci Hindu Bali
- Struktur receiver untuk dikembangkan menjadi alarm terjadwal.

Catatan: jadwal kalender Bali lengkap belum ditanamkan sebagai database final. Sebelum dipakai sebagai kalender resmi, data tanggal perlu dimasukkan/diverifikasi dari sumber kalender Bali yang dipilih.
