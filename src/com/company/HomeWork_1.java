package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HomeWork_1 {

    public static int max = 100;
    public static int even;
    public static int odd;


    public static void main(String[] args) throws IOException {

        System.out.println("----- TASK 1 -----");

        String text_1 = "JAVA HOME";

        for(int i = 0; i < 10; i++){
            System.out.println(text_1);
        }

       //"----- TASK 2 -----"
        // В методе main создай объект Man, сохрани ссылку на него в переменную man.
        //Создай также объект Woman и сохрани ссылку на него в переменную woman.
        //В man.wife сохрани ссылку на ранее созданный объект Woman.
        //В woman.husband сохрани ссылку на ранее созданный объект Man

        Man man = new Man();
        Woman woman = new Woman();

        man.wife = woman;
        woman.husband = man;

        System.out.println("----- TASK 3 -----");
        System.out.println(min(9,11));

        System.out.println("----- TASK 4 -----");
        System.out.println(convertToSeconds(2));
        System.out.println(convertToSeconds(5));

        System.out.println("----- TASK 5 -----");
        System.out.println(multiplicationTable (1));
        System.out.println(multiplicationTable (2));
        System.out.println(multiplicationTable (3));
        System.out.println(multiplicationTable (4));
        System.out.println(multiplicationTable (5));
        System.out.println(multiplicationTable (6));
        System.out.println(multiplicationTable (7));
        System.out.println(multiplicationTable (8));
        System.out.println(multiplicationTable (9));
        System.out.println(multiplicationTable (10));

        System.out.println("----- TASK 6 -----");
        Apple apple = new Apple();
        apple.addPrice(50);
        Apple apple2 = new Apple();
        apple2.addPrice(100);
        System.out.println("Стоимость яблок " + Apple.applesPrice);

        System.out.println("----- TASK 7 -----");
        Human human = new Human();
        human.setName("Макс");
        System.out.println(human.name);

        System.out.println("----- TASK 8 -----");
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);

        System.out.println("----- TASK 11 -----");
        System.out.println("Enter two numbers:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String text = "The max is ";
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        if (a==b){
            System.out.println("Numbers are equal");
        }
        else if (a>=b){
            max = a;
            System.out.println(text + max);
        }
        else{
            max = b;
            System.out.println(text + max);
        }

        System.out.println("----- TASK 12 -----");
        System.out.println("Enter INT number:");

        int c = Integer.parseInt(reader.readLine());
        while(c>=1){
            if ((c%10)%2==0){
                even = even +1;
            }
            if ((c%10)%2==1){
                odd = odd +1;
            }
            c = c/10;
        }

        System.out.println("Even: " + even + " Odd: " + odd);

        System.out.println("----- TASK 13 -----");

        int[] array = initializeArray();
        int max = max(array);
        System.out.println("Maximum value in array:\n" + Arrays.toString(array));
        System.out.println(max);



    }

    //"----- TASK 2 -----"
    public static class Man {
        public Woman wife;
    }

    public static class Woman {
        public Man husband;
    }

    //"----- TASK 3 -----"
    //Написать функцию, которая возвращает минимум из двух чисел
    public static int min(int a, int b) {
        if (a > b) return b;
        else return a;
    }

    //"----- TASK 4 -----"
    //Добавь метод public static int convertToSeconds(int hour) который будет конвертировать часы в секунды.
    //Вызови его дважды в методе main с любыми параметрами.
    //Результаты выведи на экран, каждый раз с новой строки.
    public static int convertToSeconds(int hour){
        return hour*60*60;
    }

    //"----- TASK 5 -----"
    //Таблица умножения
    //Выведи на экран таблицу умножения 10 на 10 в следующем виде:
    //1 2 3 4 …
    //2 4 6 8 …
    //3 6 9 12 …
    //4 8 12 16 …
    public static String multiplicationTable (int number){

        String a = Integer.toString(number);
        for (int i = 0; i < 9; i++) {
            a = a + " " + (i+2)*number;
        }
        return a;
    }

    //"----- TASK 6 -----"
    //Подсчитать суммарную стоимость яблок.
    //За суммарную стоимость яблок отвечает переменная
    public static class Apple {
        public static int applesPrice = 0;

        public void addPrice(int applesPrice) {
            this.applesPrice = this.applesPrice + applesPrice;
        }
    }
    //"----- TASK 7 -----"
    //Реализуте метод setName.
    public static class Human {
        private String name = "человек";

        public void setName(String name) {
            this.name = name;
        }
    }
    //"----- TASK 8 -----"
    //Времена года
    //Напишите метод checkSeason. По номеру месяца, метод должен определить время года (зима, весна, лето, осень) и вывести на экран.
    public static void checkSeason(int month) {
        if (month < 1 || month > 12){
            System.out.println("wrong month number!");
        }
        if (month < 2 || month > 11){
            System.out.println("Winter");
        }
        if (month > 2 && month < 6){
            System.out.println("Spring");
        }
        if (month > 5 && month < 9){
            System.out.println("Summer");
        }
        if (month > 8 && month < 12){
            System.out.println("Autumn");
        }

        switch(month){
            case 1:
            case 2:
            case 12:
                System.out.println("Winter");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
        }

    }

    //"----- TASK 9 -----"
    //Создать класс Human. У человека должно быть имя (name, String), возраст (age, int), вес (weight, int), сила (strength, int).
    public static class Human2{
        private String name = "Name";
        private int Age;
        private int weight;
        private int strength;
    }

    //"----- TASK 10 -----"
    public static class Dog{
        private String name = "Name";
        private int age;

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    //"----- TASK 13 -----"
    public static int[] initializeArray() throws IOException {
        // создай и заполни массив
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*100);
        }
        return array;
    }
    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }


}
