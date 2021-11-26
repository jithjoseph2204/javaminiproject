
public class member{
	
	private String Fullname,aadhaar,phone,vaccine,dose;

	
	public member() {
		super();
	}

	public member(String name, String aadhaar, String phone, String vaccine, String dose) {
		super();
		this.Fullname = name;
		this.aadhaar = aadhaar;
		this.phone = phone;
		this.vaccine = vaccine;
		this.dose = dose;
	}

	public String getName() {
		return Fullname;
	}

	public void setName(String name) {
		this.Fullname = name;
	}

	public String getAadhaar() {
		return aadhaar;
	}

	public void setAadhaar(String aadhaar) {
		this.aadhaar = aadhaar;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getVaccine() {
		return vaccine;
	}

	public void setVaccine(String vaccine) {
		this.vaccine = vaccine;
	}

	public String getDose() {
		return dose;
	}

	public void setDose(String dose) {
		this.dose = dose;
	}
	
}

	