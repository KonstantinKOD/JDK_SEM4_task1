import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
/*
В рамках выполнения задачи необходимо:
1. Создайте коллекцию мужских и женских имен с помощью интерфейса List
2. Отсортируйте коллекцию в алфавитном порядке
3. Отсортируйте коллекцию по количеству букв в слове
4. Разверните коллекцию
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = createList();

//    3. Отсортируйте коллекцию по количеству букв в слове
        System.out.print("\nСортировка по колличеству букв: ");
        System.out.println(sortByLength(list));

//    2. Отсортируйте коллекцию в алфавитном порядке
        System.out.print("\nСортировка по алфавиту: ");
        System.out.println(sortByAlphabet(list));

//    4. Разверните коллекцию
        System.out.print("\nРазворот массива: ");
        System.out.println(reverse(list));
    }
    // N4.
    static List<String> reverse(List<String> list) {
        return list.stream().sorted(Comparator.reverseOrder()).toList();
    }

    //   N3.
    static List<String> sortByLength(List<String> list) {
//        пример метода через .stream() (с сокращенной формой лямбда выражением)
        return list.stream().sorted(Comparator.comparingInt(String::length)).toList();
        // stream работает только с коллекциями.
        // Метод .stream() возвращает имеено stream, а не list.
        // Чтобы вернуть list, нужно дописать .toList(), что возвращает именно list а не stream.

    }

//   N2.
    static List<String> sortByAlphabet(List<String> list) {
//        Лямбда выражение. Сокращенная версия лямбда выражения: list.sort(String::compareTo);
        list.sort((e1, e2) -> e1.compareTo(e2));
        return list;
    }

//    1. Создайте коллекцию мужских и женских имен с помощью интерфейса List
    static List<String> createList() {
        List<String> list = new ArrayList<>();
        list.add("Костя");
        list.add("Мария");
        list.add("Светлана");
        list.add("Кирилл");
        list.add("Семен");
        list.add("Святослав");
        list.add("Игорь");
        return list;
    }
}