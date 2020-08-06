package MPP;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class AddRobot extends Thread{
	//�мgThread��krun()
	  public void run(){
	    //��1�]��5000
		 try {
			listen();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	  
	  public void listen() throws InterruptedException
	  {

		  int wait = 0;
		  while(true) {
			  
			  //String key;
			  //Scanner tempscanner = new Scanner(System.in);
			  //key= tempscanner.nextLine();
			  System.out.println("StopQueue:"+Main_Dynamic.StopQueue.size());
			  if(Main_Dynamic.StopQueue.size()>0)
			  {  
				  wait++;
				  if(wait==2)
					  {
					  System.out.println("StopQueue------------------------------------");
						  Main_Dynamic.token = false;
						  robot r = Main_Dynamic.StopQueue.poll();
					  if(r.task=true)
					  {
						  Main_Dynamic.robot_change(r.number, 0, r.current_position.getName(),r.start.getName(), Main_Dynamic.t);
						  
						  ArrayList tempRobotList = new ArrayList(); 
						  ArrayList<ArrayList<ArrayList>> tempRobotPathList = new ArrayList<ArrayList<ArrayList>>();
						  for(Object k : Main_Dynamic.robotset.keySet())
							{
								robot r2 = Main_Dynamic.robotset.get(k);
								if(r2.Path.isEmpty()==false) {
									tempRobotList.add(r2);
								}
	
							}
	
						  Main_Dynamic.sortrob(tempRobotList);
						  
						  for(int j=0;j<tempRobotList.size();j++)
							{
								robot r3 = (robot) tempRobotList.get(j);
								tempRobotPathList.add(r3.Path);
							}
	
						  
						  for(int i=1;i<tempRobotList.size();i++)
							{
								NewCollision.collision1(tempRobotPathList,i,tempRobotList);
							}
						  Main_Dynamic.RobotList.removeAll(Main_Dynamic.RobotList);
						  Main_Dynamic.RobotPathList.removeAll(Main_Dynamic.RobotPathList);
						  
	
						  for(int k=0;k<tempRobotList.size();k++)
						  {
							  Main_Dynamic.RobotList.add(tempRobotList.get(k));
						  }
						  for(int k=0;k<tempRobotPathList.size();k++)
						  {
							  Main_Dynamic.RobotPathList.add(tempRobotPathList.get(k));
						  }
						  
						  //Main_Dynamic.show_path(Main_Dynamic.RobotPathList);
						  Main_Dynamic.show_path(Main_Dynamic.RobotPathList);
						  Main_Dynamic.ReadyQueue.offer(r);
						  r.task = false;
						  Main_Dynamic.token = true;
					  }else
					  {
						  Main_Dynamic.robot_change(r.number, 0, r.current_position.getName(),Main_Dynamic.randomdest(), Main_Dynamic.t);
						  ArrayList tempRobotList = new ArrayList(); 
						  ArrayList<ArrayList<ArrayList>> tempRobotPathList = new ArrayList<ArrayList<ArrayList>>();
						  for(Object k : Main_Dynamic.robotset.keySet())
							{
								robot r2 = Main_Dynamic.robotset.get(k);
								if(r2.Path.isEmpty()==false) {
									tempRobotList.add(r2);
								}
	
							}
	
						  Main_Dynamic.sortrob(tempRobotList);
						  
						  for(int j=0;j<tempRobotList.size();j++)
							{
								robot r3 = (robot) tempRobotList.get(j);
								tempRobotPathList.add(r3.Path);
							}
	
						  
						  for(int i=1;i<tempRobotList.size();i++)
							{
								NewCollision.collision1(tempRobotPathList,i,tempRobotList);
							}
						  Main_Dynamic.RobotList.removeAll(Main_Dynamic.RobotList);
						  Main_Dynamic.RobotPathList.removeAll(Main_Dynamic.RobotPathList);
						  
	
						  for(int k=0;k<tempRobotList.size();k++)
						  {
							  Main_Dynamic.RobotList.add(tempRobotList.get(k));
						  }
						  for(int k=0;k<tempRobotPathList.size();k++)
						  {
							  Main_Dynamic.RobotPathList.add(tempRobotPathList.get(k));
						  }
						  
						  //Main_Dynamic.show_path(Main_Dynamic.RobotPathList);
						  Main_Dynamic.show_path(Main_Dynamic.RobotPathList);
						  Main_Dynamic.ReadyQueue.offer(r);
						  r.task = true;
						  Main_Dynamic.token = true;
					  }
					  wait = 0;
				  }
				  
			  }
//			  if(key.equals("i")) {
//				  if(Main_Dynamic.StopQueue.size()==0)
//				  {
//					  System.out.println("Pls wait for robot");
//				  }else {
//					  Main_Dynamic.token = false;
//					  System.out.println("Please input the (int)weight,(String)Destination of robot");
//					  
//					  robot r = Main_Dynamic.StopQueue.poll();
//					  
//					  int temp_weight;
//					  //String temp_source;
//					  String temp_dest;
//					  
//					  Scanner tempscanner1 = new Scanner(System.in);
//					  temp_weight = tempscanner.nextInt();
////					  Scanner tempscanner2 = new Scanner(System.in);
////					  tempscanner2 = new Scanner(System.in);
////					  temp_source = tempscanner2.nextLine();
//					  Scanner tempscanner3 = new Scanner(System.in);
//					  temp_dest = tempscanner3.nextLine();
//					  
//					  Main_Dynamic.robot_change(r.number, temp_weight, r.current_position.getName(), temp_dest, Main_Dynamic.t);
//					  
//					  
//					  
//					  ArrayList tempRobotList = new ArrayList(); 
//					  ArrayList<ArrayList<ArrayList>> tempRobotPathList = new ArrayList<ArrayList<ArrayList>>();
//					  for(Object k : Main_Dynamic.robotset.keySet())
//						{
//							robot r2 = Main_Dynamic.robotset.get(k);
//							if(r2.Path.isEmpty()==false) {
//								tempRobotList.add(r2);
//							}
//
//						}
//
//					  Main_Dynamic.sortrob(tempRobotList);
//					  
//					  for(int j=0;j<tempRobotList.size();j++)
//						{
//							robot r3 = (robot) tempRobotList.get(j);
//							tempRobotPathList.add(r3.Path);
//						}
//
//					  
//					  for(int i=1;i<tempRobotList.size();i++)
//						{
//							NewCollision.collision1(tempRobotPathList,i,tempRobotList);
//						}
//					  Main_Dynamic.RobotList.removeAll(Main_Dynamic.RobotList);
//					  Main_Dynamic.RobotPathList.removeAll(Main_Dynamic.RobotPathList);
//					  
//
//					  for(int k=0;k<tempRobotList.size();k++)
//					  {
//						  Main_Dynamic.RobotList.add(tempRobotList.get(k));
//					  }
//					  for(int k=0;k<tempRobotPathList.size();k++)
//					  {
//						  Main_Dynamic.RobotPathList.add(tempRobotPathList.get(k));
//					  }
//					  
//					  //Main_Dynamic.show_path(Main_Dynamic.RobotPathList);
//					  Main_Dynamic.show_path(Main_Dynamic.RobotPathList);
//					  Main_Dynamic.ReadyQueue.offer(r);
//					  Main_Dynamic.token = true;
//					  
//				  }
//			  }
			  
			  TimeUnit.SECONDS.sleep((long) 3);
			  }
	  }
}
