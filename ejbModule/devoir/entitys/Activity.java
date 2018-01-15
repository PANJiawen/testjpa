package devoir.entitys;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table(name = "Activity")
public class Activity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
    public Activity() {
        super();
    }
	
    @Id()
    private Integer ida;
    
    @Column(name = "date")
    private Date date;
    
    @Column(name = "nature")
    private String nature;

	public Integer getIda() {
		return ida;
	}

	public void setIda(Integer ida) {
		this.ida = ida;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getNature() {
		return nature;
	}

	public void setNature(String nature) {
		this.nature = nature;
	}
    
    
}
