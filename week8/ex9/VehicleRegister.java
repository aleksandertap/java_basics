package week8.ex9;

import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owners;

    public VehicleRegister() {
        this.owners = new HashMap<RegistrationPlate, String>();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        if (this.owners.containsKey(plate)) {
            return false;
        }
        this.owners.put(plate, owner);
        return true;
    }

    public String get(RegistrationPlate plate) {
        return this.owners.get(plate);
    }

    public boolean delete(RegistrationPlate plate) {
        if (this.owners.containsKey(plate)) {
            this.owners.remove(plate);
            return true;
        }
        return false;
    }

    public void printRegistrationPlates(){
        for (RegistrationPlate plate : this.owners.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners(){
        ArrayList<String> uniqueOwners = new ArrayList<String>();


        for (String owner : this.owners.values()) {

            if (!uniqueOwners.contains(owner)) {
                uniqueOwners.add(owner);
            }
        }

        for (String owner : uniqueOwners) {
            System.out.println(owner);
        }
    }
}
