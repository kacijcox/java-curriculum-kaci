//package testing;
//import org.junit.Test;
//import org.junit.Assert;
//
//public class TestingExerciseTest {
//
//	public static void main(String[] args) {
//
//	}
//
//	//sleeptests
//	@Test
//	public void TestingExercise_sleepIn_notWeekdayAndNotVacation() {
//		//arrange
//		boolean weekday = false;
//		boolean vacation = false;
//
//		// act
//		boolean result = TestingExercise.sleepIn(weekday, vacation);
//
//		//assert
//		Assert.assertEquals(true, result);
//		System.out.println(result);
//	}
//
//	@Test
//	public void TestingExercise_sleepIn_isAWeekDayAndNotVacation() {
//		//arrange
//		boolean weekday = true;
//		boolean vacation = false;
//
//		//act
//		boolean result = TestingExercise.sleepIn(weekday, vacation);
//
//		//assert
//		Assert.assertEquals(false, result);
//		System.out.println(result);
//	}
//
//	@Test
//	public void TestingExercise_sleepIn_isNotAWeekdayAndIsVacation() {
//		//arrange
//		boolean weekday = false;
//		boolean vacation = true;
//		//act
//		boolean result = TestingExercise.sleepIn(weekday, vacation);
//
//		//assert
//		Assert.assertEquals(true, result);
//		System.out.println(result);
//	}
//
//	@Test
//	public void TestingExercise_sleepIn_IsAWeekDayAndIsVacation() {
//		//arrange
//		boolean weekday = true;
//		boolean vacation = true;
//
//		//act
//		boolean result = TestingExercise.sleepIn(weekday, vacation);
//
//		//assert
//		Assert.assertEquals(true, result);
//		System.out.println(result);
//	}
//
//	//counteven tests
//	@Test
//	public void TestingExercise_countEvens_countEvenOne() {
//		//arrange
//		int countNumbers[] = {2, 1, 2, 3, 4};
//
//		//act
//		int result = TestingExercise.countEvens(countNumbers);
//
//		//assert
//		Assert.assertEquals(3, result);
//		System.out.println(result);
//	}
//
//	@Test
//	public void TestingExercise_countEvens_countEvenTwo() {
//		//arrange
//		int countNumbers[] = {2, 2, 0};
//
//		//act
//		int result = TestingExercise.countEvens(countNumbers);
//
//		//assert
//		Assert.assertEquals(3, result);
//		System.out.println(result);
//	}
//
//	@Test
//	public void TestingExercise_countEvens_countEvenThree() {
//		//arrange
//		int countNumbers[] = {1, 3, 5};
//
//		//act
//		int result = TestingExercise.countEvens(countNumbers);
//
//		//assert
//		Assert.assertEquals(0, result);
//		System.out.println(result);
//	}
//
//	@Test
//	public void TestingExercise_countEvens_countEvenFour() {
//		//arrange
//		int countNumbers[] = {};
//
//		//act
//		int result = TestingExercise.countEvens(countNumbers);
//
//		//assert
//		Assert.assertEquals(0, result);
//		System.out.println(result);
//	}
//
//	@Test
//	public void TestingExercise_countEvens_countEvenFive() {
//		//arrange
//		int countNumbers[] = {11, 9, 0, 1};
//
//		//act
//		int result = TestingExercise.countEvens(countNumbers);
//
//		//assert
//		Assert.assertEquals(1, result);
//		System.out.println(result);
//	}
//
//	@Test
//	public void TestingExercise_countEvens_countEvenSix() {
//		//arrange
//		int countNumbers[] = {2, 11, 9, 0};
//
//		//act
//		int result = TestingExercise.countEvens(countNumbers);
//
//		//assert
//		Assert.assertEquals(2, result);
//		System.out.println(result);
//	}
//
//	@Test
//	public void TestingExercise_countEvens_countEvenSeven() {
//		//arrange
//		int countNumbers[] = {2};
//
//		//act
//		int result = TestingExercise.countEvens(countNumbers);
//
//		//assert
//		Assert.assertEquals(1, result);
//		System.out.println(result);
//	}
//
//	@Test
//	public void TestingExercise_countEvens_countEvenEight() {
//		//arrange
//		int countNumbers[] = {2, 5, 12};
//
//		//act
//		int result = TestingExercise.countEvens(countNumbers);
//
//		//assert
//		Assert.assertEquals(2, result);
//		System.out.println(result);
//	}
//
//	//cigar party test
//	@Test
//	public void TestingExercise_cigarParty_caseOne() {
//		//arrange
//		int cigarCount = 30;
//		boolean isWeekend = false;
//
//		//act
//		boolean result = TestingExercise.cigarParty(cigarCount, isWeekend);
//
//		//assert
//		Assert.assertEquals(false, result);
//		System.out.println(result);
//
//	}
//
//	@Test
//	public void TestingExercise_cigarParty_caseTwo() {
//		//arrange
//		int cigarCount = 50;
//		boolean isWeekend = false;
//
//		//act
//		boolean result = TestingExercise.cigarParty(cigarCount, isWeekend);
//
//		//assert
//		Assert.assertEquals(true, result);
//		System.out.println(result);
//
//	}
//
//	@Test
//	public void TestingExercise_cigarParty_caseThree() {
//		//arrange
//		int cigarCount = 70;
//		boolean isWeekend = true;
//
//		//act
//		boolean result = TestingExercise.cigarParty(cigarCount, isWeekend);
//
//		//assert
//		Assert.assertEquals(true, result);
//		System.out.println(result);
//	}
//
//	@Test
//	public void TestingExercise_cigarParty_caseFour() {
//		//arrange
//		int cigarCount = 30;
//		boolean isWeekend = true;
//
//		//act
//		boolean result = TestingExercise.cigarParty(cigarCount, isWeekend);
//
//		//assert
//		Assert.assertEquals(false, result);
//		System.out.println(result);
//	}
//
//	@Test
//	public void TestingExercise_cigarParty_caseFive() {
//		//arrange
//		int cigarCount = 50;
//		boolean isWeekend = true;
//
//		//act
//		boolean result = TestingExercise.cigarParty(cigarCount, isWeekend);
//
//		//assert
//		Assert.assertEquals(true, result);
//		System.out.println(result);
//	}
//
//	@Test
//	public void TestingExercise_cigarParty_caseSix() {
//		//arrange
//		int cigarCount = 60;
//		boolean isWeekend = false;
//
//		//act
//		boolean result = TestingExercise.cigarParty(cigarCount, isWeekend);
//
//		//assert
//		Assert.assertEquals(true, result);
//		System.out.println(result);
//	}
//
//	@Test
//	public void TestingExercise_cigarParty_caseSeven() {
//		//arrange
//		int cigarCount = 40;
//		boolean isWeekend = false;
//
//		//act
//		boolean result = TestingExercise.cigarParty(cigarCount, isWeekend);
//
//		//assert
//		Assert.assertEquals(true, result);
//		System.out.println(result);
//	}
//
//	@Test
//	public void TestingExercise_cigarParty_caseEight() {
//		//arrange
//		int cigarCount = 39;
//		boolean isWeekend = false;
//
//		//act
//		boolean result = TestingExercise.cigarParty(cigarCount, isWeekend);
//
//		//assert
//		Assert.assertEquals(false, result);
//		System.out.println(result);
//	}
//
//	@Test
//	public void TestingExercise_cigarParty_caseNine() {
//		//arrange
//		int cigarCount = 40;
//		boolean isWeekend = true;
//
//		//act
//		boolean result = TestingExercise.cigarParty(cigarCount, isWeekend);
//
//		//assert
//		Assert.assertEquals(true, result);
//		System.out.println(result);
//	}
//
//	@Test
//	public void TestingExercise_cigarParty_caseTen() {
//		//arrange
//		int cigarCount = 39;
//		boolean isWeekend = true;
//
//		//act
//		boolean result = TestingExercise.cigarParty(cigarCount, isWeekend);
//
//		//assert
//		Assert.assertEquals(false, result);
//		System.out.println(result);
//	}
//
//	//repeat seperator test
//	@Test
//	public void TestingExercise_repeatSeparator_caseOne() {
//		//arrange
//		String theWord = "Word";
//		String theSeparator = "X";
//		int countWord = 3;
//
//		//act
//		String result = TestingExercise.repeatSeparator(theWord, theSeparator, countWord);
//		System.out.println(result);
//
//		//
//		Assert.assertEquals("WordXWordXWord", result);
//	}
//
//	@Test
//	public void TestingExercise_repeatSeparator_caseTwo() {
//		//arrange
//		String theWord = "This";
//		String theSeparator = "And";
//		int countWord = 2;
//
//		//act
//		String result = TestingExercise.repeatSeparator(theWord, theSeparator, countWord);
//		System.out.println(result);
//
//		//
//		Assert.assertEquals("ThisAndThis", result);
//	}
//
//	@Test
//	public void TestingExercise_repeatSeparator_caseThree() {
//		//arrange
//		String theWord = "This";
//		String theSeparator = "And";
//		int countWord = 1;
//
//		//act
//		String result = TestingExercise.repeatSeparator(theWord, theSeparator, countWord);
//		System.out.println(result);
//
//		//assert
//		Assert.assertEquals("This", result);
//	}
//	@Test
//	public void TestingExercise_repeatSeparator_caseFour() {
//		//arrange
//		String theWord = "Hi";
//		String theSeparator = "-n-";
//		int countWord = 2;
//
//		//act
//		String result = TestingExercise.repeatSeparator(theWord, theSeparator, countWord);
//		System.out.println(result);
//
//		//assert
//		Assert.assertEquals("Hi-n-Hi", result);
//	}
//	@Test
//	public void TestingExercise_repeatSeparator_caseFive() {
//		//arrange
//		String theWord = "AAA";
//		String theSeparator = "";
//		int countWord = 1;
//
//		//act
//		String result = TestingExercise.repeatSeparator(theWord, theSeparator, countWord);
//		System.out.println(result);
//
//		//assert
//		Assert.assertEquals("AAA", result);
//	}
//	@Test
//	public void TestingExercise_repeatSeparator_caseSix() {
//		//arrange
//		String theWord = "AAA";
//		String theSeparator = "";
//		int countWord = 0;
//
//		//act
//		String result = TestingExercise.repeatSeparator(theWord, theSeparator, countWord);
//		System.out.println(result);
//
//		//assert
//		Assert.assertEquals("", result);
//	}
//	@Test
//	public void TestingExercise_repeatSeparator_caseSeven() {
//		//arrange
//		String theWord = "XYZ";
//		String theSeparator = "a";
//		int countWord = 2;
//
//		//act
//		String result = TestingExercise.repeatSeparator(theWord, theSeparator, countWord);
//		System.out.println(result);
//
//		//assert
//		Assert.assertEquals("XYZaXYZ", result);
//	}
//	@Test
//	public void TestingExercise_repeatSeparator_caseEight() {
//		//arrange
//		String theWord = "abc";
//		String theSeparator = "XX";
//		int countWord = 3;
//
//		//act
//		String result = TestingExercise.repeatSeparator(theWord, theSeparator, countWord);
//		System.out.println(result);
//
//		//assert
//		Assert.assertEquals("abcXXabcXXabc", result);
//	}
//	@Test
//	public void TestingExercise_repeatSeparator_caseNine() {
//		//arrange
//		String theWord = "A";
//		String theSeparator = "B";
//		int countWord = 5;
//
//		//act
//		String result = TestingExercise.repeatSeparator(theWord, theSeparator, countWord);
//		System.out.println(result);
//
//		//assert
//		Assert.assertEquals("ABABABABA", result);
//	}
//	@Test
//	public void TestingExercise_repeatSeparator_caseTen() {
//		//arrange
//		String theWord = "abc";
//		String theSeparator = "XX";
//		int countWord = 2;
//
//		//act
//		String result = TestingExercise.repeatSeparator(theWord, theSeparator, countWord);
//		System.out.println(result);
//
//		//assert
//		Assert.assertEquals("abcXXabc", result);
//	}
//	@Test
//	public void TestingExercise_repeatSeparator_caseEleven() {
//		//arrange
//		String theWord = "abc";
//		String theSeparator = "XX";
//		int countWord = 1;
//
//		//act
//		String result = TestingExercise.repeatSeparator(theWord, theSeparator, countWord);
//		System.out.println(result);
//
//		//assert
//		Assert.assertEquals("abc", result);
//	}
//}
