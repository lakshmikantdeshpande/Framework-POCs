package sachin.lakshmikant;

public class Triangle {

	private String type;
	private int height;

	public Triangle(String type) {
		this.type = type;
	}
	
	public Triangle(String type, int height) {
		this.type = type;
		this.height = height;
	}


	// setter injection
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void draw() {
		System.out.println(getType() + " triangle drawn of height " + getHeight());
	}

}
