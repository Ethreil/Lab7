import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PriorityQueueHospital<PatientType> extends Hospital<PatientType>
{
	private List patientPriority;

	public PriorityQueueHospital()
	{
		patientPriority = new LinkedList();
		Collections.sort(patientPriority);
	}
	
	@Override
	public void addPatient(PatientType patient) 
	{
		patientPriority.add(patient);
		Collections.sort(patientPriority);
	}

	@Override
	public PatientType nextPatient() {
		return (PatientType) patientPriority.get(0);
	}

	@Override
	public PatientType treatNextPatient() {
		PatientType temp = (PatientType) patientPriority.get(0);
		patientPriority.remove(0);
		Collections.sort(patientPriority);
		return temp;
	}

	@Override
	public int numPatients() {
		return patientPriority.size();
	}

	@Override
	public String hospitalType() {
		return "PriorityQueueHospital";
	}

	@Override
	public String allPatientInfo() {
		StringBuilder string = new StringBuilder();
		int count = 0;
		while (count < patientPriority.size())
		{
			string.append(patientPriority.get(count).toString());
		}
		
		return string.toString();
	}

}