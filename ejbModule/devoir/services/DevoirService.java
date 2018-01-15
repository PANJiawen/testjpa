package devoir.services;

import java.util.Collection;

import javax.ejb.Local;

import devoir.entitys.Activity;
import devoir.entitys.Person;

@Local
public interface DevoirService {
	
	//Chercher une liste des personnes
	Collection<Person> findAllPersons();
	//Chercher les profis d'une personne
	Person findPerson(long personId);
	//Chercher une liste d'activités d'une personne
	Collection<Activity> findAllActivities(long userid);
	
	
	//Suprimer une personne dans la liste
	void deletePerson(long personID);
	//Suprimer une activité d'une personne
	void deleteActivity (long personID,long activityID);
	
	
	//Modifier les profie d'une personne
	void modifierPerson(Person p);
	//Modifier les activités d'une personne
	void modifierActivity(Activity a);
	
	
	//Ajouter une personne dans la liste
	void addPerson(Person p);
	//Ajouter une activiré d'une personne
	void addActivity(Activity a);
	void createPerson();

}