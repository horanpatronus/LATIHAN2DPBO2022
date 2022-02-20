# import class
from Product import Product
from Hardware import Hardware

class Memory(Hardware):
	
	# atribut private
	__frequency = 0
	__memorySize = 0
	__supportsCuda = ""

	# konstruktor
	def __init__(self):
		self.__frequency = 0
		self.__memorySize = 0
		self.__supportsCuda = ""
	
	# setter dan getter untuk atribut frequency
	def setFrequency(self, frequency):
		self.__frequency = frequency

	def getFrequency(self):
		return self.__frequency

	# setter dan getter untuk atribut memorySize
	def setMemorySize(self, memorySize):
		self.__memorySize = memorySize
		
	def getMemorySize(self):
		return self.__memorySize

	# setter dan getter untuk atribut supportsCuda
	def setSupportsCuda(self, supportsCuda):
		self.__supportsCuda = supportsCuda

	def getSupportsCuda(self):
		return self.__supportsCuda

	# method untuk mencetak output atribut dari class Memory
	def printMemory(self):
		print("Frekuensi      : {} MHz".format(self.getFrequency()))
		print("Memori         : {} GB".format(self.getMemorySize()))
		print("Mendukung Cuda : " + self.getSupportsCuda())