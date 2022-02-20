#include <iostream>
#include <string>

using namespace std;

/* import class */
#include "Memory.cpp"

int main(){

	/* deklarasi variabel lokal */
	int n = 0, i = 0;

	/* proses memasukkan jumlah data */
	cout << "Masukkan jumlah produk yang akan diinput : ";
	cin >> n;
	cin.ignore();

	/* membuat array object */
	Memory arrProduct[n];

	/* proses perulangan untuk memasukkan isi data (input) */
	for(i=0; i<n; i++){

		/* deklarasi variabel lokal penampung input */
		string price = "";
		string idProduct = "";
		string brand = "";
		string model = "";
		int frequency = 0;
		int memorySize = 0;
		string supportsCuda = "";

		/* tampilan awal program */
		cout << endl << "=== Input ===" << endl;
		cout << endl << "VGA ke-" << i+1 << endl;
		
		/* memasukkan data satu persatu */
		cout << "Harga : ";
		getline (cin, price);
		cout << "ID Produk : "; 
		getline (cin, idProduct);
		cout << "Merk : ";
		getline (cin, brand);
		cout << "Model : ";
		getline (cin, model);
		cout << "Frekuensi (dalam MHz) : ";
		cin >> frequency;
		cin.ignore();
		cout << "Memori (dalam GB) : ";
		cin >> memorySize;
		cin.ignore();
		cout << "Apakah mendukung Cuda? :";
		getline (cin, supportsCuda);

		/* menyimpan data input ke dalam array menggunakan setter*/
		arrProduct[i].setPrice(price);
		arrProduct[i].setIdProduct(idProduct);
		arrProduct[i].setBrand(brand);
		arrProduct[i].setModel(model);
		arrProduct[i].setFrequency(frequency);
		arrProduct[i].setMemorySize(memorySize);
		arrProduct[i].setSupportsCuda(supportsCuda);
	}

	/* proses perulangan menampilkan data (output) */ 
	for(i=0; i<n; i++){
		cout << endl << "=== Output ===" << endl;
		cout << endl << "Produk VGA ke-" << i+1 << endl;
		cout << "------------------------------" << endl;
		arrProduct[i].printProduct();
		arrProduct[i].printHardware();
		arrProduct[i].printMemory();
		fflush(stdin);
	}
	
}