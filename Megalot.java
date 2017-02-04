package february;
import java.util.*; 

public class Megalot {
	static Random rnd = new Random(); 
	
	public static void mega()
	{
		Integer[] b = new Integer[1];
		for (int j = 0 ; j<b.length ; j++)
		{
			b[j] = rnd.nextInt(9);

		}
		System.out.println("����������:");
		System.out.println(Arrays.toString(b));
	}

	public static void sixper42()
	{
	Integer[] a = new Integer[6];

		for (int i = 0 ; i<a.length ; i++)
		{
			a[i] = rnd.nextInt(42);
		}
		System.out.println(a.length + "��42: ");
		System.out.println(Arrays.toString(a));
	}

	public static void main (String[] args)
	{
			sixper42();
			mega();
	}
	
}


