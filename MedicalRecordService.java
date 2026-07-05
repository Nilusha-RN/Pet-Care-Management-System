import java.util.ArrayList;

public class MedicalRecordService {

    private ArrayList<MedicalRecord> records;

    public MedicalRecordService() {
        records = new ArrayList<>();
    }

    public void addRecord(MedicalRecord record) {

        records.add(record);
        System.out.println("Medical record added successfully.");
    }

    public void displayAllRecords() {

        if(records.isEmpty()){

            System.out.println("No medical records available.");
            return;
        }

        System.out.println("\n===== Medical Records =====");

        for(MedicalRecord record : records){

            record.displayRecord();
        }
    }

    public void searchRecord(String recordId){

        for(MedicalRecord record : records){

            if(record.getRecordId().equalsIgnoreCase(recordId)){

                record.displayRecord();
                return;
            }
        }

        System.out.println("Medical record not found.");
    }

}