package searching;

public class SmallestLetter {

//Find Smallest Letter Greater Than Target	
	public static void main(String[] args) {
		char[] letters = { 'c', 'f', 'j' };
		char target = 'j';
		char out = smallest(letters, target);
		System.out.println("Smallest letter in the array which greater than target  " + out);

	}

	static char smallest(char[] letters, char target) {
		int start = 0;
		int end = letters.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (letters[mid] > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}

		return letters[start % letters.length];

	}
}
