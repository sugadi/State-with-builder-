
public abstract class IceBuilder {
	

	
	String icename;
	
	Icetypes iceTypes;

	public String getIcename() {
		return icename;
	}

	public void setIcename(String icename) {
		this.icename = icename;
	}

	public Icetypes getIceTypes() {
		return iceTypes;
	}

	public void setIceTypes(Icetypes iceTypes) {
		this.iceTypes = iceTypes;
	}
	

	public abstract void iceTrayShape();
	
	public abstract void freeze();


}
