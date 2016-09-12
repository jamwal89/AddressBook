
public class AddressMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddressBook ad = new AddressBook();
		ad.setName("Neha Jamwal");
		ad.setPhone("(217)904-5983");
		ad.setEmail("nehagmail.com");
		ad.setgetAddress("Snapdragon Circle");
		ad.setState("MD");
		ad.setZipcode(20878);
		System.out.println(ad.getName() + "\n"+ad.getPhone()+"\n"+ad.getEmail()+"\n" + ad.getAddress()+"\n"+ad.getState()+"\n"+ad.getZipcode());
		
		
	}

}
