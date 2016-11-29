package action;

public class TransactionApsect {
	public void begin(){
		System.out.println("before.....");
	}
	public void close(){
		System.out.println("after......");
	}
}
