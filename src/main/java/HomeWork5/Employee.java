package HomeWork5;

/**
 * №1. Создание класса с полями
 */
public class Employee {
    private String fullName;
    private String position;
    private String email;
    private long number;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email, long number, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    /**
     * №2. Заполняет поля при создании объекта
     */
    public Employee() {
        this("Иван Иванов", "Царь", "king@yandex.ru", 79284123211l, 100000, 45);
    }

    /**
     * №3. Выводит инфо об объекте     *
     * @return
     */
    @Override
    public String toString() {
        System.out.println("Employee {" +
                "fullName = '" + fullName + '\'' +
                ", position = '" + position + '\'' +
                ", email = '" + email + '\'' +
                ", number = " + number +
                ", salary = " + salary +
                ", age = " + age +
                '}');
        return "Employee {" +
                "fullName = '" + fullName + '\'' +
                ", position = '" + position + '\'' +
                ", email = '" + email + '\'' +
                ", number = " + number +
                ", salary = " + salary +
                ", age = " + age +
                '}';

    }

    /**
     * №5. Проверяет возраст сотрудников и выводит инфо о тех, кто старше 40
     * @param
     */
    public static void checkArray(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].age > 40) {
                employees[i].toString();
            }
        }
    }


}
