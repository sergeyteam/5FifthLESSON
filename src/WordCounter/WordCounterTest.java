package WordCounter;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WordCounterTest {

	private static final String DOG = "dog";
	private static final String CAT = "cat";

	private WordCounter wordCounter;
	
	@Before
	public void setup(){
		wordCounter = new WordCounter();
	}
	
	@After
	public void terdawn(){
		wordCounter = null;
	}
	
	@Test 
	public void testZeroCount(){
		Assert.assertEquals(0, wordCounter.count(CAT));
	}
	
	@Test
	public void testAddOneWord(){
		assertWordsInCounter(3, CAT);
	}
	
	@Test
	public void testAddTwoWord(){
		assertWordsInCounter(5, CAT);
		assertWordsInCounter(8, DOG);
	}
	
	private void assertWordsInCounter(int expected, String word){
		for (int i = 0; i <expected ; i++) {
			wordCounter.add(word);	
		}
		Assert.assertEquals(expected, wordCounter.count(word));
	}
	
}
