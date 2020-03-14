package hibernate.HibernateAnnotations;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int id;
	private String ftName,ltName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFtName() {
		return ftName;
	}
	public void setFtName(String ftName) {
		this.ftName = ftName;
	}
	public String getLtName() {
		return ltName;
	}
	public void setLtName(String ltName) {
		this.ltName = ltName;
	}

}
