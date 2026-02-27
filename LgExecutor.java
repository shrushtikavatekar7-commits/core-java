class LgExecutor {

    public static void main(String[] args) {

        boolean isCreated = Lg.createRefrigerator(
                "LG",
                "GL-T292RPZX",
                32000,
                260,
                "Double Door",
                1,
                "Silver",
                true,
                2,
                55.5
        );

        if (isCreated) {
            Lg.getRefrigeratorDetails();
        }
    }
}