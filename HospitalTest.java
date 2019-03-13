import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class HospitalTest {

	@Test
	void test() {
    	StackHospital<Animal> animalStack = new StackHospital<Animal>();
    	QueueHospital<Animal> animalQueue = new QueueHospital<Animal>();
    	PriorityQueueHospital<Animal> animalPQueue = new PriorityQueueHospital<Animal>();
    	
    	animalStack.addPatient(new Animal("monkey",50));
    	animalQueue.addPatient(new Animal("monkeyZ",51));
    	animalPQueue.addPatient(new Animal("monkeyX",52));

    	StackHospital<Person> personStack = new StackHospital<Person>();
    	QueueHospital<Person> personQueue = new QueueHospital<Person>();
    	PriorityQueueHospital<Person> personPQueue = new PriorityQueueHospital<Person>();
    	
    	personQueue.addPatient(new HealthyPerson("john",51, "stomachache"));
    	personPQueue.addPatient(new SickPerson("johnny",52, 8));
    	
    	

    	// Aggregate structures:
    	ArrayList<Hospital<Animal>> animalHospitals = new ArrayList<Hospital<Animal>>();
    	ArrayList<Hospital<Person>> personHospitals = new ArrayList<Hospital<Person>>();

    	
    	animalHospitals.add(animalStack);
    	animalHospitals.add(animalQueue);
    	animalHospitals.add(animalPQueue);
    	String[] ahNames = {"AStack", "AQueue", "APQueue"};

    	personHospitals.add(personStack);
    	personHospitals.add(personQueue);
    	personHospitals.add(personPQueue);
    	String[] phNames = {"PStack", "PQueue", "PPQueue"}; 
    	
		Assert.assertEquals(animalStack, animalHospitals.get(0));
		Assert.assertEquals(animalQueue, animalHospitals.get(1));
		Assert.assertEquals(animalPQueue, animalHospitals.get(2));
		
		Assert.assertEquals(personStack, personHospitals.get(1));
		Assert.assertEquals(personQueue, personHospitals.get(1));
		Assert.assertEquals(personPQueue, personHospitals.get(1));
	}

}
