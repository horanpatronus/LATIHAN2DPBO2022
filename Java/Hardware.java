// derived class Hardware - intermediary
class Hardware extends Product{

	/* atribut private */
	private String brand;
	private String model;

	/* konstruktor */
	public Hardware(){}

	public Hardware(String brand, String model){
		this.brand = brand;
		this.model = model;
	}

	/* setter dan getter untuk atribut brand */
	public String getBrand(){
		return brand;
	}

	public void setBrand(String brand){
		this.brand = brand;
	}

	/* setter dan getter untuk atribut model */
	public String getModel(){
		return model;
	}

	public void setModel(String model){
		this.model = model;
	}

	/* method untuk mencetak output atribut dari class Hardware*/
	public void printHardware(){
		System.out.println("Merk           : " + this.getBrand());
		System.out.println("Model          : " + this.getModel());
	}
}