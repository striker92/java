package february;

import java.io.IOException;
import java.time.LocalDate;
import java.time.*;

public class GetFunWithJavaLang {
	@SuppressWarnings("deprecation")
	public static int[][] Cal(int month, int year) throws IOException {
		LocalDate localDate = LocalDate.of(year, month, 1);
	//	System.out.println(localDate.getDayOfWeek());
	//	System.out.println(localDate.plusDays(1));
		DayOfWeek weekday = localDate.getDayOfWeek();
		int[] days = {0, 31 ,28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int[][] calen = new int[7][7];
		int k = 0;
		for (int i = 0; i < calen.length; i++) {
			for (int j = 0; j < calen.length; j++) {
				if (days[month] > k) {
					k++;
					calen[i][j] = k;
				}
			}
		}
		System.out.println("Mon Tue Wed Thu Fri Sat Sun");
		for (int i = 0; i < calen.length; i++, System.out.println(" ")) {
			for (int j = 0; j < calen.length; j++) {

				if (calen[i][j] >= 1)
				{
					int value = weekday.getValue();
					//for (int x = 1; x < value; x++)
					System.out.print(calen[i][j]  + " ");
				}
			}
		}
		return calen;
	}
	public static void main(String[] args) throws IOException
	{
		Cal(1, 2017);
	}
}

