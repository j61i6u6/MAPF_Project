package MPP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.TimeUnit;


import MPP.Node;
import MPP.MapBuilder;
import MPP.draw;


public class Main_Dynamic {
	
	public static int t;
	public static boolean token = true;
	public static Map<Integer,MapBuilder> mapset = new HashMap<Integer,MapBuilder>();
	public static Map<Integer,Graph> mapgraphset = new HashMap<Integer,Graph>();
	public static Map<Integer,robot> robotset = new HashMap<Integer,robot>();
	public static Queue<robot> ReadyQueue = new LinkedList<robot>();
	public static Queue<robot> StopQueue = new LinkedList<robot>();
	public static ArrayList ObstacleList = new ArrayList();
	public static ArrayList RobotList = new ArrayList();
	public static ArrayList<ArrayList<ArrayList>> RobotPathList = new ArrayList<ArrayList<ArrayList>>();
	public static boolean windowCheck = true;

	
	
	public static void main(String[] args) throws InterruptedException
	{
		//initial
		long time1,time2;
		t = 0;
		MapBuilder initial_map = new MapBuilder();
		initial_map.CreateGraph();
		//Obstacle
		
		ObstacleList.add(initial_map.nodeV);ObstacleList.add(initial_map.nodeW);
		ObstacleList.add(initial_map.nodeBB);ObstacleList.add(initial_map.nodeBC);
		ObstacleList.add(initial_map.nodeBG);ObstacleList.add(initial_map.nodeBH);
		ObstacleList.add(initial_map.nodeBL);ObstacleList.add(initial_map.nodeBM);
		ObstacleList.add(initial_map.nodeBQ);ObstacleList.add(initial_map.nodeBR);
		
		ObstacleList.add(initial_map.nodeAU);ObstacleList.add(initial_map.nodeAV);
		ObstacleList.add(initial_map.nodeCA);ObstacleList.add(initial_map.nodeCB);
		ObstacleList.add(initial_map.nodeCF);ObstacleList.add(initial_map.nodeCG);
		ObstacleList.add(initial_map.nodeCK);ObstacleList.add(initial_map.nodeCL);
		ObstacleList.add(initial_map.nodeCP);ObstacleList.add(initial_map.nodeCQ);
		
		ObstacleList.add(initial_map.nodeAX);
		ObstacleList.add(initial_map.nodeCD);
		ObstacleList.add(initial_map.nodeCI);
		ObstacleList.add(initial_map.nodeCN);
		ObstacleList.add(initial_map.nodeCS);
		

		System.out.print("Please input the number of robot");
		int num;
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		System.out.println("Initial robot of"+num+".........");
		
		MPP.draw.Colorset = MPP.draw.initializeColor(num);
		
		for(int i=0;i<num;i++)
		{
			System.out.println("Please input the (int)weight,(String)Source,(String)Destination of robot"+i);
			int temp_weight;
			String temp_source;
			String temp_dest;
			
			
			Scanner tempscanner = new Scanner(System.in);
			temp_weight = tempscanner.nextInt();
			Scanner tempscanner2 = new Scanner(System.in);
			tempscanner2 = new Scanner(System.in);
			temp_source = tempscanner2.nextLine();
			Scanner tempscanner3 = new Scanner(System.in);
			temp_dest = tempscanner3.nextLine();
			
			initialize(i,temp_weight,temp_source,temp_dest,ObstacleList,t);
			
		}
		
		for(Object key : robotset.keySet())
		{
			robot r = robotset.get(key);
			RobotList.add(r);
			
		}
		sortrob(RobotList);
		
		for(int j=0;j<RobotList.size();j++)
		{
			robot r = (robot) RobotList.get(j);
			RobotPathList.add(r.Path);
		}
		
		time1 = System.nanoTime();
		for(int i=1;i<RobotList.size();i++)
		{
			NewCollision.collision1(RobotPathList,i,RobotList);
		}
		time2 = System.nanoTime();
		System.out.println("-------------------------------------------");
		System.out.println("cal Collision-Free Path (ns):"+(time2-time1));
		System.out.println("-------------------------------------------");
		for(int j=0;j<RobotList.size();j++)
		{
			robot r = (robot) RobotList.get(j);
			ReadyQueue.offer(r);
		}
		
		show_path(RobotPathList);
		for(int i=0;i<RobotList.size();i++)
		{
			robot r2 = (robot) RobotList.get(i);
		}
		AddRobot a = new AddRobot();
		a.start();
		
		start(RobotList);
	}

