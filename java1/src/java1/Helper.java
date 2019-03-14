package java1;

import java.util.LinkedList;

import java.util.*;

public class Helper {

	void print(LinkedList<missedCall> queue)
	{
		Iterator<missedCall> itr =queue.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
	
}
