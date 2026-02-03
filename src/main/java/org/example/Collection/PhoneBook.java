package org.example.Collection;

import java.util.*;

public class PhoneBook {

    private final List<Contact> contactsList = new ArrayList<>();
    private final Map<String, List<Contact>> contactsMap = new HashMap<>();
    private final Set<Contact> contactsSet = new HashSet<>();

    public String addContact(String name, String phone, String email, String group) {
        Contact contact = new Contact(name, phone, email, group);
        if (!contactsSet.add(contact)) {
            return "\nТакой контакт уже существует!";
        }
        contactsList.add(contact);
        List<Contact> groupContacts = contactsMap.get(group);
        if (groupContacts == null) {
            groupContacts = new ArrayList<>();
            contactsMap.put(group, groupContacts);
        }
        groupContacts.add(contact);
        return "\nКонтакт добавлен!";
    }

    public String removeContact(String phone) {
        for (Contact contact : contactsList) {
            if (contact.getPhone().equals(phone)) {
                contactsList.remove(contact);
                contactsSet.remove(contact);
                List<Contact> groupContacts = contactsMap.get(contact.getGroup());
                if (groupContacts != null) {
                    groupContacts.remove(contact);
                    if (groupContacts.isEmpty()) {
                        contactsMap.remove(contact.getGroup());
                    }
                }
                return "\nКонтакт удален";
            }
        }
        return "\nТакого контакта не существует!";
    }

    public List<Contact> getContactsList() {
        return contactsList;
    }

    public void getContact(String name) {
        boolean found = false;
        for (Contact contact : contactsList) {
            if (contact.getName().equals(name)) {
                found = true;
                System.out.println(contact);
            }
        }
        if (!found) {
            System.out.println("Такого контакта не существует!");
        }
    }

    public List<Contact> getContactsByGroup(String group) {
        return contactsMap.get(group);
    }

}