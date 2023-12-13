import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.sql.Array;
import java.util.*;
import java.util.stream.Stream;

import static java.util.Collections.list;

public class Main {
    public static void main(String[] args) throws Exception {

        // 1번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        String[] str = br.readLine().split(" ");
//
//        int i1 = Integer.parseInt(str[0]);
//        int i2 = Integer.parseInt(str[1]);
//
//        System.out.println(i1 + i2);
//        br.close();



        // 2번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        String[] str = br.readLine().split(" ");
//
//        int i1 = Integer.parseInt(str[0]);
//        int i2 = Integer.parseInt(str[1]);
//
//        System.out.println(i1 - i2);



        // 3번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        String[] str = br.readLine().split(" ");
//
//        int i1 = Integer.parseInt(str[0]);
//        int i2 = Integer.parseInt(str[1]);
//
//        System.out.println(i1 * i2);



        // 4번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        String[] str = br.readLine().split(" ");
//
//        double i1 = Integer.parseInt(str[0]);
//        double i2 = Integer.parseInt(str[1]);
//
//        System.out.println(i1 / i2);



        // 5번
//        BufferedReader br = new BufferedReader(new InputStremaReader(System.in));
//
//        String[] str = br.readLine().split(" ");
//
//        int i1 = Integer.parseInt(str[0]);
//        int i2 = Integer.parseInt(str[1]);
//
//        System.out.println(i1 + i2);
//        System.out.println(i1 - i2);
//        System.out.println(i1 * i2);
//        System.out.println(i1 / i2);
//        System.out.println(i1 % i2);



        // 6번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        System.out.println(br.readLine() + "??!");



        // 7번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int i = Integer.parseInt(br.readLine()) - 543;
//
//        bw.write(i + "");
//        bw.flush();
//        bw.close();
//        br.close();



        // 8번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        String[] str = br.readLine().split(" ");
//
//        int i1 = Integer.parseInt(str[0]);
//        int i2 = Integer.parseInt(str[1]);
//        int i3 = Integer.parseInt(str[2]);
//
//        // 첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
//        bw.write((i1 + i2) % i3 + "\n");
//        bw.write(((i1 % i3) + (i2 % i3)) % i3 + "\n");
//        bw.write((i1 * i2) % i3 + "\n");
//        bw.write(((i1 % i3) * (i2 % i3)) % i3 + "\n");
//
//        bw.flush();
//        bw.close();
//        br.close();



        // 9번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int i1 = Integer.parseInt(br.readLine());
//        int i2 = Integer.parseInt(br.readLine());
//
//        // (3)
//        int num3 = i1 * (i2 % 10);
//        // (4)
//        int num4 = i1 * (i2 % 100 / 10);
//        // (5)
//        int num5 = i1 * (i2 / 100);
//        // sum
//        int sum = i1 * i2;
//
//        bw.write(num3 + "\n");
//        bw.write(num4 + "\n");
//        bw.write(num5 + "\n");
//        bw.write(sum + "\n");
//
//        bw.flush();
//        br.close();
//        bw.close();



        // 10번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        long[] arr = Stream.of(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
//
//        bw.write((arr[0] + arr[1] + arr[2]) + "");
//        bw.flush();
//        bw.close();
//        br.close();



        // 11번
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        bw.write("\\    /\\" + "\n" + " )  ( ')" + "\n" + "(  /  )" + "\n" + " \\(__)|");
//
//        bw.flush();
//        bw.close();



        // 12번
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        bw.write("|\\_/|\n|q p|   /}\n( 0 )\"\"\"\\\n|\"^\"`    |\n||_/=\\\\__|");
//
//        bw.flush();
//        bw.close();



        // 13번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//
//        if(arr[0] > arr[1]) {
//            bw.write(">");
//        } else if(arr[0] < arr[1]) {
//            bw.write("<");
//        } else {
//            bw.write("==");
//        }
//        bw.flush();
//        bw.close();
//        br.close();



        // 14번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int score = Integer.parseInt(br.readLine());
//
//        if(score >= 90) {
//            bw.write("A");
//        } else if(score >= 80) {
//            bw.write("B");
//        } else if(score >= 70) {
//            bw.write("C");
//        } else if(score >= 60) {
//            bw.write("D");
//        } else {
//            bw.write("F");
//        }
//        bw.flush();
//        bw.close();
//        br.close();



        // 15번
        // 윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int year = Integer.parseInt(br.readLine());
//
//        boolean isTrue = ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0));
//
//        if(isTrue) {
//            bw.write(1 + "");
//        } else {
//            bw.write(0 + "");
//        }
//        bw.flush();
//        bw.close();
//        br.close();



        // 16번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int x = Integer.parseInt(br.readLine());
//        int y = Integer.parseInt(br.readLine());
//
//        if( x > 0 && y > 0) {
//            bw.write(1 + "");
//        } else if(x > 0 && y < 0) {
//            bw.write(4 + "");
//        } else if(x < 0 && y > 0) {
//            bw.write(2 + "");
//        } else {
//            bw.write(3 + "");
//        }
//        bw.flush();
//        bw.close();
//        br.close();



        // 17번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));
//
//        int[] time = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//
//        boolean min = time[1] >= 45;
//        boolean hour = time[0] >= 1;
//
//        if(min) {
//            bw.write(time[0] + " " + (time[1] - 45));
//        } else {
//            bw.write((hour ? time[0] - 1 : 24 - 1) + " " + (time[1] + 15));
//        }
//        bw.flush();
//        bw.close();
//        br.close();



        // 18번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int[] time = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//        int duration = Integer.parseInt(br.readLine());
//
//        int total = time[0] * 60 + time[1] + duration;
//
//        int hour = (total / 60) % 24;
//        int min = total % 60;
//
//        if (hour == 0 && min == 0) {
//            hour = 0;
//            min = 0;
//        }
//
//        bw.write(hour + " " + min);
//
//        bw.flush();
//        bw.close();
//        br.close();



        // 19번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//
//        int max = 0;
//        int pair = 0;
//
//        for(int num : arr) {
//            if(num > max) max = num;
//        }
//
//        if(arr[0] == arr[1] && arr[1] == arr[2]) {
//            bw.write((10000 + arr[0] * 1000) + "");
//        } else if(arr[0] == arr[1] || arr[1] == arr[2] || arr[0] == arr[2]) {
//            if (arr[0] == arr[1]) {
//                pair = arr[0];
//            } else if (arr[1] == arr[2]) {
//                pair = arr[1];
//            } else {
//                pair = arr[2];
//            }
//            bw.write((1000 + pair * 100) + "");
//        } else {
//            bw.write(max * 100 + "");
//        }
//
//        bw.flush();
//        bw.close();
//        br.close();



        // 20번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int n = Integer.parseInt(br.readLine());
//
//        for(int i = 1; i <= 9; i++) {
//            bw.write(n + " * " + i + " = " + n * i + "\n");
//        }
//
//        bw.flush();
//        bw.close();
//        br.close();



        // 21번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int count = Integer.parseInt(br.readLine());
//
//        for(int i = 0; i < count; i++) {
//            int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//
//            bw.write(arr[0] + arr[1] + "\n");
//        }
//        bw.flush();
//        bw.close();
//        br.close();



        // 22번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int num = Integer.parseInt(br.readLine());
//        int sum = 0;
//
//        for(int i = 1; i <= num; i++) {
//            sum += i;
//        }
//        bw.write(sum + "");
//
//        bw.flush();
//        bw.close();
//        br.close();



        // 23번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int total = Integer.parseInt(br.readLine());
//        int count = Integer.parseInt(br.readLine());
//        int sum = 0;
//
//        for(int i = 0; i < count; i++) {
//            int[] items = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//
//            sum += items[0] * items[1];
//        }
//        bw.write(total == sum ? "Yes" : "No");
//
//        bw.flush();
//        bw.close();
//        br.close();



        // 24번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int num = Integer.parseInt(br.readLine());
//        int count = num / 4;
//        String str = "";
//
//        for(int i = 1; i <= count; i++) {
//            str += "long ";
//        }
//        bw.write(str + "int");
//
//        bw.flush();
//        bw.close();
//        br.close();




        // 25번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int count = Integer.parseInt(br.readLine());
//
//        int[] sum = new int[count];
//
//        for(int i = 0; i < count; i++) {
//            int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//
//            sum[i] = arr[0] + arr[1];
//        }
//
//        for(int result : sum) {
//            bw.write(result + "\n");
//        }
//        bw.flush();
//        br.close();
//        bw.close();



        // 26번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int count = Integer.parseInt(br.readLine());
//
//        int[] sum = new int[count];
//
//        for(int i = 0; i < count; i++) {
//            int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//
//            sum[i] = arr[0] + arr[1];
//        }
//
//        for(int i = 0; i < sum.length; i++) {
//            bw.write("Case #" + (i + 1) + ": " + sum[i] + "\n");
//        }
//        bw.flush();
//        bw.close();
//        br.close();



        // 27번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int count = Integer.parseInt(br.readLine());
//
//        String[] sum = new String[count];
//
//        for(int i = 0; i < count; i++) {
//            int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//
//            sum[i] = arr[0] + " + " + arr[1] + " = " + (arr[0] + arr[1]);
//        }
//
//        for(int i = 0; i < sum.length; i++) {
//            bw.write("Case #" + (i + 1) + ": " + sum[i] + "\n");
//        }
//        bw.flush();
//        bw.close();
//        br.close();



        // 28번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int count = Integer.parseInt(br.readLine());
//
//        for(int i = 1; i <= count; i++) {
//            for(int j = 1; j <= count; j++) {
//                bw.write(j <= i ? "*" : "");
//            }
//            if(i != count) bw.write("\n");
//        }
//        bw.flush();
//        bw.close();
//        br.close();



        // 29번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int count = Integer.parseInt(br.readLine());
//
//        for(int i = 1; i <= count; i++) {
//            for(int j = 1; j <= count; j++) {
//                bw.write(j >= count - i + 1 ? "*" : " ");
//            }
//            if(i != count) bw.write("\n");
//        }
//        bw.flush();
//        bw.close();
//        br.close();



        // 30번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        ArrayList<Integer> list = new ArrayList();
//
//        while(true) {
//            int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//            if(arr[0] == 0 && arr[1] == 0) break;
//            list.add(arr[0] + arr[1]);
//        }
//        for(int result : list) {
//            bw.write(result + "\n");
//        }
//        bw.flush();
//        bw.close();
//        br.close();



        // 31번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        ArrayList<Integer> list = new ArrayList();
//
//        String input = "";
//
//        while(((input = br.readLine()) != null) && !input.isEmpty()) {
//
//            int[] arr = Stream.of(input.split(" ")).mapToInt(Integer::parseInt).toArray();
//            list.add(arr[0] + arr[1]);
//        }
//        for(int result : list) {
//            bw.write(result + "\n");
//        }
//        bw.flush();
//        bw.close();
//        br.close();



        // 32번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int count = Integer.parseInt(br.readLine());
//        int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//        int idx = Integer.parseInt(br.readLine());
//        int sum = 0;
//
//        for(int i = 0; i < count; i++) {
//            sum += arr[i] == idx ? 1 : 0;
//        }
//        bw.write(sum + "");
//
//        bw.flush();
//        bw.close();
//        br.close();



        // 33번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int[] con = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//        int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//        ArrayList<Integer> list = new ArrayList();
//
//        for(int i = 0; i < arr.length; i++) {
//            if(arr[i] < con[1]) list.add(arr[i]);
//        }
//        for(int i = 0; i < list.size(); i++) {
//            if(i == list.size() - 1) {
//                bw.write(list.get(i) + "");
//            } else {
//                bw.write(list.get(i) + " ");
//            }
//        }
//        bw.flush();
//        bw.close();
//        br.close();



        // 34번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int index = Integer.parseInt(br.readLine());
//        int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//
//        // 34-1
////        int min = Arrays.stream(arr).min().getAsInt();
////        int max = Arrays.stream(arr).max().getAsInt();
////
////        bw.write(min + " " + max);
//
//        // 34-2
//        int min = 1000001;
//        int max = -1000001;
//
//        for(int i = 0; i < arr.length; i++) {
//            if(arr[i] > max) max = arr[i];
//            if(arr[i] < min) min = arr[i];
//        }
//
//        bw.write(min + " " + max);
//
//        bw.flush();
//        bw.close();
//        br.close();



        // 35번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        String input = "";
//
//        int max = 0;
//        int idx = 0;
//
//        for (int i = 1; i <= 9; i++) {
//            int current = Integer.parseInt(br.readLine());
//            if (max < current) {
//                max = current;
//                idx = i;
//            }
//        }
//        bw.write(max + "\n" + idx);
//
//        bw.flush();
//        bw.close();
//        br.close();



        // 36번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int[] count = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//
//        int[] bucket = new int[count[0]];
//
//        for(int i = 0; i < count[1]; i++) {
//            int[] condition = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//
//            if(condition[0] != condition[1]) {
//                for(int j = condition[0] - 1; j < condition[1]; j++) {
//                    bucket[j] = condition[2];
//                }
//            } else {
//                bucket[condition[0] - 1] = condition[2];
//            }
//        }
//        for(int i = 0; i < bucket.length; i++) {
//            if(i != bucket.length - 1) {
//                bw.write(bucket[i] + " ");
//            } else {
//                bw.write(bucket[i] + "");
//            }
//        }
//        bw.flush();
//        bw.close();
//        br.close();



        // 37번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int[] count = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//        int[] bucket = new int[count[0]];
//        int i1 = 0;
//        int i2 = 0;
//
//        for(int i = 0; i < bucket.length; i++) {
//            bucket[i] = i + 1;
//        }
//        for(int i = 0; i < count[1]; i++) {
//            int[] cdn = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//
//            i1 = bucket[cdn[0] - 1];
//            i2 = bucket[cdn[1] - 1];
//
//            bucket[cdn[0] - 1] = i2;
//            bucket[cdn[1] - 1] = i1;
//        }
//        for(int i = 0; i < bucket.length; i++) {
//            if(i != bucket.length - 1) {
//                bw.write(bucket[i] + " ");
//            } else {
//                bw.write(bucket[i] + "");
//            }
//        }
//        bw.flush();
//        bw.close();
//        br.close();



        // 38번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        Set<Integer> submit = new HashSet<>();
//        int[] noSub = new int[2];
//
//        for(int i = 0; i < 28; i++) {
//            int submitStu = Integer.parseInt(br.readLine());
//            submit.add(submitStu);
//        }
//        for(int i = 1; i <= 30; i++) {
//            if(!submit.contains(i)) {
//                bw.write(i + "\n");
//            }
//        }
//        bw.flush();
//        bw.close();
//        br.close();



        // 39번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        Set<Integer> list = new HashSet<>();
//
//        for(int i = 0; i < 10; i++) {
//            int num = Integer.parseInt(br.readLine());
//            list.add(num % 42);
//        }
//        bw.write(list.size() + "");
//
//        bw.flush();
//        bw.close();
//        br.close();




        // 40번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int[] condition = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//
//        List<Integer> buckets = new ArrayList<>();
//
//        for (int i = 0; i < condition[0]; i++) {
//            buckets.add(i + 1);
//        }
//        for (int i = 0; i < condition[1]; i++) {
//            int[] index = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//
//            List<Integer> sub = new ArrayList<>(buckets.subList(index[0] - 1, index[1]));
//            Collections.reverse(sub);
//
//            for (int j = index[0] - 1, k = 0; j < index[1]; j++, k++) {
//                buckets.set(j, sub.get(k));
//            }
//        }
//        for (int i = 0; i < buckets.size(); i++) {
//            bw.write(buckets.get(i) + " ");
//        }
//        bw.flush();
//        bw.close();
//        br.close();



        // 41번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int subjects = Integer.parseInt(br.readLine());
//        double[] scores = Stream.of(br.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
//
//        double maxScore = Arrays.stream(scores).max().orElse(0);
//
//        for(int i = 0; i < scores.length; i++){
//            scores[i] = scores[i] / maxScore * 100;
//        }
//        bw.write(Arrays.stream(scores).average().orElse(0) + "");
//
//        bw.flush();
//        bw.close();
//        br.close();



        // 42번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        String str = br.readLine();
//        int index = Integer.parseInt(br.readLine());
//
//        bw.write(str.charAt(index - 1));
//
//        bw.flush();
//        bw.close();
//        br.close();



        // 43번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        String str = br.readLine();
//
//        bw.write(str.length() + "");
//
//        bw.flush();
//        bw.close();
//        br.close();



        // 44번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int count = Integer.parseInt(br.readLine());
//        String[] sArr = new String[count];
//
//        for(int i = 0; i < count; i++) {
//            String str = br.readLine();
//
//            sArr[i] = str.charAt(0)  + "" + str.charAt(str.length() - 1);
//        }
//        for(String str : sArr) {
//            bw.write(str + "\n");
//        }
//
//        bw.flush();
//        bw.close();
//        br.close();



        // 45번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        bw.write(br.readLine().codePointAt(0) + "");
//
//        bw.flush();
//        bw.close();
//        br.close();



        // 46번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int count = Integer.parseInt(br.readLine());
//        int[] arr = Stream.of(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
//
//        bw.write(Arrays.stream(arr).sum() + "");
//
//        bw.flush();
//        bw.close();
//        br.close();



        // 47번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        String str = br.readLine();
//
//        for (char c = 'a'; c <= 'z'; c++) {
//            int result = str.indexOf(c);
//            bw.write(result + " ");
//        }
//
//        bw.flush();
//        bw.close();
//        br.close();



        // 48번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        String str = br.readLine();
//
//        for (char c = 'a'; c <= 'z'; c++) {
//            int result = str.indexOf(c);
//            bw.write(result + " ");
//        }
//
//        bw.flush();
//        bw.close();
//        br.close();



        // 49번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int count = Integer.parseInt(br.readLine());
//        List<String> list = new ArrayList<>();
//
//        for(int i = 0; i < count; i++) {
//            String[] arr = Stream.of(br.readLine().split(" ")).toArray(String[]::new);
//            String str = "";
//            for(int j = 0; j < arr[1].length(); j++) {
//                for(int k = 0; k < Integer.parseInt(arr[0]); k++) {
//                    str += arr[1].charAt(j) + "";
//                }
//            }
//            list.add(str);
//        }
//        for(String s : list) {
//            System.out.println(s);
//        }
//
//        bw.flush();
//        bw.close();
//        br.close();



        // 50번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        String str = br.readLine().trim();
//
//        if(!str.equals("")) {
//            String[] sArr = Stream.of(str.split(" ")).toArray(String[]::new);
//            bw.write(sArr.length + "");
//        } else {
//            bw.write(0 + "");
//        }
//
//        bw.flush();
//        bw.close();
//        br.close();



        // 51번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        String[] sArr = Stream.of(br.readLine().split(" ")).toArray(String[]::new);
//
//        StringBuffer sb1 = new StringBuffer(sArr[0]);
//        StringBuffer sb2 = new StringBuffer(sArr[1]);
//
//        int num1 = Integer.parseInt(sb1.reverse().toString());
//        int num2 = Integer.parseInt(sb2.reverse().toString());
//
//        bw.write(((num1 > num2) ? num1 : num2) + "");
//
//        bw.flush();
//        bw.close();
//        br.close();



        // 52번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        char[] cArr = br.readLine().toCharArray();
//
//        int duration = 0;
//
//        for(char c : cArr) {
//            if(c >= 'W') {
//                duration += 10;
//            } else if(c >= 'T') {
//                duration += 9;
//            } else if(c >= 'P') {
//                duration += 8;
//            } else if(c >= 'M') {
//                duration += 7;
//            } else if(c >= 'J') {
//                duration += 6;
//            } else if(c >= 'G') {
//                duration += 5;
//            } else if(c >= 'D') {
//                duration += 4;
//            } else if(c >= 'A') {
//                duration += 3;
//            }
//        }
//        bw.write(duration + "");
//
//        bw.flush();
//        bw.close();
//        br.close();



        // 53번
//        Scanner sc = new Scanner(System.in);
//
//        while(sc.hasNext()) {
//            System.out.println(sc.nextLine());
//        }



        // 54번
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        String str = "         ,r'\"7\n" +
//                    "r`-_   ,'  ,/\n" +
//                    " \\. \". L_r'\n" +
//                    "   `~\\/\n" +
//                    "      |\n" +
//                    "      |";
//        bw.write(str);
//
//        bw.flush();
//        bw.close();



        // 55번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int[] count = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//        int[] chess = {1,1,2,2,2,8};
//
//        // 1 1 2 2 2 8
//        chess[0] -= count[0];
//        chess[1] -= count[1];
//        chess[2] -= count[2];
//        chess[3] -= count[3];
//        chess[4] -= count[4];
//        chess[5] -= count[5];
//
//        for(int i : chess) {
//            bw.write(i + " ");
//        }
//        bw.flush();
//        bw.close();
//        br.close();



        // 56번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int count = Integer.parseInt(br.readLine());
//
//        for(int i = 0; i < 2 * count - 1; i++) {
//            for(int j = 0; j < 2 * count - 1; j++) {
//                if(i < count) {
//                    if(j >= count + i){
//                        continue;
//                    } else if(j < count - i - 1) {
//                        System.out.print(' ');
//                    }else {
//                        System.out.print('*');
//                    }
//                } else {
//                    if(j <= i - count){
//                        System.out.print(' ');
//                    } else if(j >= 3 * count - i - 2) {
//                        continue;
//                    } else {
//                        System.out.print('*');
//                    }
//                }
//            }
//            if(i < 2 * count - 2) {
//                System.out.println();
//            }
//        }
//        br.close();



        // 57번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        String str = br.readLine();
//
//        StringBuffer sb1 = new StringBuffer(str);
//        StringBuffer sb2 = new StringBuffer(str);
//
//        if(sb1.toString().equals(sb2.reverse().toString())) {
//            System.out.println("1");
//        } else {
//            System.out.println("0");
//        }
//        br.close();



        // 58번
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        

        br.close();
    }
}