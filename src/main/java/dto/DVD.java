package dto;

public class DVD {
	private int id;
	private String name;
	private String directed_by;
	private int number;
	private boolean rantal;
	
	public DVD(int id, String name, String directed_by, int number, boolean rantal) {
		super();
		this.id = id;
		this.name = name;
		this.directed_by = directed_by;
		this.number = number;
		this.rantal = rantal;
	}
	
	public DVD(int id, String name, String directed_by, int number) {
		super();
		this.id = id;
		this.name = name;
		this.directed_by = directed_by;
		this.number = number;
	}
	
	public DVD(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	public boolean isRantal() {
		return rantal;
	}

	public void setRantal(boolean rantal) {
		this.rantal = rantal;
	}
}
