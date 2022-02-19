package programmers.level2.다리를지나는트럭;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	
	public static void main(String[] args) {
		int bridge_length1 = 2;
		int bridge_length2 = 100;
		int bridge_length3 = 100;
		
		int weight1= 10;
		int weight2= 100;
		int weight3= 100;
		
		int[] truck_weights1 = {7,4,5,6};
		int[] truck_weights2 = {10};
		int[] truck_weights3 = {10,10,10,10,10,10,10,10,10,10};
		
		System.out.println(solution(bridge_length1,weight1,truck_weights1));
		System.out.println(solution(bridge_length2,weight2,truck_weights2));
		System.out.println(solution(bridge_length3,weight3,truck_weights3));
	}
	
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;
		Queue<Integer> queue = new LinkedList<>();
		int idx = 0;
		int temp_truck = 0;
		while(true){
			if(idx == truck_weights.length){
				break;
			}
			if(queue.size() == bridge_length){
				temp_truck = queue.poll();
			}else if(temp_truck + truck_weights[idx] > weight){
				queue.offer(0);
				answer += 1;
			}else{
				queue.offer(truck_weights[idx]);
				temp_truck += truck_weights[idx];
				answer += 1;
				idx += 1;
			}
		}
		
		return answer + bridge_length;
	}
}
