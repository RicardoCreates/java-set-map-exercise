package de.ricardo;

public class Main {
    public static void main(String[] args) {

        Pharmacy pharmacy = new Pharmacy();

        Medication med1 = new Medication("Aspirin", 12.99, true );
        Medication med2 = new Medication("Paracetamol", 2.99, false );
        Medication med3 = new Medication("Ibu", 5.99, true );

        pharmacy.save(med1);
        pharmacy.save(med2);
        pharmacy.save(med3);

        System.out.println("All Medications: ");
        pharmacy.printAllMedications();

        System.out.println("Finding Aspirin: ");
        Medication foundMedication = pharmacy.find("Aspirin");
        if (foundMedication != null) {
            System.out.println(foundMedication);
        } else {
            System.out.println("No Aspirin found");
        }

        System.out.println("Number of Medications: " + pharmacy.getCount());

        pharmacy.delete("Aspirin");
        System.out.println("After deleting Aspirin: ");
        pharmacy.printAllMedications();

    }
}