package test;

public class InnerStaticClass {
	private static String s = "string";

	static {
		System.out.println("outer static");
	}

	static class In {
		static {
			System.out.println("inner static");
		}

		public static void main(String[] args) {
			System.out.println(s);
		}
	}
}
