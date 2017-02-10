package february;

public class Health
{
    String name;
    double weight;
    double height;
    double index;
    int age;
    boolean sex;

    public double getIndex(double weight, double height)
    {
        this.weight = weight;
        this.height = height;
        index = weight /  Math.pow(height,2);
        double result = 24*Math.pow(height,2);
        int okr = (int)Math.round(result);
        getWorldIndex();
        System.out.print("\033[34m\nВаш индекс массы тела равен: ");
        System.out.format("%.1f\n" , + index);
        if (index<=15.99)
        {
            System.out.println("\033[32mУ Вас выраженый дефицит массы тела. Обратитесь к врачу.");
            System.out.println("\033[32mРекомендованная норма: " + okr + "кг.");
        }
        else if (index>=16 && index<=18.5)
        {
            System.out.println("\033[32mУ Вас едостаточная (дефицит) масса тела. Стоит немного поднабрать.");
            System.out.println("\033[32mРекомендованная норма: " + okr + "кг.");
        }
        else if (index>=18.51 && index<=24.99)
        {
            System.out.println("\033[32mВаша масса тела в пределах нормы. Так держать!");
            System.out.println("\033[32mРекомендованный вес: " + okr + "кг.");
        }
        else if (index>=25 && index<=29.99)
        {
            System.out.println("\n\033[31mУ Вас избыточная масса тела.\n");
            System.out.println("\033[32mРекомендованная норма: " + okr + "кг.");

        }
        else if (index>=30 && index<=34.99)
        {
            System.out.println("\033[31mУ Вас ожирение первой степени. ");
            System.out.println("\033[32mРекомендованная норма: " + okr + "кг.");
        }
        else if (index>=35 && index<=39.99)
        {
            System.out.println("У Вас ожирение второй степени");
            System.out.println("Рекомендованная норма: " + okr + "кг.");
        }
        else if (index>=40)
        {
            System.out.println("У Вас ожирение третьей степени (морбидное). Вам осталось не долго.");
            System.out.println("Рекомендованная норма: " + okr + "кг.");
        }
        else
        {
            System.out.println("Проверьте ввод данных");
        }
        return index;
    }

    public void getWorldIndex()
    {
        System.out.println("\033[33mИндекс массы тела — величина, позволяющая оценить степень соответствия массы человека\n" +
                "и его роста и оценить,является ли масса недостаточной, нормальной или избыточной.\n" +
                "Важен при определении показаний для необходимости лечения.");

        System.out.println("\033[35m------------------------------------------------------------------------------------");
        System.out.println("Индекс массы тела" + "          |        " + "Соответствие между массой человека и его ростом");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("16 и менее"+"                               " + " Выраженный дефицит массы тела");
        System.out.println("16—18,5 " +  "                                 "  +  "Недостаточная (дефицит) масса тела");
        System.out.println("18,5—24,99" + "                               " +"Норма");
        System.out.println("25—30" +"                                    " +"Избыточная масса тела (предожирение)");
        System.out.println("30—35" +"                                   " +" Ожирение первой степени");
        System.out.println("35—40" +"                                    " +"Ожирение второй степени");
        System.out.println("40 и выше" +"                                 " +"Ожирение второй степени");
        System.out.println("");


    }
}
