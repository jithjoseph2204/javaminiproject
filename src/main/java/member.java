
public class member{
	
	private String aadhaar,fullname,phone,vaccine,dose,vaccinedate;

	
	public member() {
		super();
	}

	public member(String fullname, String aadhaar, String phone, String vaccine, String dose , String vaccinedate) {
		super();
		this.aadhaar = aadhaar;
		this.fullname = fullname;
		this.phone = phone;
		this.vaccine = vaccine;
		this.dose = dose;
	    this.vaccinedate=vaccinedate;
	}

	public String getName() {
		return fullname;
	}

	public void setName(String fullname) {
		this.fullname = fullname;
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

	public String getVaccinedate() {
		return vaccinedate;
	}

	public void setVaccinedate(String vaccinedate) {
		this.vaccinedate = vaccinedate;
	}
	
	
	
}

	