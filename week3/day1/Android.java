package week3.day1;

public class Android extends Mobile {
	
	
	public void takeVideo()
	{
		System.out.println("Take video in Android");
	}

	public static void main(String[] args) {
		
		Android ad = new Android();
		
		ad.takeVideo();
		
		ad.sndMsg();
		
		ad.makeCall();
		
		ad.saveContacts();
		

	}

}
