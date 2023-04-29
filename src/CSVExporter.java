import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.util.List;


public class CSVExporter {
    public void export(List<Person> persons, String filename) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Person person : persons) {
                String line = "Vorname: " + person.getFirstName() + ", Nachname: " + person.getLastName();
                writer.write(line);
                writer.newLine();
            }
        }
    }
}
