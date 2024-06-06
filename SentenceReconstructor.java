package javaproblem;

public class SentenceReconstructor {
	public static String reconstructor(String s) {
		String[] words=s.split(" ");
		String[] result=new String[words.length];
		for(String word:words) {
			int index=Integer.parseInt(word.replaceAll("[^0-9]", ""));
			result[index-1]=word.replaceAll("[0-9]", "");
			
		}
		
		return String.join(" ", result);
		
	}
	public static void main(String[] args) {
		String shuffledSentence="sentence4 a3 is2 This1";
		String orginalsentence=reconstructor(shuffledSentence);
		System.out.println("orginal sentence: "+orginalsentence);
		String shuffledSentence1="Myself2 Me1";
		String orginalsentence1=reconstructor(shuffledSentence1);
		System.out.println("orginal sentence: " +orginalsentence1);
	}

}
