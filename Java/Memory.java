// derived class memory
class Memory extends Hardware{
	
	/* atribut private */
	private int frequency;
	private int memorySize;
	private String supportsCuda;

	/* konstruktor */
	public Memory(){}

	public Memory(int frequency, int memorySize, String supportsCuda){
		this.frequency = frequency;
		this.memorySize = memorySize;
		this.supportsCuda = supportsCuda;
	}

	/* setter dan getter untuk atribut frequency */
	public int getFrequency(){
		return frequency;
	}

	public void setFrequency(int frequency){
		this.frequency = frequency;
	}

	/* setter dan getter untuk atribut memorySize */
	public int getMemorySize(){
		return memorySize;
	}

	public void setMemorySize(int memorySize){
		this.memorySize = memorySize;
	}

	/* setter dan getter untuk atribut supportsCuda */
	public String getSupportsCuda(){
		return supportsCuda;
	}

	public void setSupportsCuda(String supportsCuda){
		this.supportsCuda = supportsCuda;
	}

	/* method untuk mencetak output atribut dari class Memory */
	public void printMemory(){
		System.out.println("Frekuensi      : " + this.getFrequency() + " MHz");
		System.out.println("Memori         : " + this.getMemorySize() + " GB");
		System.out.println("Mendukung Cuda : " + this.getSupportsCuda());
	}
}
