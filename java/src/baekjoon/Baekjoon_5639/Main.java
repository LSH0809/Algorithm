package baekjoon.Baekjoon_5639;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Node node = new Node(Integer.parseInt(br.readLine()));
		while(true){
			String input = br.readLine();
			if(input == null || input.equals("")){
				break;
			}
			node.insert(Integer.parseInt(input));
		}
		postOrder(node);
	}
	
	private static void postOrder(Node node){
		if(node == null){
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.println(node.number);
	}
	
	static class Node{
		int number;
		Node left;
		Node right;
		
		Node(int nubmer){
			this.number = nubmer;
		}
		
		public Node(int number, Node left, Node right) {
			this.number = number;
			this.left = left;
			this.right = right;
		}
		
		void insert(int n){
			if(n < this.number){
				if(this.left == null){
					this.left = new Node(n);
				}else{
					this.left.insert(n);
				}
			}else{
				if(this.right == null){
					this.right = new Node(n);
				}else{
					this.right.insert(n);
				}
			}
		}
	}
}
