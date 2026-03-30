class TelevisionExecutor {

    public static void main(String[] args) {

        Television tv = new Television();

        tv.addChannel("Star Plus");
        tv.addChannel("Zee TV");
        tv.addChannel("Colors");

        System.out.println("All Channels:");
        tv.getAllChannels();

        System.out.println("-----------");

        tv.updateChannel("Zee TV", "Sony TV");

        System.out.println("After Update:");
        tv.getAllChannels();

        System.out.println("-----------");

        tv.deleteChannel("Star Plus");

        System.out.println("After Delete:");
        tv.getAllChannels();
    }
}