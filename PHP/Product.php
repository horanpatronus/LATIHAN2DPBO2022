<?php

class Product{
	private $price = "";
	private $idProduct = "";

	/* konstruktor */
	public function __construct($price = "", $idProduct = ""){
		$this->price = $price;
		$this->idProduct = $idProduct;
	}

	/* setter dan getter untuk atribut price */
	public function setPrice($price){
		$this->price = $price;
	}

	public function getPrice(){
		return $this->price;
	}

	/* setter dan getter untuk atribut idProduct */
	public function setIdProduct($idProduct){
		$this->idProduct = $idProduct;
	}

	public function getIdProduct(){
		return $this->idProduct;
	}

	/* method untuk mencetak output atribut dari class Product */
	public function printProduct(){
		echo "Harga          : ".$this->getPrice()."<br>";
		echo "ID Produk      : ".$this->getIdProduct()."<br>";
	}
}

?>