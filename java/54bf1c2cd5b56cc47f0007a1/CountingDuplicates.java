/*
status: done

Write a function that will return the count of distinct case-insensitive
alphabetic characters and numeric digits that occur more than once in the input
string. The input string can be assumed to contain only alphabets (both
uppercase and lowercase) and numeric digits.
*/

public class CountingDuplicates {
    public static int duplicateCount(String text) {
		int result = 0, strLen = text.length();
		char[] used_letters = new char[strLen];
		char total_letters = 0;

		for (int m = 0; m < strLen; m++) {
			char currentLetter = Character.toLowerCase(text.charAt(m));
			boolean letterDone = false;

			for (int i = 0; i < total_letters; i++) if (currentLetter == used_letters[i]) letterDone = true;

			if (letterDone) continue;

			for (int l = 0; l < strLen; l++) {
				char letter = Character.toLowerCase(text.charAt(l));

				if (l == m) continue;

				if (letter == currentLetter) {
					used_letters[total_letters] = currentLetter;
					result++; total_letters++;
					break;
				}
			}
		}

        return result;
    }

	public static void main (String[] args) {
		int testFunc = duplicateCount("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");
		System.out.println(testFunc);
	}
}

/*
					System.out.printf("'%c' is done.\n", currentLetter);
					System.out.printf("'%c' is counted.\n", currentLetter);
					System.out.printf("'%c' is counted.\n", currentLetter);
*/
