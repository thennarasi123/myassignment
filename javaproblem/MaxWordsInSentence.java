package javaproblem;

public class MaxWordsInSentence {
	public int maxwords(String[] sentences) {
		int maxwords=0;
		for(String sentence:sentences) {
			String[] words=sentence.split(" ");
			maxwords=Math.max(maxwords, words.length);
		}
		return maxwords;
		
	}
	public static void main(String[] args) {
		MaxWordsInSentence solution=new MaxWordsInSentence();
		String[] sentences1={"alice and bob love leetcode","i think so too","this is great thanks very much"};
		System.out.println(solution.maxwords(sentences1));
		String[] sentences2= {"please wait","continue to fight","continue to win"};
		System.out.println(solution.maxwords(sentences2));
		
	}

}
