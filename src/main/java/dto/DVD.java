package dto;

public class DVD {
	int id;
	String name ;
	String directed_by ;
	int number;
	int rental ;
	
	public DVD(int id, String name,String directed_by,int number,int rental) {
		super();
		this.id = id;
		this.name = name;
		this.directed_by = directed_by;
		this.number = number;
		this.rental = rental;
		}
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDirected_by() {
		return directed_by;
	}
	public void setDirected_by(String directed_by) {
		this.directed_by = directed_by;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getRental() {
		return rental;
	}
	public void setRental(int rental) {
		this.rental = rental;
	}
}
