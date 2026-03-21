class Brain {

    int id;
    String part;
    String function;
    String color;
    double weight;
    String type;
    String health;
    String disease;
    String memory;
    String control;
    String system;
    String signalType;
    String protection;
    String structure;
    double rating;
    String research;
    String condition;
    String response;
    String activity;
    String development;

    public Brain(int id, String part, String function, String color, double weight,
                 String type, String health, String disease, String memory,
                 String control, String system, String signalType, String protection,
                 String structure, double rating, String research, String condition,
                 String response, String activity, String development) {

        this.id = id;
        this.part = part;
        this.function = function;
        this.color = color;
        this.weight = weight;
        this.type = type;
        this.health = health;
        this.disease = disease;
        this.memory = memory;
        this.control = control;
        this.system = system;
        this.signalType = signalType;
        this.protection = protection;
        this.structure = structure;
        this.rating = rating;
        this.research = research;
        this.condition = condition;
        this.response = response;
        this.activity = activity;
        this.development = development;
    }

    public void display() {
        System.out.println("Brain: " + id + " " + part + " " + function + " " + weight);
    }
}