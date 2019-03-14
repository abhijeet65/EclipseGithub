package java1;

public class missedCall {
	
	int time;
	String origin;
	String callername;
	int callnumber;
	
	missedCall(int time,String o,String n,int num )
	{
		this.time=time;
		this.origin=o;
		this.callername=n;
		this.callnumber=num;
		
	}
	missedCall(int time,String o,int num )
	{
		this.time=time;
		this.origin=o;
		this.callnumber=num;
	}
	
	public String toString()
	{
		return "missed call from "+callername+" at "+time+" origin "+origin+" number="+callnumber;
	}
}
