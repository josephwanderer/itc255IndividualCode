
public class Person {
	private int personKey;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	private int userType;

	public Person(int key, String uname, String pword, String fname, String lname, String mail, int utype) {
		personKey = key;
		username = uname;
		password = pword;
		firstName = fname;
		lastName = lname;
		email = mail;
		userType = utype;
	}
	
	public Person() {
		
	}

	/**
	 * @return 1 if valid, 0 if invalid
	 */
	public int validateUser(String email, String password){
		if (this.email.equals(email) && this.password.equals(password)){
			return 1;
		}else{
			return 0;
		}
	}
	
	/**
	 * @return 1 if successful, 0 if unsuccessful
	 */
	private int donate(float amount){
		if (false){
			return 0;
		}
		else{
			return 1;
		}	
	}
	
	/**
	 * @return 1 if successful, 0 if unsuccessful
	 */
	private int requestGrant(int grantType, float amount){
		if (false){
			return 0;
		}
		else{
			return 1;
		}
	}

	/**
	 * @return the personKey
	 */
	public int getPersonKey() {
		return personKey;
	}


	/**
	 * @param personKey the personKey to set
	 */
	public void setPersonKey(int personKey) {
		this.personKey = personKey;
	}


	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}


	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}


	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}


	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}


	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * @return the userType
	 */
	public int getUserType() {
		return userType;
	}


	/**
	 * @param userType the userType to set
	 */
	public void setUserType(int userType) {
		this.userType = userType;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

}
