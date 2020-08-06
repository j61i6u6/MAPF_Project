package MPP;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class AddRobot extends Thread{
	
	  public void run(){
		 listen();
	  }
	  
	  public void listen()
	  {
		  while(true) {
			 
			  String key;
			  Scanner tempscanner = new Scanner(System.in);
			  key= tempscanner.nextLine();
			  if(key.equals("i")) {
				  if(Main_Dynamic.StopQueue.size()==0)
				  {
					  System.out.println("Pls wait for robot");
				  }else {
					  Main_Dynamic.token = false;
					  System.out.println("Please input the (int)weight,(String)Destination of robot");
					  
					  robot r = Main_Dynamic.StopQueue.poll();
					  
					  int temp_weight;

					  String temp_dest;
					  
					  Scanner tempscanner1 = new Scanner(System.in);
					  temp_weight = tempscanner.nextInt();
					  Scanner tempscanner3 = new Scanner(System.in);
					  temp_dest = tempscanner3.nextLine();
					  
					  Main_Dynamic.robot_change(r.number, temp_weight, r.current_position.getName(), temp_dest, Main_Dynamic.t);
					  
					  
					  
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
					  

					  Main_Dynamic.show_path(Main_Dynamic.RobotPathList);
					  Main_Dynamic.ReadyQueue.offer(r);
					  Main_Dynamic.token = true;
					  
				  }
			  }

			  }
	  }
}
