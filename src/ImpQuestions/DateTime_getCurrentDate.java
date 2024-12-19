package ImpQuestions;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
public class DateTime_getCurrentDate
{
	public static void main(String[] args)
	{
		//System.out.println(LocalDate.now());
		
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
	}
}