import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.swing.text.View;

public class Friend {
	private Collection<Friend> friends;
	private String email;
	
	public Friend(String email) {
		this.email = email;
		this.friends = new ArrayList<Friend>();
	}
	
	public String getEmail() {
		return email;
	}
	
	public Collection<Friend> getFriends() {
		return friends;
	}
	
	public void addFriendship(Friend friend) {
		friends.add(friend);
		friend.getFriends().add(this);
	}
	
	public boolean canBeConnected(Friend friend) {
		Queue<Friend> queue = new LinkedList<>();
		queue.offer(friend);
		
		while(!queue.isEmpty()){
			Friend tempFriends = queue.poll();
			if(tempFriends.getEmail().equals(this.getEmail())){
				return true;
			}
			List<Friend> tempList = new ArrayList<>(tempFriends.friends);
			for(int j = 0; j< tempList.size(); j++){
				if( tempList.get(j) == tempFriends){
					continue;
				}else{
					queue.offer(tempList.get(j));
				}
			}
		}
		return false;
	}

//	public boolean canBeConnected(Friend friend) {
//		int n = friend.friends.size();
//		Queue<Friend> queue = new LinkedList<>();
//		boolean[] visited = new boolean[n];
//		queue.offer(friend);
//		visited[friend]
//		while(!queue.isEmpty()){
//
//		}
//	}
	
	public static void main(String[] args) {
		Friend a = new Friend("A");
		Friend b = new Friend("B");
		Friend c = new Friend("C");
		
		a.addFriendship(b);
		b.addFriendship(c);
		
		System.out.println(a.canBeConnected(c));
	}
}

//public class MaxSum {
//	public static int findMaxSum(List<Integer> list) {
//		int[] temp = new int[list.size()];
//		mergeSort(list,0,list.size()-1,temp);
//
//		int sumValue = list.get(list.size()-1) + list.get(list.size()-2);
//
//		return sumValue;
//	}
//
//	private static void mergeSort(List<Integer> list,int start, int end,int[] answer){
//		if(start < end){
//			int mid = (start + end) / 2;
//			mergeSort(list, start, mid, answer);
//			mergeSort(list, mid + 1, end, answer);
//
//			int i = start;
//			int j = mid + 1;
//			int index = i;
//
//			while(i <= mid || j <= end){
//				if(j > end || (i <= mid && list.get(i) < list.get(j))){
//					answer[index++] = list.get(i++);
//				}else{
//					answer[index++] = list.get(j++);
//				}
//			}
//
//			for(int v = start; v <= end; v++){
//				list.set(v,answer[v]);
//			}
//		}
//	}
//
//	public static void main(String[] args) {
//		List<Integer> list = Arrays.asList(5, 9, 7, 11);
//
//		System.out.println(findMaxSum(list));
//	}
//}
