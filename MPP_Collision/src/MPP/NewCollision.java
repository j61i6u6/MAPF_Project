package MPP;

import java.util.ArrayList;
import java.util.Arrays;


public class NewCollision {
	public static void collision1(ArrayList<ArrayList<ArrayList>> total,int j,ArrayList<robot> roblist) {
		
		ArrayList CollisionObstacle = new ArrayList();
		ArrayList adj = new ArrayList();
		boolean check = true;
		label1:
			/*跑while判斷是否有碰撞*/
		while(check) {
			check = false;
			
			
			
			/*判斷是否有與前面權重高的機器人出發點是一樣的，一樣就讓權這台晚一步出發*/
			for(int k = 0;k<j;k++) {
				Node first_j = (Node) total.get(j).get(0).get(0);
				int time = (int) total.get(j).get(0).get(1);
				int start_b = (int)total.get(k).get(0).get(1);
				int end_b = (int)total.get(k).get((int)total.get(k).size()-1).get(1);
				if(time>end_b) {
					continue;
				}
				Node first_k = (Node) total.get(k).get(time-start_b).get(0);
				
				if(first_j.getName() == first_k.getName()) {
					Main_Dynamic.show_path(total);
					
					robot r = roblist.get(j);
					r.start_time = r.start_time+1;
					
					for (int a = 0; a<total.get(j).size(); a++)
					{
						total.get(j).get(a).set(1,(int)total.get(j).get(a).get(1)+1);	
					}
					check = true;
					Main_Dynamic.sortrob(roblist);
					total.clear();
					for(int q=0;q<roblist.size();q++)
					{
						robot robott = (robot) roblist.get(q);
						total.add(robott.Path);
					}

					break;
				}
			}
			if(check) {
				continue;
			}
			
			
			/*判斷是否與前面機器人發生碰撞，如碰撞，便處理*/	
		for(int k = 0;k<j;k++) {
			int legnth_b = (int)total.get(k).get(total.get(k).size()-1).get(1);
			int start_b = (int)total.get(k).get(0).get(1);
			int legnth_a = (int)total.get(j).get(total.get(j).size()-1).get(1);
			int start_a = (int)total.get(j).get(0).get(1);
			for(int i = start_a+1;i<=legnth_a;i++) {
				if(legnth_b >= i &&i >start_b)
				{
					
					Node now_j = (Node) total.get(j).get(i-start_a).get(0);
					Node now_k = (Node) total.get(k).get(i-start_b).get(0);
					Node pre_j = (Node) total.get(j).get(i-start_a-1).get(0);
					Node pre_k = (Node) total.get(k).get(i-start_b-1).get(0);
					if(now_j.getName() == pre_k.getName()&&now_k.getName() == pre_j.getName()) {
						check = true;
						Main_Dynamic.show_path(total);
						
						MapBuilder map = new MapBuilder();
						map.CreateGraph();
						
						map.AddObstacle(map.nodeV);map.AddObstacle(map.nodeW);
						map.AddObstacle(map.nodeBB);map.AddObstacle(map.nodeBC);
						map.AddObstacle(map.nodeBG);map.AddObstacle(map.nodeBH);
						map.AddObstacle(map.nodeBL);map.AddObstacle(map.nodeBM);
						map.AddObstacle(map.nodeBQ);map.AddObstacle(map.nodeBR);
						
						map.AddObstacle(map.nodeAU);map.AddObstacle(map.nodeAV);
						map.AddObstacle(map.nodeCA);map.AddObstacle(map.nodeCB);
						map.AddObstacle(map.nodeCF);map.AddObstacle(map.nodeCG);
						map.AddObstacle(map.nodeCK);map.AddObstacle(map.nodeCL);
						map.AddObstacle(map.nodeCP);map.AddObstacle(map.nodeCQ);
						
						
						map.AddObstacle(map.nodeAX);
						map.AddObstacle(map.nodeCD);
						map.AddObstacle(map.nodeCI);
						map.AddObstacle(map.nodeCN);
						map.AddObstacle(map.nodeCS);
						CollisionObstacle.add(now_j);
						for(Node x:map.graph.getNodes())
						{
							for(int a=0;a<CollisionObstacle.size();a++)
							{
								if(((Node) CollisionObstacle.get(a)).getName()==x.getName())
								{
									adj.add(x);
								}
							}
						}
						for(int q=0;q<adj.size();q++)
						{
							map.AddObstacle((Node) adj.get(q));
						}
						Node start = pre_j;
						Node end = (Node)total.get(j).get(total.get(j).size()-1).get(0);
						
						for(Node y:map.graph.getNodes())
						{
							if(y.getName()==start.getName())
							{
								start = y;
							}
							if(y.getName()==end.getName())
							{
								end = y;
							}
						}
						
						ArrayList<ArrayList> Path = new ArrayList<ArrayList>();
						Path = map.New_getShortestPathToDestination(map.graph, start,end,i-1);
						
						if(Path.size() == 1 || Path.size() == 0){
							
							robot r = roblist.get(j);
							r.start_time = r.start_time+1;
							
							for (int a = 0; a<total.get(j).size(); a++)
							{
								total.get(j).get(a).set(1,(int)total.get(j).get(a).get(1)+1);	
							}
							check = true;
							Main_Dynamic.sortrob(roblist);
							total.clear();
							for(int q=0;q<roblist.size();q++)
							{
								robot robott = (robot) roblist.get(q);
								total.add(robott.Path);
							}
							CollisionObstacle.clear();
							adj.clear();
							continue label1;
							
						}
						int  pathsize = 0;
						boolean aaaaa = true;
						for(int e = 0;e<Path.size();e++) {
							if(e<=legnth_a-i+1) {
								total.get(j).get(i-start_a+e-1).set(0,Path.get(e).get(0));
								pathsize = i-start_a+e-1;
							}else if(e>legnth_a-i+1) {
								total.get(j).add(Path.get(e));
								aaaaa = false;
							}	
						}
						if(aaaaa) {
							int pathh = total.get(j).size()-pathsize-1;
							for (int aa = 0;aa<pathh;aa++) {
								total.get(j).remove(total.get(j).size()-1);
							}
						}
						
						for(int g=0;g<Path.size();g++) {
							Node a = (Node) Path.get(g).get(0);
							
						}
						Main_Dynamic.show_path(total);
					}
					
					
					if(now_j.getName() == now_k.getName())
					{
						
						check = true;
						
						Main_Dynamic.show_path(total);
						
						
						Node tempnode = pre_j;
						int temptime = 0;
						for (int a = i-start_a;a>=0;a--) {
							 tempnode = (Node) total.get(j).get(a).get(0);
							 if(a == 0) {
								
									robot r = roblist.get(j);
									r.start_time = r.start_time+1;
									
									for (int c = 0; c<total.get(j).size(); c++)
									{
										total.get(j).get(c).set(1,(int)total.get(j).get(c).get(1)+1);	
									}
									check = true;
									Main_Dynamic.sortrob(roblist);
									total.clear();
									for(int q=0;q<roblist.size();q++)
									{
										robot robott = (robot) roblist.get(q);
										total.add(robott.Path);
									}
									CollisionObstacle.clear();
									adj.clear();
									continue label1;
							 }
							if(tempnode.getName() != now_j.getName()) {
								temptime = (int)total.get(j).get(a).get(1);
								break;
							}
						}
						ArrayList temp = new ArrayList();
						temp.add(tempnode);
						temp.add(i);
						total.get(j).add(i-start_a,temp);
						
						for(int a = temptime-start_a; a <= i-start_a; a++) {
							total.get(j).get(a).set(0,tempnode);
						}
						for (int a = i+1; a <= legnth_a+1; a++)
						{
							total.get(j).get(a-start_a).set(1,(int)total.get(j).get(a-start_a).get(1)+1);
						}
						Main_Dynamic.show_path(total);
						break;
					}

				}
				
			}
		}
		
		
		
	}
			
  }
	
	
	
}