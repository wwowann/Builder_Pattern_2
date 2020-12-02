import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем програму");
        logger.log("Запускаем приветствие");
        System.out.println("Привет Волька ибн Алеша! ");
        logger.log("Просим пользователя ввести размер списка");
        System.out.println("Введи, число равное размеру списка:");
        Scanner scan = new Scanner(System.in);
        String sizeList = scan.nextLine();
        logger.log("Размер списка определен");
        int intSizeList = Integer.parseInt(sizeList);
        logger.log("Просим пользователя ввести максимальное число в списке");
        System.out.println("Введи, максимальное число в этом списке:");
        String maxValueList = scan.nextLine();
        logger.log("Максимальное числов в списке определено");
        int intMaxValueInList = Integer.parseInt(maxValueList);

        List<Integer> list = new ArrayList<>();
        System.out.println("Вот случайный список:");
        logger.log("Получаем случайный список");
        for (int i = 0; i < intSizeList; i++) {
            Random random = new Random();
            list.add(random.nextInt(intMaxValueInList));
        }
        logger.log("Выводим список на экран");
        System.out.println(list);
        logger.log("Просим пользователя ввести число для фильтра значений");
        System.out.println("Введи число, меньше которого значения в новом списке не будут учитываться:");
        String filterValue = scan.nextLine();
        logger.log("Число для фильтра определено");
        int filterValueList = Integer.parseInt(filterValue);

        Filter filter = new Filter(filterValueList);
        logger.log("Запускаем фильтрацию");
        list = filter.filterOut(list);
        logger.log("Выводим отфильтрованный список на экран");
        System.out.println(list);
        logger.log("Завершаем работу программы");
    }
}
