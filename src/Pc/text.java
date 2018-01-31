package Pc;

public class text {
	public static void main(String[] args){
		Mainbox mainbox=new Mainbox();
		Cpu i3=new I3();
		Cpu i5=new I5();
		Cpu i7=new I7();
		mainbox.setCpu(i3);
		mainbox.getCpu();
	}
}
