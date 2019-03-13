
public class SickPerson extends Person
{
	private int severity;
	
	public SickPerson(String name, int age, int severity)
	{
		super(name,age);
		this.severity = severity;
	}
	
	@Override
	protected int compareToImpl(Person p) {
		
		if (this.getClass() == p.getClass())
		{	
			SickPerson confirmedSick = (SickPerson) p;
			if(this.severity > confirmedSick.severity)
			{
				return -1;
			} else if (this.severity < confirmedSick.severity)
			{
				return 1;
			}
		}
		return 0;
	}

	@Override
	public String toString()
	{
		return String.format("%s, a %d-year old Severity level %f", this.getName(), this.getAge(), this.severity);
	}
	
}
