package javaPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class CountNumberofDuplicateWordsinaString {
@Test
public void duplicateCount() {
	String given ="Java and Selenium are interesting and Java is easy to learn";
	String words[]= given.split(" ");
	Map<String, Integer> wordCount = new HashMap<String, Integer>();
	for(String word: words) {
		if(wordCount.containsKey(word)) {
			wordCount.put(word.toLowerCase(), wordCount.get(word)+1);
		}
		else {
			wordCount.put(word, 1);
		}
	}
	Set<String> wordsInString =wordCount.keySet();
	for(String word: wordsInString) {
		if(wordCount.get(word)>1) {
			System.out.println(word + ":"+ wordCount.get(word));
		}
			
	}
}
}
