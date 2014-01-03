package tx;

public class Transactions {
	public void logger() {
		System.out.println("启动事务...");
	}
	
	public void afterThrow(Exception ex) {
		ex.printStackTrace();
	}
}
