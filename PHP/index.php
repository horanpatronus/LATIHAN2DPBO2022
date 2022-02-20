<?php

/* import file class */
include "Product.php";
include "Hardware.php";
include "Memory.php";

/* deklarasi variabel lokal */
$n = 2;
$x = 0;

/* deklarasi array berisikan data */
$arrProduct = array (
	array("Rp1.750.000", "VAMD01", "AMD", "Radeon R9 370", 975, 2, "Tidak"),
	array("Rp5.000.000", "VMSI01", "MSI Gaming (NVIDIA)", "GeForce GTX 1050 Ti", 1392, 4, "Ya")
);

/* proses perulangan untuk memasukkan data dari array ke object menggunakan setter */
for($x = 0; $x < $n; $x++){
	$product[$x] = new Memory();
	$product[$x]->setPrice($arrProduct[$x][0]);
	$product[$x]->setIdProduct($arrProduct[$x][1]);
	$product[$x]->setBrand($arrProduct[$x][2]);
	$product[$x]->setModel($arrProduct[$x][3]);
	$product[$x]->setFrequency($arrProduct[$x][4]);
	$product[$x]->setMemorySize($arrProduct[$x][5]);
	$product[$x]->setSupportsCuda($arrProduct[$x][6]);
}

/* proses perulangan untuk menampilkan isi data */
for($x = 0; $x < $n; $x++){
	echo "<b><h3>" . "Produk VGA ke-" . $x+1 . "</b></h3>";
	$product[$x]->printProduct();
	$product[$x]->printHardware();
	$product[$x]->printMemory();
}

?>