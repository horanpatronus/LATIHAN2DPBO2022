import java.util.*;

public class Main{
	public static void main(String[] args){
		
		System.out.print("\nMasukkan jumlah produk yang akan diinput : ");
		
		int n = 0;

		/* memasukkan jumlah data produk yang akan diinput */
		Scanner sc = new Scanner(System.in);
		try{
			n = sc.nextInt();
			sc.nextLine();
		}catch(Exception e){}

		/* inisialisasi array object */
		Memory[] arrProduct = new Memory[n];

		/* deklarasi variabel lokal penampung input data */
		int i = 0;
		String price = "";
		String idProduct = "";
		String brand = "";
		String model = "";
		int frequency = 0;
		int memorySize = 0;
		String supportsCuda = "";

		/* proses perulangan untuk menerima masukan data produk VGA */
		for(i=0; i<n; i++){
			System.out.println("\n=== Input ===");
			System.out.println("\nVGA ke-" + (i+1));

			System.out.print("Harga : ");
			try{
				price = sc.nextLine();
			}catch(Exception e){}
			
			System.out.print("ID Produk : ");
			try{
				idProduct = sc.nextLine();
			}catch(Exception e){}
			
			System.out.print("Merk : ");
			try{
				brand = sc.nextLine();
			}catch(Exception e){}

			System.out.print("Model : ");
			try{
				model = sc.nextLine();
			}catch(Exception e){}

			System.out.print("Frekuensi (dalam MHz) : ");
			try{
				frequency = sc.nextInt();
			}catch(Exception e){}

			System.out.print("Memori (dalam GB) : ");
			try{
				memorySize = sc.nextInt();
				sc.nextLine();
			}catch(Exception e){}

			System.out.print("Apakah mendukung Cuda? : ");
			try{
				supportsCuda = sc.nextLine();
			}catch(Exception e){}

			/* memasukkan data dari variabel penampung ke object menggunakan setter */
			arrProduct[i] = new Memory();
			arrProduct[i].setPrice(price);
			arrProduct[i].setIdProduct(idProduct);
			arrProduct[i].setBrand(brand);
			arrProduct[i].setModel(model);
			arrProduct[i].setFrequency(frequency);
			arrProduct[i].setMemorySize(memorySize);
			arrProduct[i].setSupportsCuda(supportsCuda);
		}
		
		/* proses menampilkan keluaran data */
		for(i=0; i<n; i++){
			System.out.println("\n=== Output ===");
			System.out.println("\nProduk VGA ke-" + (i+1));
			System.out.println("------------------------------");
			arrProduct[i].printProduct();
			arrProduct[i].printHardware();
			arrProduct[i].printMemory();
		}
	}
}