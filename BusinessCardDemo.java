class BusinessCardDemo{
	public static void main(String args[]){
		BusinessCard w1 = new BusinessCard("Piotr", "Budynek", 456123000, "Katowice");
		BusinessCard w2 = new BusinessCard("Jan", "Kowalski");
		w1.print();
		w2.print();
		BankAccountBusinessCard bc1 = new BankAccountBusinessCard("Piotr", "Budynek", 456123000, "Katowice", "64 5214 1452 8547 1452 23");
		BusinessCard bc2 = new BankAccountBusinessCard("Piotr", "Budynek");
		bc1.print();
		bc2.print();
	}
}