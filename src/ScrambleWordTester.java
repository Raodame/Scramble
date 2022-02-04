import java.util.ArrayList;


public class ScrambleWordTester {
	public static void main(String args[]){
		ArrayList<String> words = new ArrayList<String>();
		words.add("TAN");
		words.add("ABRACADABRA");
		words.add("WHOA");
		words.add("AARDVARK");
		words.add("EGGS");
		words.add("A");
		words.add("");
			
		for(String w: words){									//TNA
			System.out.println(ScrambleWord.scrambleWord(w));	//BARCADABARA
		}														//WHOA
																//ARADVRAK
																//EGGS
																//A
																//
		words = new ArrayList<String>();
		words.add("TAN");
		words.add("ABRACADABRA");
		words.add("WHOA");
		words.add("APPLE");
		words.add("EGGS");
		
		System.out.println(words);	//[TAN, ABRACADABRA, WHOA, APPLE, EGGS]
		ScrambleWord.scrambleOrRemove(words);
		System.out.println(words);	//[TNA, BARCADABARA, PAPLE]

	}
}
