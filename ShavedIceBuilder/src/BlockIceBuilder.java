
public class BlockIceBuilder extends IceBuilder {

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

	@Override
	public void iceTrayShape() {
		System.out.println("use tarys block ice type   ");

	}

	@Override
	public void freeze() {
		System.out.println("freeze some time  ");

	}

}
