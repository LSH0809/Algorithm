package baekjoon.Baekjoon_2776;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static int binarySearch(int[] arr, int start, int end, int target) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }

        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = null;

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringBuffer sb = new StringBuffer();

            int N = Integer.parseInt(br.readLine());

            int[] n_arr = new int[N];

            String n_line = br.readLine();
            st = new StringTokenizer(n_line, " ");
            for (int i = 0; i < N; i++) {
                n_arr[i] = Integer.parseInt(st.nextToken());
            }

            int M = Integer.parseInt(br.readLine());
            int[] m_arr = new int[M];
            String m_line = br.readLine();
            st = new StringTokenizer(m_line, " ");
            for (int i = 0; i < M; i++) {
                m_arr[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(n_arr);

            for (int i = 0; i < m_arr.length; i++) {
                if (binarySearch(n_arr, 0, n_arr.length - 1, m_arr[i]) == -1) {
                    if (i != m_arr.length - 1) {
                        sb.append(0).append("\n");
                    } else {
                        sb.append(0);
                    }
                } else {
                    if (i != m_arr.length - 1) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(1);
                    }
                }
            }
            System.out.println(sb.toString());
        }
    }
}
