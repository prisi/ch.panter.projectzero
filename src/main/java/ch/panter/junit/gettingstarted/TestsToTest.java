package ch.panter.junit.gettingstarted;


public class TestsToTest implements IMdpJunitDemo {

	@Override
	public boolean isEmpty(String s) {
		return s.isEmpty();
	}

	@Override
	public String capitalize(String s) {
		return s.toUpperCase();
	}

	@Override
	public String reverse(String s) throws NullPointerException {
		 int i, len = s.length();
		    StringBuffer dest = new StringBuffer(len);

		    for (i = (len - 1); i >= 0; i--)
		      dest.append(s.charAt(i));
		    return dest.toString();
	}

	@Override
	public String join(String... strings) {
		String result = "";
		for (String s: strings) {
			result = result + " " + s;
		}
		
		result = result.trim();
		
		return result;
	}
	
	

}
