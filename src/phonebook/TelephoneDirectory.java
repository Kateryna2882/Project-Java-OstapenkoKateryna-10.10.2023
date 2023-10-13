package phonebook;

import java.util.ArrayList;
import java.util.List;

public class TelephoneDirectory {

    private List<Record> records = new ArrayList<>();

    public void addRecord(Record record) {
        records.add(record);
    }

    public Record findRecord(String name) {
        for (Record record : records) {
            if (record.getName().equals(name)) {
                return record;
            }
        }
        return null;
    }

    public List<Record> findAllRecords(String name) {
        List<Record> foundRecords = new ArrayList<>();
        for (Record record : records) {
            if (record.getName().equals(name)) {
                foundRecords.add(record);
            }
        }
        return foundRecords.isEmpty() ? null : foundRecords;
    }
}
