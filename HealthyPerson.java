
public class HealthyPerson extends Person
{
	private String reason;
	
	public HealthyPerson(String name, int age, String reason)
	{
		super(name,age);
		this.reason = reason;
	}

	@Override
	protected int compareToImpl(Person p) 
	{
		
		if (this.getClass() == p.getClass())
		{
			HealthyPerson comfirmedHealthy = (HealthyPerson) p;
			if (this.reason.compareToIgnoreCase(comfirmedHealthy.reason) < 0)
			{
				return -1;
			} else if (this.reason.compareToIgnoreCase(comfirmedHealthy.reason) > 0)
			{
				return 1;
			}
		}
		return 0;
	}
	
	@Override
	public String toString()
	{
		return String.format("%s, a %d-year old In for %f", this.getName(), this.getAge(), this.reason);
	}

}
