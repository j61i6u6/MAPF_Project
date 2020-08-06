package MPP;

import java.util.ArrayList;

public class robot {
	public int number;
	public int weight;
	public int start_time;
	public Node start;
	public Node destination;
	public Node current_position;
	public boolean work = false;
	public boolean task = false;
	public ArrayList<ArrayList> Path = new ArrayList<ArrayList>();
	//public int route[][]= new int[20][2];
	robot()
	{}
	robot(int w,Node s,Node d)
	{	
		weight = w;
		start = s;
		destination = d;
	}
	public void move() {
		if(Path.isEmpty()) {
			//work = false;
		}else {
			current_position = (Node)Path.get(0).get(0);
			Path.remove(Path.get(0));
		}
	}
	
}