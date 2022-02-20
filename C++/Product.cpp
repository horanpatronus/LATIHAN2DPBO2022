#include <iostream>
#include <string>

using namespace std;

class Product{

	/* atribut private */
	private:
		string price;
		string idProduct;

	/* atribut public */
	public:

		/* konstruktor */
		Product(){}

		/* setter dan getter untuk atribut price*/
		void setPrice(string price){
			this->price = price;
		}

		string getPrice(){
			return this->price;
		}

		/* setter dan getter untuk atribut idProduct */
		void setIdProduct(string idProduct){
			this->idProduct = idProduct;
		}

		string getIdProduct(){
			return this->idProduct;
		}

		/* method untuk mencetak output atribut dari class Product */
		void printProduct(){
			cout << "Harga          : " << this->price << endl;
			cout << "ID Produk      : " << this->idProduct << endl;
		}

		/* destructor */
		~Product(){}
};