package devoir.entitys;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table(name = "Person")
public class Person implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
    @Id()
    private Integer idp;

    @Column(name = "name")
    private String name;

    @Column(name = "fname")
    private String fname;
    
    @Column(name = "adrE")
    private String adrE;
    
    @Column(name = "sitW")
    private String sitW;
    
    @Column(name = "dateN")
    private Date dateN;
    
    
    
    public Person() {
        super();
    }



	public Integer getIdp() {
		return idp;
	}



	public void setIdp(Integer idp) {
		this.idp = idp;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getFname() {
		return fname;
	}



	public void setFname(String fname) {
		this.fname = fname;
	}



	public String getAdrE() {
		return adrE;
	}



	public void setAdrE(String adrE) {
		this.adrE = adrE;
	}



	public String getSitW() {
		return sitW;
	}



	public void setSitW(String sitW) {
		this.sitW = sitW;
	}



	public Date getDateN() {
		return dateN;
	}



	public void setDateN(Date dateN) {
		this.dateN = dateN;
	}


}
