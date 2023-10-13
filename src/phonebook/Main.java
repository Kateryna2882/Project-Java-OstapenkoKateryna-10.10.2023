package phonebook;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        TelephoneDirectory telephoneDirectory = new TelephoneDirectory();
        telephoneDirectory.addRecord(new Record("John", "123-456-7890"));
        telephoneDirectory.addRecord(new Record("Alice", "987-654-3210"));
        telephoneDirectory.addRecord(new Record("John", "111-222-3333"));

        Record foundRecord = telephoneDirectory.findRecord("John");
        if (foundRecord != null) {
            System.out.println("Found record: " + foundRecord.getName() + " - " + foundRecord.getPhoneNumber());
        } else {
            System.out.println("Record not found.");
        }


        List<Record> foundRecords = telephoneDirectory.findAllRecords("John");
        if (foundRecords != null) {
            System.out.println("Found records:");
            for (Record record : foundRecords) {
                System.out.println(record.getName() + " - " + record.getPhoneNumber());
            }
        } else {
            System.out.println("Records not found.");
        }
    }
}

