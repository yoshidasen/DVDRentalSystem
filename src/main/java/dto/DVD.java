package dto;

public class DVD {
	private int id;
	private String name;
	private String directed_by;
	private String number;
	private Boolean rental;
	
	public DVD(int id, String name, String directed_by, String number, Boolean rental) {
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

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Boolean getRental() {
		return rental;
	}

	public void setRental(Boolean rental) {
		this.rental = rental;
	}
}
