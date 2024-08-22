package arrays;

public class AssE12MaxAltitude {
// Find the Highest Altitude

	public static void main(String[] args) {
		int[] gain = { -5, 1, 5, 0, -7 };
		int maxaltitude = FindAltitude(gain);
		System.out.println("Highest Altitude is " + maxaltitude);
	}

	static int FindAltitude(int[] gain) {
		int[] outputArr = new int[gain.length + 1];
		outputArr[0] = 0;
		for (int i = 1; i < outputArr.length; i++) {
			outputArr[i] = outputArr[i - 1] + gain[i - 1];
		}
		int max = outputArr[0];
		for (int i = 1; i < outputArr.length; i++) {
			if (max < outputArr[i]) {
				max = outputArr[i];
			}
		}
		return max;
	}
}