class Train {

    int trainId;
    String name;
    Boggiy boggiy;   // HAS-A

    public Train(int trainId, String name, Boggiy boggiy) {
        this.trainId = trainId;
        this.name = name;
        this.boggiy = boggiy;
    }

    public void display() {
        System.out.println("Train: " + trainId + " " + name);
        boggiy.display();
        System.out.println("----------------------");
    }
}