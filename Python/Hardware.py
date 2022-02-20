# import class
from Product import Product

class Hardware(Product):
	
	# atribut private
	__brand = ""
	__model = ""

	# konstruktor
	def __init__(self):
		self.__brand = ""
		self.__model = ""

	# setter dan getter untuk atribut brand
	def setBrand(self, brand):
		self.__brand = brand

	def getBrand(self):
		return self.__brand

	# setter dan getter untuk atribut model
	def setModel(self, model):
		self.__model = model
	
	def getModel(self):
		return self.__model;

	# method untuk mencetak output atribut dari class Hardware
	def printHardware(self):
		print("Merk           : " + self.getBrand())
		print("Model          : " + self.getModel())