	public static void initialize(int Robot_number,int Robot_weight,String sourcestr,String deststr,ArrayList Obs,int start_time)
	{
		
		MapBuilder temp_map = new MapBuilder();
		
		temp_map.CreateGraph();
		
		
		//Add Obs,Create Map
		ArrayList adj = new ArrayList();
		for(Node x:temp_map.graph.getNodes())
		{
			for(int i=0;i<Obs.size();i++)
			{
				if(((Node) Obs.get(i)).getName()==x.getName())
				{
					adj.add(x);
				}
			}
		}
		for(int k=0;k<adj.size();k++)
		{
			temp_map.AddObstacle((Node) adj.get(k));
		}
		mapset.put(Robot_number,temp_map);
		mapgraphset.put(Robot_number,temp_map.graph);
		
		//Create Robot
		System.out.println(deststr);
		Node temp_SourceNode=null;
		Node temp_DestNode=null;
		
		for(Node x:temp_map.graph.getNodes())
		{
			if(x.getName().equals(sourcestr))
			{
				temp_SourceNode = x;
			}
			else if(x.getName().equals(deststr))
			{
				temp_DestNode = x;
			}
		}
		
		
		robot temp_robot = new robot(Robot_weight,temp_SourceNode,temp_DestNode);
		temp_robot.start_time = start_time;
		robotset.put(Robot_number,temp_robot);
		temp_robot.number = Robot_number;
		
		temp_robot.Path = temp_map.New_getShortestPathToDestination(temp_map.graph,temp_robot.start,temp_robot.destination,temp_robot.start_time);

	}
	
	public static void robot_change(int Robot_number,int Robot_weight,String sourcestr,String deststr,int start_time)
	{
		Node temp_SourceNode=null;
		Node temp_DestNode=null; 
		
		MapBuilder m = mapset.get(Robot_number);
		Graph m_Graph = mapgraphset.get(Robot_number);
		for(Node x:m_Graph.getNodes()) {
			if(x.getName().equals(sourcestr))
			{
				temp_SourceNode = x;
			}
			else if(x.getName().equals(deststr))
			{
				temp_DestNode = x;
			}
		}
		
		robot r = robotset.get(Robot_number);
		r.weight = Robot_weight;
		r.start = temp_SourceNode;
		r.destination = temp_DestNode;
		r.start_time = start_time;
		
		MapBuilder temp_m = new MapBuilder();
		temp_m.CreateGraph();
		robot temp_r = new robot();
		ArrayList adj = new ArrayList();
		for(Node x:temp_m.graph.getNodes())
		{
			for(int i=0;i<ObstacleList.size();i++)
			{
				if(((Node) ObstacleList.get(i)).getName()==x.getName())
				{
					adj.add(x);
				}
			}
		}
		for(int k=0;k<adj.size();k++)
		{
			temp_m.AddObstacle((Node) adj.get(k));
		}
		Node temp_SourceNode2 = null;
		Node temp_DestNode2 = null;
		for(Node x:temp_m.graph.getNodes()) {
			if(x.getName().equals(sourcestr))
			{
				temp_SourceNode2 = x;
			}
			else if(x.getName().equals(deststr))
			{
				temp_DestNode2 = x;
			}
		}
		temp_r.start = temp_SourceNode2;
		temp_r.destination = temp_DestNode2;
		temp_r.Path = temp_m.New_getShortestPathToDestination(temp_m.graph,temp_r.start, temp_r.destination,start_time);
		
		r.Path = temp_r.Path;
	}
	
	public static void show_path(robot r)
	{
		for(int i = 0;i<r.Path.size();i++)
		{
			Node a = (Node) r.Path.get(i).get(0);
			System.out.print(a.getName());
		}
		System.out.println();
	}
	
