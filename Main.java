import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        Scanner console = new Scanner(System.in);
        try{
            System.out.println("Введите данные"); //просим пользователя ввести данные

            System.out.print("Введите широту первой точки: ");//ввод знвачений для широты и долгаты для двух точек
            double lat = console.nextDouble();

            System.out.print("Введите долготу первой точки: ");
            double lon = console.nextDouble();

            System.out.print("Введите широту второй точки: ");
            double lat2 = console.nextDouble();

            System.out.print("Введите долготу второй точки: ");
            double lon2 = console.nextDouble();

            double Mlat = Math.toRadians(lat2 - lat);//присваивание новым переменным значения разницы долготы\широты в радианах
            double Mlon = Math.toRadians(lon2 - lon);

            double a = Math.sin(Mlat / 2) * Math.sin(Mlat / 2) + Math.cos(Math.toRadians(lat)) * Math.cos(Math.toRadians(lat2)) * Math.sin(Mlon / 2) * Math.sin(Mlon / 2);

            double b = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));//формулы для вычисления значения

            double d = 6371 * b;//радиус Земли

            System.out.println("Расстояние = " + d + " в километрахм");//вывод результата пользователю
        }

        catch (Exception e) {
        }

        System.out.print("Процесс окончен.");//сообщение, выводящееся при завершении программы
    }
}