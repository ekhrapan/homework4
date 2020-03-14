package academy.belhard;

/**
 * Мы должны импортировать созданные нами классы, т. к. они находятся в другом пакете
 */
import academy.belhard.entity.Address;
import academy.belhard.entity.Customer;

/**
 * Демонстрация работы приложения
 */
public class Main {

    public static void main(String[] args) {
        /**
         * Создаем пустой массив из 3-х заказчиков
         */
        Customer[] customers = new Customer[3];

        /**
         * Создаем 3 объекта адреса
         */
        Address customerAddress0 = new Address("Минск", "Тимирязева", 4);
        Address customerAddress1 = new Address("Москва", "Ильинка", 16);
        Address customerAddress2 = new Address("Санкт-Петербург", "Садовая", 84);

        /**
         * Создаем 3 объекта заказчика
         */
        Customer customer0 = new Customer("Иван", "Иванов", "1111111", customerAddress0);
        Customer customer1 = new Customer("Петр", "Петров", "2222222", customerAddress1);
        Customer customer2 = new Customer("Дмитрий", "Попов", "3333333", customerAddress2);

        /**
         * Заполняем массив значениями
         */
        customers[0] = customer0;
        customers[1] = customer1;
        customers[2] = customer2;

        /**
         * Так называемый for в стиле foreach.
         * Упрощенный синтаксис для перебора всех элементов массива
         */
        for (Customer customer : customers) {
            System.out.println(customer.getAllInfo());
        }
    }
}
