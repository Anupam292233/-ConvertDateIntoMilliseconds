import java.util.Date;

public class ConvertDateIntoMilliseconds {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println("Date = " + d);
		System.out.println("Milliseconds since July 11, 2023, 00:00:00 GMT = " + d.getTime());
	}

}
