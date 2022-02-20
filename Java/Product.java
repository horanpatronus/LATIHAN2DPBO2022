class Product{

	/* atribut private */
	private String price;
	private String idProduct;

	/* konstruktor */
	public Product(){}

	public Product(String price, String idProduct){
		this.price = price;
		this.idProduct = idProduct;
	}

	/* setter dan getter untuk atribut price */
	public String getPrice(){
		return price;
	}

	public void setPrice(String price){
		this.price = price;
	}

	/* setter dan getter untuk atribut price */
	public String getIdProduct(){
		return idProduct;
	}

	public void setIdProduct(String idProduct){
		this.idProduct = idProduct;
	}

	/* method untuk mencetak output atribut dari class Product */ 
	public void printProduct(){
		System.out.println("Harga          : " + this.getPrice());
		System.out.println("ID Produk      : " + this.getIdProduct());
	}
}
