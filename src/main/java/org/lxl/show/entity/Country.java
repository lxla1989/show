package org.lxl.show.entity;

public class Country {
	private int id;
	private String countryname;
	private String countrycode;

	public Country(int id, String countryname, String countrycode) {
		super();
		this.id = id;
		this.countryname = countryname;
		this.countrycode = countrycode;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCountryname() {
		return countryname;
	}
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	public String getCountrycode() {
		return countrycode;
	}
	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", countryname=" + countryname + ", countrycode=" + countrycode + "]";
	}
}
