package february;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

public class Ex_01 extends MagicSquare {

	public static void ConverterDigits() throws NumberFormatException, IOException
	{
		System.out.println("������� ��������:");
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		Integer value = Integer.parseInt(r.readLine());
		System.out.print("� ��������: ");
		String b = Integer.toBinaryString(value);
		System.out.println(b);
		System.out.print("� 8-����: ");
		String oc = Integer.toOctalString(value);
		System.out.println(oc);
		System.out.print("� 16-��: ");
		String hex = Integer.toHexString(value);
		System.out.println(hex);
		System.out.println("� ��������� ������: " + value.floatValue());
		
	}
	static void MaxValue() throws NumberFormatException, IOException
	{
		System.out.println("������� �������� x:");
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		Integer x = Integer.parseInt(r.readLine());
		System.out.println("������� �������� y:");
		Integer y = Integer.parseInt(r.readLine());
		System.out.println("������� �������� z:");
		Integer z = Integer.parseInt(r.readLine());
		
		int maxvalue = 0;
		maxvalue = Math.max(x, y);		
		if (z>x && z>y)
		{
			System.out.print("Max value: " + z);
		}
		else 
		System.out.println("Max value: " +  maxvalue);
	}
	
	static void GetDouble()
	{

		System.out.println(Math.nextUp(Double.MIN_VALUE));
		System.out.println(Math.nextUp(Double.MAX_VALUE));
	
	}
	
	    public static BigInteger factorial(int n)
	    {
	        BigInteger ret = BigInteger.ONE;
	        for (int i = 1; i <= n; ++i) 
	        {
	        	ret = ret.multiply(BigInteger.valueOf(i));
	        }
	        System.out.println(ret);
	        return ret;
	    }
		
	    public static void ShortWithoutInt() throws NumberFormatException, IOException
	    
	    {
	    	System.out.println("������� �������� X: �� 0 �� 65534");
	    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    	int x = Integer.parseInt(reader.readLine());
	    	System.out.println("������� �������� Y: �� 0 �� 65534");
	    	int y = Integer.parseInt(reader.readLine());
	    	if (x>0 && x<65534 && y>0 && y<65534)
	    	{
	    		short sum,minus,multiply = 0,divide,ost;
	    		double m = multiply;
	    		sum = (short) (x+y);
	    		minus = (short) (x-y);
	    		m = (x*y);
	    		divide = (short)(x/y);
	    		ost=(short) (x%y);
	    	
	    		System.out.println("�����: " + sum);
	    		System.out.println("��������: " + minus);
	    		System.out.println("������������: " + m);
	    		System.out.println("�������: " + divide);
	    		System.out.println("������� ��� �����: " + ost);
	    		
	    	}
	    	else 
	    	{
	    		System.out.println("����� �� �������� � �������� ��������. ��������� ���� ������");
	    	}
	    	
	    }
	    
	    
	    static void WriteStr()
	    {
	    	String str = "������� ���� �������� ����!"; 
	    	String[] substr = str.split(" ");
	    	
	    	System.out.println("1" + substr[0]);
	    	System.out.println("2 " + substr[1]);
	    	System.out.println("3 " + substr[2]);
	    	System.out.println("4 " + substr[3]);
	    	
	    }
	    
	   
	
	    static void ASCI() throws IOException
	    {
	    	 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	 	    String s = reader.readLine();
	    	char[] ASCII = new char[255]; 
	    	for (int i=0; i<255 ; i++)
	    	{
	    		ASCII[i]= (char) i;
	    		
	    	}
	    	System.out.println(ASCII);  
	    }

	public static void main(String[] args) throws IOException 
	{
	//	ConverterDigits(); //1
	//	MaxValue();//2
	//	GetDouble();///3
	//	int y = Integer.MAX_VALUE;
	//	short s = Short.MAX_VALUE;
	//	System.out.println(s*2);
	//	double x = (int) 2147483647;  //  +1 is out of range
	//	factorial(3);
	//	ShortWithoutInt();
	//	WriteStr();
	//	ASCI();
	//	Magic();
		
	}

}
