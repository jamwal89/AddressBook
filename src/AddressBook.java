import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddressBook {
	private String name, address, city, state, email, phone; 
	private int zip;
	
	public  AddressBook(){
		System.out.println("This is the AddressBook");
	}
	
	
	public String getName(){
		return name;
	}
	
	public void setName(String name) {
		this.name= name;
		
	}
	
	
	
	public String getAddress() {
		return address;
	}
	
	public void setgetAddress(String address) {
		this.address=address;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail( String email) {
		if (isEmailValid(email)) {

			this.email=email;
		}

		else {
			this.email = "Invalid";
		}
		
	}
	
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		if (isPhoneNumberValid(phone)) {
			this.phone=phone;
		}
		else {
			this.phone="Invalid";
		}
	}
	
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state= state;
	}
	
	public int getZipcode() {
		return zip;
	}
	
	public void setZipcode(int zip) {
		this.zip= zip;
	}
	
	private boolean isEmailValid(String email){  
        boolean isValid = false;  

        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";  
        CharSequence inputStr = email;  
        //Make the comparison case-insensitive.  
        Pattern pattern = Pattern.compile(expression,Pattern.CASE_INSENSITIVE);  
        Matcher matcher = pattern.matcher(inputStr);  
        if(matcher.matches()){  
            isValid = true;  
        }  
        return isValid;  
    } 
    
    private boolean isPhoneNumberValid(String phoneNumber){  
        boolean isValid = false;  

        String expression = "^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$";  
        CharSequence inputStr = phoneNumber;  
        Pattern pattern = Pattern.compile(expression);  
        Matcher matcher = pattern.matcher(inputStr);  
        if(matcher.matches()){  
            isValid = true;  
        }  
        return isValid;  
    }  
	

}
