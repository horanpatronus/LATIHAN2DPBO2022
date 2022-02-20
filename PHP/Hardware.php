<?php

/* inherit class */
class Hardware extends Product{

	/* atribut private */
	private $brand = "";
	private $model = "";

	/* konstruktor */
	public function __construct($brand = "", $model = ""){
		$this->brand = $brand;
		$this->model = $model;
	}

	/* setter dan getter untuk atribut brand */
	public function setBrand($brand){
		$this->brand = $brand;
	}

	public function getBrand(){
		return $this->brand;
	}

	/* setter dan getter untuk atribut model */
	public function setModel($model){
		$this->model = $model;
	}

	public function getModel(){
		return $this->model;
	}

	/* method untuk mencetak output atribut dari class Product */
	public function printHardware(){
		echo "Merk           : ".$this->getBrand()."<br>";
		echo "Model          : ".$this->getModel()."<br>";
	}
}

?>