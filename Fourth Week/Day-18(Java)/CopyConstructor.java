class Address {
    String city;

    Address(String city) {
        this.city = city;
    }

    Address(Address other) {//copy constructor
        this.city = other.city;
    }
}

class Person {
    String name;
    Address address;

    // Constructor
    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Copy constructor with deep copy
    Person(Person other) {
        this.name = other.name;
        this.address = new Address(other.address); // deep copy
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        Address address1 = new Address("Delhi");
        Person p1 = new Person("Alice", address1);
        Person p2 = new Person(p1);  // deep copy

        // Check object references
        System.out.println("p1 == p2: " + (p1 == p2)); // false
        System.out.println("p1.name.equals(p2.name): " + p1.name.equals(p2.name)); // true
        System.out.println("p1.address == p2.address: " + (p1.address == p2.address)); // false
        System.out.println("p1.address.city.equals(p2.address.city): " + p1.address.city.equals(p2.address.city)); // true
    }
}
