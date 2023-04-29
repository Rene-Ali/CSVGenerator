
public class Person {
    private String firstName;
    private String lastName;
    public Person(String firstName, String lastName) {
        if(firstName == null || lastName == null){
            throw new IllegalArgumentException("Vorname und Nachname dürfen nicht null oder leer sein");
        }
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
