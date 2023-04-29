import java.io.FileWriter;
import java.io.IOException;
import java.rmi.server.ExportException;
import java.util.*;

public class Company {
    private List<Person> persons;
    private CSVExporter exporter;

    public Company() {
       this.persons = new List<Person>() {
           @Override
           public int size() {
               return 0;
           }

           @Override
           public boolean isEmpty() {
               return false;
           }

           @Override
           public boolean contains(Object o) {
               return false;
           }

           @Override
           public Iterator<Person> iterator() {
               return null;
           }

           @Override
           public Object[] toArray() {
               return new Object[0];
           }

           @Override
           public <T> T[] toArray(T[] a) {
               return null;
           }

           @Override
           public boolean add(Person person) {
               return false;
           }

           @Override
           public boolean remove(Object o) {
               return false;
           }

           @Override
           public boolean containsAll(Collection<?> c) {
               return false;
           }

           @Override
           public boolean addAll(Collection<? extends Person> c) {
               return false;
           }

           @Override
           public boolean addAll(int index, Collection<? extends Person> c) {
               return false;
           }

           @Override
           public boolean removeAll(Collection<?> c) {
               return false;
           }

           @Override
           public boolean retainAll(Collection<?> c) {
               return false;
           }

           @Override
           public void clear() {

           }

           @Override
           public Person get(int index) {
               return null;
           }

           @Override
           public Person set(int index, Person element) {
               return null;
           }

           @Override
           public void add(int index, Person element) {

           }

           @Override
           public Person remove(int index) {
               return null;
           }

           @Override
           public int indexOf(Object o) {
               return 0;
           }

           @Override
           public int lastIndexOf(Object o) {
               return 0;
           }

           @Override
           public ListIterator<Person> listIterator() {
               return null;
           }

           @Override
           public ListIterator<Person> listIterator(int index) {
               return null;
           }

           @Override
           public List<Person> subList(int fromIndex, int toIndex) {
               return null;
           }
       };
       this.persons = new ArrayList<>();
       this.exporter = exporter;
    }

    public void addPerson(Person person){
        persons.add(person);
    }

    public void addPerson(String firstName, String lastName){
        Person person = new Person(firstName, lastName);
        persons.add(person);
    }

    public void export(String filename) throws ExportException {
        try (FileWriter writer = new FileWriter(filename)) {
            String csvHeader = "Firstname, Lastname \n";
            writer.write(csvHeader);
            for (Person person : persons) {
                String csvLine = person.getFirstName() + "," + person.getLastName() + "\n";
                writer.write(csvLine);
            }
        } catch (IOException e) {
            throw new ExportException("Fehler beim Exportieren der Datei: " + e.getMessage());
        }
    };

  /*  try{
        exporter.export(persons, "export.csv");
        System.out.println("Export erfolgreich");
    } catch(IOException e){
        System.out.println("Fehler beim Exportieren: " + e.getMessage());
    }*/

}

