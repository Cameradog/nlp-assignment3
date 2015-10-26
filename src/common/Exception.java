package common;

public class Exception {
	static boolean isDebugMode = Constant.DEBUG;

	public static void OVERFLOW() {
		if (isDebugMode) {
			System.out.println("OverFlow Occur");
		}
	}

	public static void UNDERFLOW() {
		if (isDebugMode) {
			System.out.println("underflow Occur");
		}
	}
}
