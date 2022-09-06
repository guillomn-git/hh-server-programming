package fi.haagahelia.excercise.domain;

public class Friend {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		this.name = newName;
	}

	@Override
	public String toString() {
		return getName();
	}
}