package dicoding.coroutines

/*

Process:
    - Bagian dari aplikasi yang sedang dijalankan
    - Serangkaian proses yang saling bekerja sama
    - Menggunakan IPC(Inter Process Communication) untuk berkomunikasi antar proses
    - Terdiri dari beberapa thread
    - Multitasking: Bekerja dengan sangat cepat dan bergantian
    - Multiprocessing: Menggunakan lebih dari 1 CPU untuk menjalankan tugas

Thread:
    - Serangkaian instruksi untuk dijalankan oleh prosesor
    - Merupakan komponen dari proses
    - Setiap thread mengakses dan memodifikasi sumber daya (memori dan data)
    - Memiliki penyimpanan tersendiri juga (thread local storage)
    - Main thread: mengeksekusi fungsi utama aplikasi
    - UI thread: memperbarui user interface (antarmuka)

I/O-Bound:
    - Perangkat I/O mempengaruhi kemacetan suatu aplikasi
    - Dipengaruhi oleh memori yang terbatas, kecepatan prosesor, dll
    - I/O-Bound: algoritma yang bergantung pada perangkat I/O

*/