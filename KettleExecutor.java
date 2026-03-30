class KettleExecutor {

    public static void main(String[] args) {

        Kettle k = new Kettle();

        k.addKettle("Prestige");
        k.addKettle("Pigeon");
        k.addKettle("Philips");
        k.addKettle("Bajaj");
        k.addKettle("Havells");
        k.addKettle("Butterfly");
        k.addKettle("Orpat");
        k.addKettle("Milton");
        k.addKettle("Usha");
        k.addKettle("Morphy");

        k.getAllKettles();

        System.out.println("Index: " + k.searchKettle("Philips"));

        k.updateKettle("Philips", "Philips Pro");

        k.getAllKettles();

        k.deleteKettle("Prestige");

        k.getAllKettles();
    }
}