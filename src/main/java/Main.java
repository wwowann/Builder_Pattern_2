import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем сканер");
        Scanner scan = new Scanner(System.in);
        logger.log("Запускаем приветствие");
        System.out.println("Привет Волька ибн Алеша! ");
        logger.log("Просим пользователя ввести размер списка");
        System.out.println("Введи, число равное размеру списка:");
        int intSizeList = valueInput(scan);
        logger.log("Размер списка определен");
        logger.log("Просим пользователя ввести максимальное число в списке");
        System.out.println("Введи, максимальное число в этом списке:");
        int intMaxValueInList = valueInput(scan);
        logger.log("Максимальное числов в списке определено");

        List<Integer> list = createRandomList(logger, intSizeList, intMaxValueInList);
        logger.log("Случайный список сформирован");
        System.out.println("Вот случайный список:");
        logger.log("Выводим список на экран");
        toString(list);
        logger.log("Просим пользователя ввести число для фильтра значений");
        System.out.println("Введи число, меньше которого значения в новом списке не будут учитываться:");
        int filterValueList = valueInput(scan);
        logger.log("Число для фильтра определено");
        Filter filter = new Filter(filterValueList);
        logger.log("Запускаем фильтрацию");
        ArrayList<Integer> listFilter = (ArrayList<Integer>) filter
                .filterOut(list);
        logger.log("Выводим отфильтрованный список на экран");
        toString(listFilter);
        logger.log("Закрываем сканер");
        scan.close();
        logger.log("Завершаем работу программы");

    }

    public static List<Integer> createRandomList(Logger logger, int intSizeList, int intMaxValueInList) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < intSizeList; i++) {
            Random random = new Random();
            list.add(random.nextInt(intMaxValueInList));
        }
        return list;
    }

    public static int valueInput(Scanner scan) {
        return scan.nextInt();
    }

    public static void toString(List<Integer> list) {
        for (Integer value : list) {
            System.out.print(value + ", ");
        }
        System.out.println("");
    }
}
