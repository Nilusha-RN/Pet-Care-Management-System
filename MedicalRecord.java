public class MedicalRecord {

    private String recordId;
    private Pet pet;
    private String diagnosis;
    private String treatment;
    private String visitDate;

    public MedicalRecord(String recordId,
                         Pet pet,
                         String diagnosis,
                         String treatment,
                         String visitDate) {

        this.recordId = recordId;
        this.pet = pet;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.visitDate = visitDate;
    }

    public String getRecordId() {
        return recordId;
    }

    public Pet getPet() {
        return pet;
    }

    public void displayRecord() {

        System.out.println("==============================");
        System.out.println("Record ID : " + recordId);
        System.out.println("Pet Name  : " + pet.getName());
        System.out.println("Diagnosis : " + diagnosis);
        System.out.println("Treatment : " + treatment);
        System.out.println("Visit Date: " + visitDate);
        System.out.println("==============================");
    }

}