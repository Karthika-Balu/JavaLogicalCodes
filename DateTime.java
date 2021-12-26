import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime format = LocalDateTime.now();
		
		System.out.println("Date format : "+date.format(format));

	}

}
