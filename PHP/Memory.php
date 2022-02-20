<?php

class Memory extends Hardware{

	private $frequency = 0;
	private $memorySize = 0;
	private $supportsCuda = "";

	public function __construct($frequency = 0, $memorySize = 0, $supportsCuda = ""){
		$this->frequency = $frequency;
		$this->memorySize= $memorySize;
		$this->supportsCuda = $supportsCuda;
	}

	/* setter dan getter untuk atribut frequency */
	public function setFrequency($frequency){
		$this->frequency = $frequency;
	}

	public function getFrequency(){
		return $this->frequency;
	}

	/* setter dan getter untuk atribut memorySize */
	public function setMemorySize($memorySize){
		$this->memorySize = $memorySize;
	}

	public function getMemorySize(){
		return $this->memorySize;
	}

	/* setter dan getter untuk atribut supportsCuda */
	public function setSupportsCuda($supportsCuda){
		$this->supportsCuda = $supportsCuda;
	}

	public function getSupportsCuda(){
		return $this->supportsCuda;
	}

	/* method untuk mencetak output atribut dari class Product */
	public function printMemory(){
		echo "Frekuensi      : ".$this->getFrequency()."<br>";
		echo "Memori         : ".$this->getMemorySize()."<br>";
		echo "Mendukung Cuda : ".$this->getSupportsCuda()."<br>";
	}
}

?>