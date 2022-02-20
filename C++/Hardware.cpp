#include <iostream>
#include <string>

/* import file */
#include "Product.cpp"

using namespace std;

/* inherit class */
class Hardware : public Product{

	/* atribut private */
	private:
			string brand;
			string model;

	/* atribut public */
	public:

		/* konstruktor */
		Hardware(){}

		/* setter dan getter untuk atribut brand */
		void setBrand(string brand){
			this->brand = brand;
		}

		string getBrand(){
			return this->brand;
		}

		/* setter dan getter untuk atribut model */
		void setModel(string model){
			this->model = model;
		}

		string getModel(){
			return this->model;
		}

		/* method untuk mencetak output atribut dari class Hardware */
		void printHardware(){
			cout << "Merk           : " << this->brand << endl;
			cout << "Model          : " << this->model << endl;;
		}

		/* destruktor */
		~Hardware(){}
};