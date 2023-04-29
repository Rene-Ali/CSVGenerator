import java.rmi.server.ExportException;

public class Main {

    public static void main(String[] args) throws ExportException {

        Person p1 = new Person("Ali", "G");
        System.out.println("Vorname" + p1.getFirstName());
        System.out.println("Nachname " + p1.getLastName());


        Company c1 = new Company();
        //Company c1 = new Company();
        c1.addPerson(p1);
        c1.addPerson("Jane", "Doe");
        c1.addPerson("Hulk", "Green");
        c1.addPerson("Green", "Blue");

        //CSVExporter e1 = new CSVExporter("C:\\Users\\pm-user09\\Desktop\\Codersbay\\csv.txt");

        try {
            c1.export("C:\\Users\\pm-user09\\Desktop\\Codersbay\\csv.txt");
        } catch (ExportException e) {
            System.out.println("Fehler: "+ e.getMessage());
        }


    }
}