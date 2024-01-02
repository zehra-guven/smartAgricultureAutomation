package AKILLI_TARIM_OTOMASYONU1;

import java.util.LinkedList;

public class MARMARA {
	private LinkedList linkedList=new LinkedList();
	public void elemanekle(Object eleman)
	{
		linkedList.add(eleman);
	}
	public Object geleneleman()
	{
		return linkedList.getFirst();
	}
	public boolean stackisempyt()
	{
		return linkedList.isEmpty();
	}

	public Object stacktensil() {
		return linkedList.removeFirst();
	}
}
