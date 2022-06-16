package methodreference;

import java.util.function.BiFunction;

public class MethodReferenceDemo1 {
	public static int add(int a, int b) {
		return a + b;
	}
	public static float add(int a, float b) {
		return a + b;
	}
	public static void main(String[] args) {
		var x = 10;
		BiFunction<Integer, Integer, Integer> adder = MethodReferenceDemo1::add;
		BiFunction<Integer, Float, Float> adderf = MethodReferenceDemo1::add;
		int result = adder.apply(10, 201);
		float result1 = adderf.apply(1000, 201f);
		System.out.println(result);
		System.out.println(result1);
		//System.out.println(x);
	}
}
