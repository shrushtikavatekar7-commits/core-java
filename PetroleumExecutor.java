class PetroleumExecutor {

    public static void main(String[] args) {

        Petroleum p = new Petroleum();

        p.addPetroleum("Petrol");
        p.addPetroleum("Diesel");
        p.addPetroleum("Kerosene");
        p.addPetroleum("LPG");
        p.addPetroleum("CNG");
        p.addPetroleum("Bitumen");
        p.addPetroleum("Naphtha");
        p.addPetroleum("ATF");
        p.addPetroleum("Lubricant");
        p.addPetroleum("Paraffin");

        p.getAllPetroleum();

        System.out.println("Index: " + p.searchPetroleum("Diesel"));

        p.updatePetroleum("Diesel", "Bio-Diesel");

        p.getAllPetroleum();

        p.deletePetroleum("Petrol");

        p.getAllPetroleum();
    }
}