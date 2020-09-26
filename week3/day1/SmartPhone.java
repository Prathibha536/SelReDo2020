package week3.day1;

public class SmartPhone extends Android{
	
	public void connectWhatsapp()
	{
		System.out.println("Connected to whatsapp");
	}
	
	public void takeVideo()
	{
		System.out.println("Take video in Smart phone");
	}

	public static void main(String[] args) {
		
		SmartPhone sp = new SmartPhone();
		
		sp.connectWhatsapp();
		
		sp.makeCall();
		
		sp.takeVideo();
		
		sp.saveContacts();
		
		sp.sndMsg();

	}

}
