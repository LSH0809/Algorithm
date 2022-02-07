package baekjoon.Baekjoon_1991;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Tree tree = new Tree();
		
		for(int i = 0; i< n; i++){
			char[] data;
			data = br.readLine().replaceAll(" ","").toCharArray();
			tree.createNode(data[0],data[1],data[2]);
		}
		tree.preOrder(tree.root);
		System.out.println();
		
		tree.inOrder(tree.root);
		System.out.println();
		
		tree.postOrder(tree.root);
		System.out.println();
	}
	
	static class Node{
		char data;
		Node left;
		Node right;
		
		Node(char data){
			this.data = data;
		}
	}
	
	static class Tree{
		Node root;
		
		public void createNode(char data, char leftData, char rightData){
			if(root == null){ // 아무것도 없는 초기 상태
				root = new Node(data);
				
				if(leftData != '.'){ // '.'는 자식 노드가 없는 경우
					root.left = new Node(leftData);
				}
				if(rightData != '.'){
					root.right = new Node(rightData);
				}
			}else{ // 초기 상태가 아니라면 어디에 들어가야할지 찾아야 한다.
				searchNode(root,data,leftData,rightData);
			}
		}
		
		public void searchNode(Node root, char data, char leftData, char rightData){
			if(root == null){ // 도착한 노드가 null이면 재귀 종료
				return;
			}else if(root.data == data){ // 들어갈 위치를 찾았다면
				if(leftData != '.'){ // 값이 있는 경우에만 좌우 노드 생성
					root.left = new Node(leftData);
				}
				if(rightData != '.'){
					root.right = new Node(rightData);
				}
			}else { // 아직 찾지 못했고 탐색할 노드가 남아있다면
				searchNode(root.left,data,leftData,rightData);
				searchNode(root.right,data,leftData,rightData);
			}
		}
		
		public void preOrder(Node root){
			System.out.print(root.data);
			if(root.left != null){
				preOrder(root.left);
			}
			if(root.right != null){
				preOrder(root.right);
			}
		} // 전위 순회 : 루트 -> 좌 -> 우
		
		public void inOrder(Node root){
			if(root.left != null){
				inOrder(root.left);
			}
			System.out.print(root.data);
			if(root.right != null){
				inOrder(root.right);
			}
		} // 중위 순회 : 좌 -> 루트 -> 우
	
		public void postOrder(Node root){
			if(root.left != null){
				postOrder(root.left);
			}
			if(root.right != null){
				postOrder(root.right);
			}
			System.out.print(root.data);
		}
	}
}
