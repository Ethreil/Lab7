import java.util.LinkedList;
import java.util.List;

public class QueueHospital<PatientType> extends Hospital<PatientType>
{
	private List patientQueue;

	public QueueHospital()
	{
		patientQueue = new LinkedList();
	}
	
	@Override
	public void addPatient(PatientType patient) 
	{
		patientQueue.add(patient);
	}

	@Override
	public PatientType nextPatient() {
		return (PatientType) patientQueue.get(0);
	}

	@Override
	public PatientType treatNextPatient() {
		PatientType temp = (PatientType) patientQueue.get(0);
		patientQueue.remove(0);
		return temp;
	}

	@Override
	public int numPatients() {
		return patientQueue.size();
	}

	@Override
	public String hospitalType() {
		return "QueueHospital";
	}

	@Override
	public String allPatientInfo() {
		StringBuilder string = new StringBuilder();
		int count = 0;
		while (count < patientQueue.size())
		{
			string.append(patientQueue.get(count).toString());
		}
		
		return string.toString();
	}

}
