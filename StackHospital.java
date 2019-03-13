import java.util.LinkedList;
import java.util.List;

public class StackHospital<PatientType> extends Hospital<PatientType>
{
	private List patientStack;
	
	public StackHospital()
	{
		patientStack = new LinkedList();
	}
	
	@Override
	public void addPatient(PatientType patient) 
	{
		patientStack.add(patient);
	}

	@Override
	public PatientType nextPatient() {
		return (PatientType) patientStack.get(patientStack.size() - 1);
	}

	@Override
	public PatientType treatNextPatient() {
		PatientType temp = (PatientType) patientStack.get(patientStack.size() - 1);
		patientStack.remove(patientStack.size() - 1);
		return temp;
	}

	@Override
	public int numPatients() {
		return patientStack.size();
	}

	@Override
	public String hospitalType() {
		return "StackHospital";
	}

	@Override
	public String allPatientInfo() {
		StringBuilder string = new StringBuilder();
		int count = 0;
		while (count < patientStack.size())
		{
			string.append(patientStack.get(count).toString());
		}
		
		return string.toString();
	}

}
