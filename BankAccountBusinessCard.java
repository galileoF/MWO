import java.util.ArrayList;
class BankAccountBusinessCard extends BusinessCard{
	private String bankAccount;
	
	
	public BankAccountBusinessCard(String name, String surname, int phone, String city, String bankAccount){
		super(name, surname, phone, city);
		this.bankAccount = bankAccount;
	}
	
	public BankAccountBusinessCard(String name, String surname){
		super(name, surname, 123456789, "Krakow");
		bankAccount = "67 1234 5678 0000 0000 1234 5678";
	}
	
	public void setBankAccount(String bankAccount){
		this.bankAccount = bankAccount;
	}
	public String getBankAccount(){
		return bankAccount;
	}
	
	protected ArrayList<String> getLines() {
      ArrayList<String> lines = super.getLines();

      lines.add(bankAccount);
      

      return lines;
  }
}