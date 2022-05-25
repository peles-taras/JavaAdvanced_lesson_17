package ua.lviv.lgs.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class University {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;

	@Column
	String name;

	@Column
	String accreditationLevel;

	@Column
	Integer institutesQuantity;

	@Column
	Integer studentsQuantity;

	@Column
	String adress;

	public University(Integer id, String name, String accreditationLevel, Integer institutesQuantity,
			Integer studentsQuantity, String adress) {
		super();
		this.id = id;
		this.name = name;
		this.accreditationLevel = accreditationLevel;
		this.institutesQuantity = institutesQuantity;
		this.studentsQuantity = studentsQuantity;
		this.adress = adress;
	}

	public University(String name, String accreditationLevel, Integer institutesQuantity, Integer studentsQuantity,
			String adress) {
		this.name = name;
		this.accreditationLevel = accreditationLevel;
		this.institutesQuantity = institutesQuantity;
		this.studentsQuantity = studentsQuantity;
		this.adress = adress;
	}

	public University() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccreditationLevel() {
		return accreditationLevel;
	}

	public void setAccreditationLevel(String accreditationLevel) {
		this.accreditationLevel = accreditationLevel;
	}

	public int getInstitutesQuantity() {
		return institutesQuantity;
	}

	public void setInstitutesQuantity(Integer institutesQuantity) {
		this.institutesQuantity = institutesQuantity;
	}

	public int getStudentsQuantity() {
		return studentsQuantity;
	}

	public void setStudentsQuantity(Integer studentsQuantity) {
		this.studentsQuantity = studentsQuantity;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "University [id=" + id + ", name=" + name + ", accreditationLevel=" + accreditationLevel
				+ ", institutesQuantity=" + institutesQuantity + ", studentsQuantity=" + studentsQuantity + ", adress="
				+ adress + "]";
	}

}
