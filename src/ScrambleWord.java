import java.util.ArrayList;

public class ScrambleWord {

	public static String scrambleWord(String word){
		String[] wordArray = new String[word.length()];
		if (word.indexOf(word) == -1){
			return word;
		}
		for (int x = 0; x < wordArray.length; x++){
			wordArray[x] = word.substring(x, x + 1);
		}
		for (int y = 0; y < wordArray.length - 1; y++){
			if (wordArray[y].equals("A")){
				wordArray[y] = wordArray[y + 1];
				wordArray[y + 1] = "A";
				y++;
			}
		}
		String newWord = "";
		for (int z = 0; z < wordArray.length; z++){
			newWord += wordArray[z];
		}
		return newWord;
	}
	public static void scrambleOrRemove(ArrayList<String> wordList){
		ArrayList<String> wordListCopy = new ArrayList<String>();

		for (int z = 0; z < wordList.size(); z++){
			wordListCopy.add(wordList.get(z));
		}

		for (int x = 0; x < wordList.size(); x++){
			wordList.set(x, scrambleWord(wordList.get(x)));
		}

		int i = 0;
		for (int y = 0; y < wordList.size(); y++){
			if (wordListCopy.get(i).equals(wordList.get(y))){
				wordList.remove(i);
				i--;
			}
			i++;
		}
	}



}
