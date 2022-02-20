class Product():
	
	# atribut private	
	__price = ""
	__idProduct = ""

	# konstruktor
	def __init__(self):
		self.__price = ""
		self.__idProduct = ""

	# setter dan getter untuk atribut price
	def setPrice(self, price):
		self.__price = price

	def getPrice(self):
		return self.__price

	# setter dan getter untuk atribut idProduct
	def setIdProduct(self, idProduct):
		self.__idProduct = idProduct

	def getIdProduct(self):
		return self.__idProduct;

	# method untuk mencetak output atribut dari class Product
	def printProduct(self):
		print("Harga          : " + self.getPrice())
		print("ID Produk      : " + self.getIdProduct())