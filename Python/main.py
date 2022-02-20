# import class
from Product import Product
from Hardware import Hardware
from Memory import Memory

# menerima masukan jumlah data yang akan diinput
n = int(input("Masukkan jumlah produk yang akan diinput : "))

# membuat array object
arrProduct = [Memory() for i in range(n)]

# menerima masukan untuk produk 
i = 0
for i in range(n):
	print("\n=== Input ===")
	print("\nVGA ke-", i+1)
	price = input("Harga : ")
	idProduct = input("ID Produk : ")
	brand = input("Merk : ")
	model = input("Model : ")
	frequency = input("Frekuensi (dalam MHz) : ")
	memorySize = input("Memori (dalam GB) : ")
	supportsCuda = input("Apakah mendukung Cuda? : ")

	# proses memasukkan data input ke array menggunakan setter
	arrProduct[i].setPrice(price)
	arrProduct[i].setIdProduct(idProduct)
	arrProduct[i].setBrand(brand)
	arrProduct[i].setModel(model)
	arrProduct[i].setFrequency(frequency)
	arrProduct[i].setMemorySize(memorySize)
	arrProduct[i].setSupportsCuda(supportsCuda)

# proses perulangan untuk menampilkan keluaran (output) menggunakan getter
i = 0
for i in range(n):
	print("\n=== Output ===")
	print("\nProduk VGA ke-{}". format(i+1))
	print("------------------------------")
	arrProduct[i].printProduct()
	arrProduct[i].printHardware()
	arrProduct[i].printMemory()