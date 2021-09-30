public class Exercise55 {
	public static void secToTime(int seconds )
	{
		int hours = seconds / 3600;
		seconds = seconds - hours * 3600;
		int minutes = seconds % 60;
		seconds = seconds % 60;
		System.out.println(hours + ":" + minutes + ":" + seconds);
	}
	public static void main(String[] args) {
		int seconds = 86339;
		secToTime(seconds);
		seconds = 45030;
		secToTime(seconds);
	}

}
