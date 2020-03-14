package academy.belhard.entity;

/**
 * Класс Address
 * Вынесен в отдельный пэкедж entity (сущность)
 * для логического отделения
 */
public class Address {

    private String city;
    private String street;
    private int houseNumber;

    public Address(String city, String street, int houseNumber) {
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public String getFullAddress() {
        return "город: '" + city + '\'' +
                ", улица: '" + street + '\'' +
                ", дом: " + houseNumber;
    }
}
