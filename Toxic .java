class Toxic {

    int id;
    String name;
    String type;
    String color;
    double quantity;
    String smell;
    boolean isDangerous;
    String effect;
    String origin;
    String state;
    String chemicalFormula;
    String usage;
    String storage;
    double rating;
    String hazardLevel;
    String disposalMethod;
    String safetyGear;
    String exposureType;
    String symptoms;
    String antidote;

    public Toxic(int id, String name, String type, String color, double quantity,
                 String smell, boolean isDangerous, String effect, String origin,
                 String state, String chemicalFormula, String usage, String storage,
                 double rating, String hazardLevel, String disposalMethod,
                 String safetyGear, String exposureType, String symptoms, String antidote) {

        this.id = id;
        this.name = name;
        this.type = type;
        this.color = color;
        this.quantity = quantity;
        this.smell = smell;
        this.isDangerous = isDangerous;
        this.effect = effect;
        this.origin = origin;
        this.state = state;
        this.chemicalFormula = chemicalFormula;
        this.usage = usage;
        this.storage = storage;
        this.rating = rating;
        this.hazardLevel = hazardLevel;
        this.disposalMethod = disposalMethod;
        this.safetyGear = safetyGear;
        this.exposureType = exposureType;
        this.symptoms = symptoms;
        this.antidote = antidote;
    }

    public void display() {
        System.out.println("Toxic: " + id + " " + name + " " + hazardLevel + " " + effect);
    }
}