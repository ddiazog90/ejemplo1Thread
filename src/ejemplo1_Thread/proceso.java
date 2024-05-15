package ejemplo1_Thread;

public class proceso extends Thread{
//	String nameProcess;

	public proceso(String nameProcess) {
		super(nameProcess);
//		this.nameProcess = nameProcess;
	}

	public void listValues() {
		for(int i=0;i<5;i++) {
			System.out.println(getName()+":"+i);
		}
	}
	
	public void run() {
		listValues();
	}

}
