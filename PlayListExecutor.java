class PlayListExecutor {

    public static void main(String[] args) {

        PlayList list = new PlayList();

        list.addSong("Shape of You");
        list.addSong("Believer");
        list.addSong("Kesariya");

        System.out.println("All Songs:");
        list.getAllSongs();

        System.out.println("-----------");

        list.updateSong("Believer", "Perfect");

        System.out.println("After Update:");
        list.getAllSongs();

        System.out.println("-----------");

        list.deleteSong("Shape of You");

        System.out.println("After Delete:");
        list.getAllSongs();
    }
}