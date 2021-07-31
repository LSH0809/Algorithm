package baekjoon.Baekjoon_2108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    static int average(List<Integer> list) {
        double result = 0;
        double sum = 0;

        for (int value : list) {
            sum += value;
        }

        result = Math.round(sum / list.size());

        return (int) Math.ceil(result);
    }

    static int median(List<Integer> list) {
        return list.get(list.size() / 2);
    }

    static int mode(List<Integer> list) {
        int[] count = new int[8001];
        List<Integer> result_list = new ArrayList<>();
        int max_value = -1;
        for (int value : list) {
            if (value < 0) {
                count[Math.abs(value) + 4000]++;
            } else {
                count[value]++;
            }
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0 && count[i] > max_value) {
                max_value = count[i];
            }
        }

        for (int i = 0; i < count.length; i++) {
            int temp_value = i;
            if (count[i] == max_value) {
                if (i <= 4000) {
                    result_list.add(i);
                } else {
                    temp_value -= 4000;
                    temp_value *= -1;
                    result_list.add(temp_value);
                }
            }
        }
        Collections.sort(result_list);

        if (result_list.size() > 1) {
            return result_list.get(1);
        } else {
            return result_list.get(0);
        }
    }

    static int range(List<Integer> list) {
        return list.get(list.size() - 1) - list.get(0);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            arr.add(Integer.parseInt(bf.readLine()));
        }

        Collections.sort(arr);

        int average = average(arr);
        int median = median(arr);
        int mode = mode(arr);
        int range = range(arr);

        System.out.println(average);
        System.out.println(median);
        System.out.println(mode);
        System.out.println(range);
    }
}
