package february;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.LocalTime;

public class Invoice {
    String name;
    String adress;
    String casir;
    int numbercase;
    double sum;
    double pdv;
    double money;
    double zdacha;
    public Invoice() throws IOException {
        name = "ТОВ" + "'ТК Супермаркет'";
        System.out.println(name);
        adress = "Пр. Московський, 238";
        System.out.println("м.Харків" + adress);
        casir = "Ivanova O.M";
        System.out.println("Касир:" + casir);
        numbercase = 1;
        System.out.println("Касса №" + numbercase);
        System.out.println("--------------------");
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        sum = 0;
        int count = 0;
        String[] prints = new String[100];
        String print;
        while (true) {
            double coast = 0;
            System.out.println("Введите товар:");
            String name = r.readLine();
            System.out.println("Введите цену:");
            String cena = r.readLine();
            System.out.println("---------------------");
            try {
                if (!cena.equals("")) {
                    coast = Double.parseDouble(cena);
                }
            } catch (Exception e) {
                System.err.format("Ошибка ввода данных! Только числовые значения!", e);
                System.exit(0);
            }
            if (!name.isEmpty() && !cena.isEmpty()) {

                sum = sum + coast;
                print = name + "         " + coast;
                prints[count] = print;
                count++;
                System.out.println("Сохранено. Введите еще товар.\n" +
                        "Если нет больше товаров нажмите 2 раза  кнопку Enter. ");
            } else break;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(prints[i]);
        }
        System.out.println("Сумма " + sum + "");
        pdv = sum * 0.2;
        System.out.print("ПДВ ");
        System.out.format("%.2f\n", pdv);
        System.out.println("Ваши деньги:");
        String mymoney = r.readLine();
        money = Double.parseDouble(mymoney);
        if (money >= sum) {
            zdacha = money - sum;
            System.out.print("Ваша сдача: ");
            System.out.format("%.2f\n", zdacha);
            System.out.println("Спасибо за покупку!");
            LocalDate today = LocalDate.now();
            LocalTime time = LocalTime.now();
            System.out.println(today + "" + time);
        } else if (money < sum)
            System.out.println("У тебя мало денег. Иди домой нищеброд!");
    }

    
    public static void main(String[] args) throws Exception {
        new Invoice();
    }
}
