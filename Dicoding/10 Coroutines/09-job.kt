package belajarkotlin.dicoding.coroutines

/*

    Fungsi async terbagi menjadi 2:
        1. mengembalikan hasil
                - digunakan ketika kita menginginkan sebuah data setelah fungsi selesai dijalankan
                - contoh: mengambil informasi dari web service
        2. tidak mengembalikan hasil
                - digunakan untuk mengirim analitik, menulis log, dll

    Job
        - adalah hasil perintah async.
        - tiga properti job:
            1. isActive: menunjukkan job sedang aktif
            2. isCompleted: menunjukkan job telah selesai
            3. isCancelled: menunjukkan job telah dibatalkan
        - job dijalankan setelah dibuat, namun, ia juga bisa dibuat tanpa dijalankan


*/