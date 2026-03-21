class Organ {

    int id;
    String name;
    String function;
    String bodyPart;
    double weight;
    String color;
    String type;
    String health;
    String disease;
    String system;
    String structure;
    String location;
    String protection;
    double rating;
    String research;
    String condition;
    String response;
    String activity;
    String development;
    String importance;

    public Organ(int id, String name, String function, String bodyPart, double weight,
                 String color, String type, String health, String disease,
                 String system, String structure, String location, String protection,
                 double rating, String research, String condition, String response,
                 String activity, String development, String importance) {

        this.id = id;
        this.name = name;
        this.function = function;
        this.bodyPart = bodyPart;
        this.weight = weight;
        this.color = color;
        this.type = type;
        this.health = health;
        this.disease = disease;
        this.system = system;
        this.structure = structure;
        this.location = location;
        this.protection = protection;
        this.rating = rating;
        this.research = research;
        this.condition = condition;
        this.response = response;
        this.activity = activity;
        this.development = development;
        this.importance = importance;
    }

    public void display() {
        System.out.println("Organ: " + id + " " + name + " " + function);
    }
}