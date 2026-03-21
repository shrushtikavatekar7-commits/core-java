class BrainExecutor {
    public static void main(String[] args) {

        Brain b1 = new Brain(1,"Cerebrum","Thinking","Grey",1.4,
                "Human","Healthy","None","Strong",
                "Body","Nervous","Electric","Skull",
                "Complex",4.8,"AI","Normal","Fast","High","Full");

        Brain b2 = new Brain(2,"Cerebellum","Balance","Grey",1.2,
                "Human","Good","None","Moderate",
                "Movement","Nervous","Signals","Skull",
                "Simple",4.5,"Study","Normal","Quick","Medium","Growth");

        b1.display();
        b2.display();
    }
}