	public static void sortrob(ArrayList<robot> robotlist)
	{ 
		boolean time = true;
		while(time) {
			time = false;
		for(int i = 1;i<robotlist.size();i++) {
			robot rob1 = (robot) robotlist.get((i-1));
			robot rob2 = (robot) robotlist.get((i));
			
			if(rob1.start_time>rob2.start_time) {
				 Collections.swap(robotlist, i, i-1);
				 time = true;
			}
			if(rob1.start_time == rob2.start_time) {
				if(rob1.weight>rob2.weight) {
				Collections.swap(robotlist, i, i-1);
				time = true;
				 
			}
				 
			}
		}
		}
	}
	
	public static void show_path(ArrayList<ArrayList<ArrayList>> Robot_Path)
	{
		int detect_start_time = 9999;
		int detect_end_time = 0;
		Node nodenull = new Node("null",Integer.MAX_VALUE,Integer.MAX_VALUE);
		
		
		for(int i=0;i<Robot_Path.size();i++)
		{
			if((int)Robot_Path.get(i).get(0).get(1)< detect_start_time)
			{
				detect_start_time = (int)Robot_Path.get(i).get(0).get(1);
			}
			
			if((int)Robot_Path.get(i).get(Robot_Path.get(i).size()-1).get(1) > detect_end_time)
			{
				detect_end_time = (int)Robot_Path.get(i).get(Robot_Path.get(i).size()-1).get(1);
			}
		}
		
		Node[][] checkarr = new Node[Robot_Path.size()][detect_end_time+1];
		//initialize
		for(int i=0;i<Robot_Path.size();i++)
		{
			for(int j=0;j<detect_end_time+1;j++)
			{
				checkarr[i][j] = nodenull;
				checkarr[i][j] = nodenull;
			}
		}
		
		for(int i=0;i<Robot_Path.size();i++)
		{
			for(int j=0;j<Robot_Path.get(i).size();j++)
			{
				int t = (int)Robot_Path.get(i).get(j).get(1);
				checkarr[i][t] = (Node)Robot_Path.get(i).get(j).get(0);
			}
		}
		
		System.out.print("  \t"); 
		for(int i=0;i<Robot_Path.size();i++)
		{
			System.out.print("R"+ i);
			System.out.print("\t");

		}
		
		for(int j=0;j<detect_end_time+1;j++)
		{
			System.out.println();
			System.out.print("t"+j);
			System.out.print("\t");
			for(int i=0;i<Robot_Path.size();i++)
			{
				if(checkarr[i][j] == nodenull)
				{
					System.out.print(" ");
				}else 
				{
					System.out.print(checkarr[i][j].getName());
				}
				System.out.print("\t");
			}
		}
		
		System.out.println();
	}

	
	public static void start(ArrayList RobotList) throws InterruptedException
	{
		
		while(true) {
			if(token) {
				System.out.println("Time:"+t);
				if(ReadyQueue.isEmpty()==false)
				{
					int Queuesize = ReadyQueue.size();
					for(int i=0;i<Queuesize;i++)
					{
						if(t-ReadyQueue.peek().start_time>=0)
						{
							robot r2 = ReadyQueue.poll();
							System.out.println("Robot: "+ r2.number + "poll from ready Queue");
							r2.work = true;
						}
						
					}
				}
				
				ArrayList WorkRobot = new ArrayList();
				for(int i=0;i<RobotList.size();i++) {
					robot r =(robot)RobotList.get(i);
					if(r.work) {
						r.move();
						WorkRobot.add(r);
						System.out.println("Robot "+r.number);
						System.out.println(r.current_position.getName());
						if(r.Path.isEmpty())
						{
							RobotPathList.removeAll(r.Path);
							r.work = false;
							StopQueue.offer(r);
							System.out.println("Robot"+ i +" offer to Stop Queue");
						}
					}
				}
				windowCheck = false;
				MPP.draw.draw(ObstacleList,WorkRobot);
				WorkRobot.removeAll(WorkRobot);
				System.out.println();
				t = t+1;
				TimeUnit.SECONDS.sleep((long) 3);
			}else {
				TimeUnit.SECONDS.sleep((long) 3);
			}
			
		}
		
	}
}

