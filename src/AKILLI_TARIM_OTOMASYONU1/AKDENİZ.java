package AKILLI_TARIM_OTOMASYONU1;

import java.util.LinkedList;

public class AKDENİZ {
	private LinkedList list=new LinkedList();
	public void elemankaydet(Object eleman) {
		list.add(eleman);
	}
	public Object elemansil()
	{
		return list.removeFirst();
	}
	public Object elemangetir()
	{
		return list.getFirst();
	}
	public boolean isempty()
	{
		return list.isEmpty();
	}
}
