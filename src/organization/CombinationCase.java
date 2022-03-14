package organization;

public class CombinationCase {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,10,10};
        boolean[] visited = new boolean[arr.length];
        int n = arr.length;

        for(int i = 1; i< n + 1; i++){
            combinationRecursion(arr,visited,0,n,i);
        }
    }

    /*
    성능에 대한 차이는 재귀와 백트래킹은 큰 차이가 없었다.
    하지만, 약소하게나마 백트래킹이 좋았다.
    */

    private static void combinationBackTracking(int[] arr,boolean[] visited, int start, int n, int r){
        if(r == 0){
            for(int i= 0; i< n; i++){
                if(visited[i]){
                    System.out.print(arr[i] + " ");
                } // 방문한 위치에 해당하는 인덱스 -> arr 배열에서 출력
            }
            System.out.println();
            return;
        }

        for(int i = start; i < n; i++){
            visited[i] = true;
            combinationBackTracking(arr,visited,i + 1, n, r - 1);
            visited[i] = false;
        }
    } // 백트래킹 방식을 활용한 조합 구하기


    private static void combinationRecursion(int[] arr, boolean[] visited, int depth, int n, int r){
        if(r == 0){
            for(int i= 0; i< n; i++){
                if(visited[i]){
                    System.out.print(arr[i] + " ");
                } // 방문한 위치에 해당하는 인덱스 -> arr 배열에서 출력
            }
            System.out.println();
            return;
        }
        if(depth == n){
            return;
        }

        visited[depth] = true;
        combinationRecursion(arr, visited, depth + 1, n, r - 1);
        visited[depth] = false;
        combinationRecursion(arr, visited, depth + 1, n, r);
    }// 재귀를 이용하여 조합 출력


}
