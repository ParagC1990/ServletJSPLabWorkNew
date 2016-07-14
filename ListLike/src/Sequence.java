import java.util.Iterator;

public class Sequence implements Iterable<String>{
	private String[] array;
	private int items;
	private int count;
	public Sequence(){
		this.count = 2;
		items = 0;
		this.array = new String[10];
	}
	public Sequence(int count) {
		super();
		this.count = count;
		items = 0;
		this.array = new String[count];
	}
	
	public void add(Object o)
	{
		
			try {if(items == count)
				throw new ListFullException("The list is full");
			
			else {
				array[items++] = (String)o;
				
				}
			} catch (ListFullException e) {
				
				e.printStackTrace();
			}
		
	}
	
	public Object get(int idx){
		if(idx < items)
			return array[idx];
		else
			return null;
	}
	
	
	public int size(){
		return items;
	}
	@Override
	public Iterator<String> iterator() {
		
		return new SequenceIterator();
	}
	
	public class SequenceIterator implements Iterator<String>{
		private int progress = 0;
		@Override
		public boolean hasNext() {
			if(progress < items)
				return true;
			return false;
		}

		@Override
		public String next() {
			return array[progress++];
			
		}
		
	}
}
