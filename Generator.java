package february;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.io.*;

public class Generator {

	public static void main(String[] args) throws IOException {
	
		System.out.println("Enter login: ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String login = reader.readLine();
		if (login != null)
		{
			System.out.println("Длина пароля:");
			Random r = new Random();
			Integer t = Integer.parseInt(reader.readLine());
			if (t >= 1)
			{ String alpha = "a1A2b3B4c5C6d7D8e9E0f!F@g#G$h%H^i&I*k(K)_l~`LmMnNoOpPrRsStTuUvVwWxXyYzZ" +
						"!\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~";
				char[] ASCI = new char[t];
				
				for (int i=0; i<ASCI.length ;i++ )
				{
					ASCI[i] = alpha.charAt(r.nextInt(160));
				}
				System.out.println(ASCI);
			}	
		}
		
	}

}
