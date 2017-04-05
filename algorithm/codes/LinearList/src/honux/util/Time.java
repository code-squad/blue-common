package honux.util;

public class Time {
	private static long timemillis;
	public static void start() {
		timemillis = System.currentTimeMillis();
	}
	
	public static void end() {
		timemillis = System.currentTimeMillis() - timemillis;
	}
	
	public static long getTime() {
		return timemillis;
	}
	
	public static void printTime() {
		System.out.println("Elapsed time(ms): " + timemillis);
	}
}
