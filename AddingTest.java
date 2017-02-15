package february;


import java.util.Arrays;
import java.util.List;


public class AddingTest {

	public static  void execute(Adding a)
	{
		a.doAnything();
		System.out.println("В методе");
		a.doAnything();

	}

	public static void main(String[] args) {

		{
			Runnable r = () -> System.out.println("hello world");
			new Thread(
					() -> System.out.println("hello world")
			).start();
			List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
			list.forEach(System.out::println);
			execute( () -> System.out.println("Worker вызван через Lambda") );

			// Старый способ:
			new Thread(new Runnable() {
				@Override
				public void run() {
					System.out.println("Hello from thread");
				}
			}).start();


			// Новый способ:
			new Thread(
					() -> System.out.println("Hello from thread")
			).start();

		}

	}
}
