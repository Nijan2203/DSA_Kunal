package arrays;

public class AssE12MaxAltitude {
// Find the Highest Altitude

	public static void main(String[] args) {
int[] gain = {-5,1,5,0,-7};
	int maxaltitude = 	FindAltitude(gain);
System.out.println("Highest Altitude is "+ maxaltitude);
	}

	static int FindAltitude(int[] gain) {
		int[] outputArr = new int[gain.length+1];
	outputArr[0] = 0;
	outputArr[1] = gain[0];
		for(int i=2; i<outputArr.length; i++) {
		outputArr[i] = gain[i-1]-gain[i-2];
	}
int max = outputArr[0];
		for(int i=0; i<outputArr.length; i++) {
			if(max<outputArr[i]) {
				max = outputArr[i];
			}
		}
		
		return max;
}
}