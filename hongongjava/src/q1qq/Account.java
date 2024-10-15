package q1qq;

public class Account {
	//필드
	private String ano;
	private String owner;
	private int balance;
	private static final int MAX_BALANCE = 1000000;
	private static final int MIN_BALANCE = 0;
	//생성자
	Account(String ano,String owner,int balance){
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	//메소드
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public static int getMaxBalance() {
		return MAX_BALANCE;
	}
	public static int getMinBalance() {
		return MIN_BALANCE;
	};
	
}//end class