class PlayStore {

    int id;
    String name;
    Application application;  
	
    public PlayStore(int id, String name, Application application) {
        this.id = id;
        this.name = name;
        this.application = application;
    }

    public void display() {
        System.out.println("PlayStore: " + id + " " + name);
        application.display();
        System.out.println("-------------------");
    }
}