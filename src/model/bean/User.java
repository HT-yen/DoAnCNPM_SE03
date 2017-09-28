package model.bean;

public class User {
	private int idUser;
	private String username;
	private String password;
	private String fullname;
	private String email;
	private int active;
	
	
	public User() {
		super();
	}


	public User(int idUser, String username, String password, String fullname,
			String email, int active) {
		super();
		this.idUser = idUser;
		this.username = username;
		this.password = password;
		this.fullname = fullname;
		this.email = email;
		this.active = active;
	}


	public int getIdUser() {
		return idUser;
	}


	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getFullname() {
		return fullname;
	}


	public void setFullname(String fullname) {
		this.fullname = fullname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getActive() {
		return active;
	}


	public void setActive(int active) {
		this.active = active;
	}


	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", username=" + username
				+ ", password=" + password + ", fullname=" + fullname
				+ ", email=" + email + ", active=" + active + "]";
	}
	
	
	
}
