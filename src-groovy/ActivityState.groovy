
enum ActivityState {
	
	REQUIRED("Required"), DISCRETIONARY("Discretionary"), NOT_AVAILABLE("N/A")
	
	private String name
	
	private ActivityState(String name) {
		this.name = name
	}
	
	@Override
	public String toString() {
		name
	}
	
}
