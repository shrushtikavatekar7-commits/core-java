class TelevisionExecutor {
	public static void main(String[] args){

		Television tv = new Television();

		tv.addChannelName("Star Plus");
		tv.addChannelName("Zee TV");
		tv.addChannelName("Colors");
		tv.addChannelName("Sony TV");
		tv.addChannelName("Sun TV");
		tv.addChannelName("Star Vijay");
		tv.addChannelName("Zee Kannada");
		tv.addChannelName("Udaya TV");
		tv.addChannelName("ETV Telugu");
		tv.addChannelName("Asianet");
		tv.addChannelName("Discovery Channel");
		tv.addChannelName("National Geographic");
		tv.addChannelName("Cartoon Network");
		tv.addChannelName("Pogo");
		tv.addChannelName("Nick");
		tv.addChannelName("History TV18");
		tv.addChannelName("Animal Planet");

		tv.getChannelNames();
	}
}