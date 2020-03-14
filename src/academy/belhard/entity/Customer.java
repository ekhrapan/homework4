package academy.belhard.entity;

/**
 * Класс Customer
 * Вынесен в отдельный пэкедж entity (сущность)
 * для логического отделения
 */
public class Customer {

    private String firstName;
    private String lastName;
    private String phone;
    private Address address;

    public Customer(String firstName, String lastName, String phone, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }

    public String getAllInfo() {
        return "имя: '" + firstName + '\'' +
                ", фамилия: '" + lastName + '\'' +
                ", телефон: '" + phone + '\'' +
                ", address=" + address.getFullAddress();
    }
}
