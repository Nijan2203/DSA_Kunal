package strings;

public class RemoveSplChar {

	public static void main(String[] args) {
		String str = "@Abxs#$";
		
		
		StringBuilder sr = new StringBuilder();
		


		for (char ch ='a'; ch <= 'z'; ch++) {

			if (str.contains(String.valueOf(ch))) {
				sr.append(ch);

			}
		}
		
		System.out.println(sr);
	

	}

}
