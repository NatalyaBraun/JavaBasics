package academits;

public class Person {
    private String name;
    private String middleName;
    private String familyName;
    private static int age;
    private static int currentYear;
    private static int birthYear;

    public Person(String name, String middleName, String familyName, int age, int currentYear, int birthYear) {
        this.name = name;
        this.middleName = middleName;
        this.familyName = familyName;
        this.age = age;
        this.currentYear = currentYear;
        this.birthYear = currentYear - age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!(name.length() == 0)) {
            this.name = name;
            System.out.println("Имя было изменено");
        }
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        if (!(middleName.length() == 0)) {
            this.middleName = middleName;
            System.out.println("Отчество было изменено");
        }
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        if (!(familyName.length() == 0)) {
            this.familyName = familyName;
            System.out.println("Фамилия была изменена");
        }
    }

    public static int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getCurrentYear() {
        return currentYear;
    }

    public void setYear(int currentYear) {
        this.currentYear = currentYear;
    }

    public static int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "{ " + familyName + " " + name + " " + middleName + " }";
    }

    public void printAge() {
        System.out.println();
    }

    public void printBirthYear() {
        System.out.println();
    }
}

