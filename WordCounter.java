import java.util.Scanner;

public class WordCounter {
	
	public int maxWordsInSentence (String text) {
		String result = text.replaceAll("[\\?\\.\\!]", "-");
		
		String[] items = result.split("-");
		int maxWordsCount = 0;
		for (int i = 0; i < items.length; i++) {
			int numberOfWords = getNumberOfWords(items[i]);
			if (numberOfWords > maxWordsCount) {
				maxWordsCount = numberOfWords;
			}
		}
		return maxWordsCount;
	}
	
	private int getNumberOfWords(String input) {
		return input.trim().split(" ").length;
	}

	public static void main(String[] args) {
		WordCounter wc = new WordCounter();
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		sc.close();
		System.out.println(wc.maxWordsInSentence(text));
	}

}
