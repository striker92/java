package february;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.text.html.HTMLDocument.Iterator;
import javax.xml.crypto.Data;

public class GetFunWithJavaLang {
	@SuppressWarnings("deprecation")
	public static int[][] Cal(int month, int year) throws IOException {
		
		LocalDate localDate = LocalDate.of(year, month, 1);
	
		System.out.println(localDate.getDayOfWeek());
		
		HashMap<String , Integer> map = new HashMap<String , Integer>();
		
		map.put("SUNDAY", 7); 
		map.put("MONDAY", 1); 
		map.put("TUESDAY", 2); 
		map.put("WEDNESDAY", 3); 
		map.put("THURSDAY", 4); 
		map.put("FRIDAY", 5); 
		map.put("SATURDAY", 6); 

	
		int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		int[][] calen = new int[6][7];
		int k = 0;
		for (int i = 0; i < calen.length; i++) {
			for (int j = 0; j < calen.length; j++) {
				if (days[month - 1] > k) {
					k++;
					calen[i][j] = k;
				}
			}
		}
		for (int i = 0; i < calen.length; i++, System.out.println("  ")) {
			for (int j = 0; j < calen[i].length; j++) {
				System.out.print(calen[i][j] + " " );
			}
		}
		
		
		return calen;
	}
	public static void main(String[] args) throws IOException

	{

		Cal(1, 2017);
	}
}
