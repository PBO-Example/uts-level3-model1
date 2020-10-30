# Selamat!! Anda sekarang sudah di UTS Praktikum Level 3 dari 4 Level
Baca instruksi yang diberikan dengan baik.


## Kelas Diagram
![Image of UTS Level 3](http://api.puro.del.ac.id/v1/file/7e4ec673247e1cdf9090657c10b80aef)
>Update program anda pada level 2 sehingga sesuai dengan  kelas diagram di atas. 

>**Perhatikan bahwa, pada level 3 ini, sejumlah atribut diangkat ke kelas Parent.**

>**Untuk mendapatkan nilai sempurna pada level ini, konsentrasi menyesuaikan kode program kelas Rumah.java dan kelas Alamat.java yang anda kerjakan pada level 2 sehingga mempunyai relasi dengan kelas Bangunan seperti yang ditunjukkan pada kelas diagram di atas.**

## Rubrik Penilaian 
1. **[Poin 30]** test realisasi relasi antara kelas Rumah, Bangunan dan Alamat.
	
	
	> Perintah test: 
	
	
		>gradle test --tests TestRumah.testInheritance

2. **[Poin 35]** test realisasi method setAlamat() dan getAlamat() dari kelas Bangunan

	
	> Perintah test: 
	
	
		>gradle test --tests TestRumah.testGetSetAlamat

3. **[Poin 35]** test realisasi method setTingkat() dan getTingkat() dari kelas Bangunan

	
	> Perintah test: 
	
	
		>gradle test --tests TestRumah.testGetSetTingkat


**Catatan Penting:**
1. Anda hanya boleh mengubah kode program yang ada di src\main\java
1. **Semua kode program yang ada di src\test\java  tidak boleh diubah sama sekali!!** Jika anda ubah (akan terlihat pada history), maka nilai anda langsung 0.
1. Jangan memindah-mindahkan file, biarkan setiap file di folder di mana file tersebut berada sebelumnya.
1. Pada beberapa template program sudah disediakan method yang tidak boleh diubah. Maka jangan anda ubah!
