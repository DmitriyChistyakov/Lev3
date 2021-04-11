package Lesson1;



import java.util.*;
import java.util.List;

/**
 * 1. Написать метод, который меняет два элемента массива местами.
 * (массив может быть любого ссылочного типа).
 * 2. Написать метод, который преобразует массив в ArrayList/
 */

/**
 * a. Есть классы Fruit -> Apple, Orange;(больше фруктов не надо)
 * b. Класс Box в который можно складывать фрукты, коробки условно сортируются по типу фрукта,
 * поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
 * c. Для хранения фруктов внутри коробки можете использовать ArrayList;
 * d. Сделать метод getWeight() который высчитывает вес коробки,
 * зная количество фруктов и вес одного фрукта(вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
 * e. Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку с той,
 * которую подадут в compare в качестве параметра, true - если их веса равны,
 * false в противном случае(коробки с яблоками мы можем сравнивать с коробками с апельсинами);
 * f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку
 * (помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами),
 * соответственно в текущей коробке фруктов не остается, а в другую перекидываются объекты,
 * которые были в этой коробке;
 * g. Не забываем про метод добавления фрукта в коробку.
 */


public class Main {
    public static void main(String[] args) {
        new Box<Apple>();
        new Box<Orange>();

        arrayToArrayList();

    }

    public static void tack1() {


    }


    public static void arrayToArrayList() {
        int position1 = 3;
        int position2 = 5;

        /** данный участок работает с массивом string */
//        String[] arr = {"1", "2", "3", "4", "1", "6"};
//        List<String> arrayList = new ArrayList<String>(arr.length);
//        arrayList = Arrays.asList(arr);
//        System.out.println(arrayList);

        /** данный участок работает с массивом любых типов  */

//        String[] arr = {"1", "к", "5к", "4", "1", "6", "7", "8", "9"};
        String[] arr = {"sdsfe", "efefsdd", "ddwwwd", "wwdd", "1", "6", "555", "6534354354"};
//        int[] arr = {1, 2, 3, 4, 1, 6}; // массив для проверки кода
//        float[] arr = {1.0F, 2.2f, 3.3f, 4.2f, 1.2f, 6.2f}; //массив для проверки кода


        List<String> arrayList = new ArrayList<String>(arr.length);
        for (int i = 0; i < arr.length; i++) {
            arrayList.add(i, String.valueOf(arr[i]));
        }
        System.out.println(arrayList);

        /**на этом выполнение второго задания закончилось. Приступаем к заданию номер 1*/


        arrayList.add(position1, arrayList.get(position2));
        arrayList.add((position2 + 1), arrayList.get(position1 + 1));
        arrayList.remove(position2 + 2);
        arrayList.remove(position1 + 1);
        System.out.println(arrayList);
        String[] arrNew = null; //работает только для string массива....
        arrNew = arrayList.toArray(new String[arrayList.size()]);
        arr = arrNew;
/** вывод массива в консоль для проверки*/
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

    }


}


