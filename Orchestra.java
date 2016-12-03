import java.util.ArrayList;

public class Orchestra implements Instrument{
	//private Intrument instruments;	
	ArrayList<Instrument> instruments = new ArrayList<>();

	public void addInstrument(Instrument instrument){
		instruments.add(instrument);
	}
	
	public void play(){
		for(int i=0;i<instruments.size();i++){
			instruments.get(i).play();
		}
	}
	
	public static void main(String[] args){
		Guitar gitara = new Guitar();
		Flute flet = new Flute();
		Trombone tromb = new Trombone();
		
		Orchestra orkiestra = new Orchestra();
		orkiestra.addInstrument(gitara);
		orkiestra.addInstrument(flet);
		orkiestra.addInstrument(tromb);
		
		orkiestra.play();
	}
}