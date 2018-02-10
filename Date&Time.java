
	import java.text.SimpleDateFormat;

	import java.util.Date;

/* By Sumit Kumar */

	public class Date1 {

		
		   public static void main(String args[]) {

			      Date todayDate = new Date( );

			      SimpleDateFormat dateFormat = 

			      new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");


			      System.out.println("Current Date: " + dateFormat.format(todayDate));

			   }

		}

