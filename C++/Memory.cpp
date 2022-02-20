#include <iostream>
#include <string>

/* import file */
#include "Hardware.cpp"

using namespace std;

/* inherit class */
class Memory : public Hardware{

	/* atribut private */
	private:
		int frequency;
		int memorySize;
		string supportsCuda;

	/* atribut public */
	public:

		/* konstruktor */
		Memory(){}

		/* setter dan getter untuk atribut frequency */
		void setFrequency(int frequency){
			this->frequency = frequency;
		}

		int getFrequency(){
			return this->frequency;
		}

		/* setter dan getter untuk atribut memorySize */
		void setMemorySize(int memorySize){
			this->memorySize = memorySize;
		}

		int getMemorySize(){
			return this->memorySize;
		}

		/* setter dan getter untuk atribut supportsCuda */
		void setSupportsCuda(string supportsCuda){
			this->supportsCuda = supportsCuda;
		}

		string getSupportsCuda(){
			return this->supportsCuda;
		}

		/* method untuk mencetak output atribut dari class Memory */
		void printMemory(){
			cout << "Frekuensi      : " << this->frequency << " GB" << endl;
			cout << "Memori         : " << this->memorySize << " MHz" << endl;
			cout << "Mendukung Cuda : " << this->supportsCuda << endl;
		}
		
		/* destruktor */
		~Memory(){}
	};