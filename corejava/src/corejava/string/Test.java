package corejava.string;

import java.util.StringTokenizer;

public class Test {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("This is core java");
		System.out.println("no.of tokens are: " + st.countTokens());
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
