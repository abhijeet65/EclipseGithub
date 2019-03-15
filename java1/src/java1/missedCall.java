package java1;

import java.util.Date;

public class missedCall {
	
	Date time;
	String origin;
	String callername;
	int callnumber;
	
	missedCall(Date time,String o,String n,int num )
	{
		this.time=time;
		this.origin=o;
		this.callername=n;
		this.callnumber=num;
		
	}
	missedCall(Date time,String o,int num )
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
