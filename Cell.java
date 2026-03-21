class Cell {

    int id;
    String type;
    String shape;
    String function;
    double size;
    String structure;
    String nucleus;
    String membrane;
    String cytoplasm;
    String organelles;
    String division;
    String energy;
    String growth;
    String reproduction;
    double rating;
    String research;
    String condition;
    String response;
    String activity;
    String lifeSpan;

    public Cell(int id, String type, String shape, String function, double size,
                String structure, String nucleus, String membrane, String cytoplasm,
                String organelles, String division, String energy, String growth,
                String reproduction, double rating, String research, String condition,
                String response, String activity, String lifeSpan) {

        this.id = id;
        this.type = type;
        this.shape = shape;
        this.function = function;
        this.size = size;
        this.structure = structure;
        this.nucleus = nucleus;
        this.membrane = membrane;
        this.cytoplasm = cytoplasm;
        this.organelles = organelles;
        this.division = division;
        this.energy = energy;
        this.growth = growth;
        this.reproduction = reproduction;
        this.rating = rating;
        this.research = research;
        this.condition = condition;
        this.response = response;
        this.activity = activity;
        this.lifeSpan = lifeSpan;
    }

    public void display() {
        System.out.println("Cell: " + id + " " + type + " " + function);
    }
}