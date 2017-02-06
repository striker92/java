package february;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;
import java.time.*;

public class Calendar {
	@SuppressWarnings("deprecation")
	public static int[] Cal(int month, int year) throws IOException {
		LocalDate localDate = LocalDate.of(year, month, 1);
		DayOfWeek weekday = localDate.getDayOfWeek();
		int value = weekday.getValue();
		int[] days = {0, 31 ,28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };	
		int[] mas = new int[42];
		int count = 0;
		for(int i= value-1; i<days[month]+value-1;i++)
		{	
			count++;
			mas[i]  = count;
		}	
		int N = 0;
		System.out.print("  MON TUE  WED  THU  FRI  SUT  SUN\n");
		for (int i = 0; i < mas.length; i++, System.out.print("  ")) 
		{
		
			 if (mas[i]  == 0)
				 {
					 System.out.print("    ");
				 }
			 else
				 {
					 if (mas[i] <10 )
					 {
						 System.out.print(" ");
						 
					 }
					 System.out.print(mas[i] + " ");
				 }		
				 N++;
				 if (N==7)
				 {
					 System.out.print ("\n");
					 N=0;
				 }
		}		 			 
	return mas;
	}

	public static void main(String[] args) throws IOException
	{
		Cal(3, 2017);
	}
}
