package HomeWork5;


public class HomeWork5 {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.toString();


        Employee[] emplArray = new Employee[5];


        emplArray[0] = new Employee("Иван Васильевич", "Шут", "funnyvasya@mail.ru", +79215413155l, 15000, 27);
        emplArray[1] = new Employee("Артем Генадьевич", "Советник царя", "arthelper@mail.ru", +79195413132l, 25000, 56);
        emplArray[2] = new Employee("Елизавета Александрвна", "Садовница", "lizaflowers@mail.ru", +79185413154l, 20000, 25);
        emplArray[3] = new Employee("Петр Иванович", "Конюх", "petyapetay@mail.ru", +79235413777l, 15000, 42);
        emplArray[4] = new Employee("Александр Алексеевич", "Страж", "alexfear@mail.ru", +79215413666l, 20000, 20);



    }



}
