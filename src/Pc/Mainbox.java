package Pc;

public class Mainbox {
	private Cpu cpu;

	public Cpu getCpu() {
		return cpu;
	}

	public void setCpu(Cpu cpu) {
		this.cpu = cpu;
	}
	public void methods(){
		cpu.methods();
	}
}
