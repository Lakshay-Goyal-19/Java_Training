import java.util.*;

public class Operations {
    private List<Contact> contacts;

    public Operations() {
        this.contacts = new ArrayList<>();
    }

    public void createNewContact(String firstName, String surName, long phoneNumber) {
        Contact newContact = new Contact(firstName, surName, phoneNumber);
        contacts.add(newContact);
        System.out.println("Contact added successfully.");
    }

    public Contact search(String name) {
        for (Contact contact : contacts) {
            if (contact.getfirstName().equalsIgnoreCase(name)) {
                return contact;
            }
        }
        System.out.println("Contact not found.");
        return null;
    }

    public void edit(String name, Scanner scanner) {
        Contact contact = search(name);
        if (contact != null) {
            System.out.println("Enter new first name: ");
            contact.setfirstName(scanner.nextLine());
            System.out.println("Enter new surname: ");
            contact.setsurName(scanner.nextLine());
            System.out.println("Enter new phone number: ");
            contact.setphoneNumber(scanner.nextLong());
            scanner.nextLine(); // consume newline
            System.out.println("Contact updated successfully.");
        }
    }

    public void delete(String name) {
        Contact contact = search(name);
        if (contact != null) {
            contacts.remove(contact);
            System.out.println("Contact deleted successfully.");
        }
    }

    public void display() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
            return;
        }
        for (Contact contact : contacts) {
            System.out.println("Name: " + contact.getfirstName() + " " + contact.getsurName());
            System.out.println("Phone: " + contact.getphoneNumber());
            System.out.println("Email: " + contact.getemail());
            System.out.println("-----------------------------");
        }
    }
}
