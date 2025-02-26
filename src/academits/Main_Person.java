package academits;

import java.util.Scanner;

public class Main_Person {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "Наталия";
        String middleName = "Генадьевна ";
        String familyName = "Тимошина";
        int age = 39;

        Person person = new Person(name, middleName, familyName, age);
        System.out.println("Первоначальное имя: " + person.getName());
        person.setName("Наталья");
        System.out.println("Первоначальное отчество: " + person.getMiddleName());
        person.setMiddleName("Геннадьевна");
        System.out.println("Первоначальная фамилия: " + person.getFamilyName());
        person.setFamilyName("Браун");
        System.out.println("Возраст: " + age);
        System.out.println("ФИО: " + person);
        System.out.print("Год рождения: " + person.getBirthYear());
    }
}
