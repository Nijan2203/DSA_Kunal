package strings;

public class Ass1EDefangIp {

	public static void main(String[] args) {
		String address = "1.1.1.1";
	String st = 	defangIp(address);
System.out.println(st.toString());
	}

	 static  String defangIp(String address) {
		StringBuilder st = new StringBuilder();
		char[] ch = address.toCharArray();
		for(int i=0; i<ch.length; i++) {
			if(ch[i]!='.') {
				st.append(ch[i]);
			}else {
				st.append("[.]");
			}
		}
		
		return st.toString();
	}

}
