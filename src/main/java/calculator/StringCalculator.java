package calculator;

public class StringCalculator {

	public int add(String input) {

		if (input == null || input.length() == 0) {
			return 0;
		}
        String s="\n,";
        String str[]= s.split(s);
        int sum=0;
        for(int i=0;i<s.length();i++) {
            sum+=Integer.parseInt(str[i]));
        }
        return sum;
	}

}