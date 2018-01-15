package devoir.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.ejb.Stateful;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import devoir.entitys.Activity;
import devoir.entitys.Person;
import monpkg.entities.Counter;


@Stateful
@TransactionManagement(TransactionManagementType.CONTAINER)
public class Services  {
	
    @PersistenceContext(unitName = "myMySQLBase")
    EntityManager em;
	
	
	public Collection<Person> findAllPersons() {
	
//		Collection<Person> persons = new ArrayList<Person>();
//		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
//		

		
		
		return null;
	}

	
	public Person findPerson(long personId) {

		return null;
	}

	
	public Collection<Activity> findAllActivities(long personid) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void deletePerson(long personID) {
		// TODO Auto-generated method stub
		
	}

	
	public void deleteActivity(long personID, long activityID) {
		// TODO Auto-generated method stub
		
	}

	
	public void modifierPerson(Person p) {
		// TODO Auto-generated method stub
		
	}

	
	public void modifierActivity(Activity a) {
		// TODO Auto-generated method stub
		
	}

	
	public void addPerson(Person p) {
		// TODO Auto-generated method stub
		
	}

	
	public void addActivity(Activity a) {
		// TODO Auto-generated method stub
		
	}
	
    public void removeActivity(Integer ida) {
    	Activity at = em.find(Activity.class, ida);
        if (at != null) {
            em.remove(at);
        }
    }
	
	public void createActivity(String nature, Integer ida) {
		removeActivity(ida);
		Activity at = new Activity();
		at.setIda(ida);
		at.setNature(nature);
		Query query = em.
				  createQuery("Select * from Activity at");
				  List<String> list2 = query.getResultList();
				  System.out.println(list2);
		
		em.persist(at);

	}

}
