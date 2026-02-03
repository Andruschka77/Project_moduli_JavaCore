package org.example.Collection;

public class Contact {

    private String name;
    private String phone;
    private String email;
    private String group;

    public Contact(String name, String phone, String email, String group) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.group = group;
    }

    public String getPhone() {
        return phone;
    }

    public String getGroup() {
        return group;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Contact{name='" + name + "', phone='" + phone + "', email='" + email + "', group='" + group + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Contact other = (Contact) obj;

        if (name == null ? other.name != null : !name.equals(other.name)) return false;
        if (phone == null ? other.phone != null : !phone.equals(other.phone)) return false;
        if (email == null ? other.email != null : !email.equals(other.email)) return false;
        return group == null ? other.group == null : group.equals(other.group);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (group != null ? group.hashCode() : 0);
        return result;
    }

}