package ObjectClass;

public class Passenger{

	private int id;
	private String firstname;
	private String lastname;


	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getFirstName(){
		return firstname;
	}
	public void setFirstName(String firstname){
		this.firstname = firstname;
	}

	public String getLastName(){
		return lastname;
	}
	public void setLastName(String lastname){
		this.lastname = lastname;
	}

	@Override
	public String toString(){
		return "Passenger Information is First Name : "+this.firstname+" Last Name : "+this.lastname;
	}

	@Override
	public int hashCode(){
		return id;
	}
}