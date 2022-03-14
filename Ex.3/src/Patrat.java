
public class Patrat {
	
	private double latura;
	private double arie;

	public Patrat(double latura) {
		this.latura = latura;
		this.arie = latura*latura;
	}

	public Patrat() {
		this.latura = 10;
		this.arie = this.latura*this.latura;
	}
	

	@Override
	public String toString() {
		return "Patrat [latura=" + this.latura + ", arie=" + arie + "]";
	}

	
	
	
	

}
