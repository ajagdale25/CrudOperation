package TreeSetDemo;

public class TressSetTest implements Comparable<TressSetTest> {
	int id;
	String name;
	public TressSetTest(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	public int compareTo(TressSetTest st) {
		if(id== st.id)
		{
		return 0;
		}
		else if(id > st.id)
		{
		return 1;
		}
		else
		{
			return -1;
		}
	}






	

}
