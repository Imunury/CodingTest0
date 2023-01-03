//피보나치 수는 F(0) = 0, F(1) = 1일 때, 1 이상의 n에 대하여 F(n) = F(n-1) + F(n-2) 가 적용되는 수 입니다.
//
//예를들어
//
//F(2) = F(0) + F(1) = 0 + 1 = 1
//F(3) = F(1) + F(2) = 1 + 1 = 2
//F(4) = F(2) + F(3) = 1 + 2 = 3
//F(5) = F(3) + F(4) = 2 + 3 = 5
//와 같이 이어집니다.
//
//2 이상의 n이 입력되었을 때, n번째 피보나치 수를 1234567으로 나눈 나머지를 리턴하는 함수, solution을 완성해 주세요.
class Solution101 {
    public int solution(int n) {
        int answer = 0;
        int[] array = new int[n];
        array[0] = 1;
        array[1] = 1;
        int m = 1234567;
        for (int i = 0; i < n - 2; i++) {
            array[i + 2] = array[i + 1] % m + array[i] % m;
            answer = array[i + 2];
        }
        return answer;
    }
}

//3x 마을 사람들은 3을 저주의 숫자라고 생각하기 때문에 3의 배수와 숫자 3을 사용하지 않습니다. 3x 마을 사람들의 숫자는 다음과 같습니다.
//
//10진법	3x 마을에서 쓰는 숫자	10진법	3x 마을에서 쓰는 숫자
//1	1	6	8
//2	2	7	10
//3	4	8	11
//4	5	9	14
//5	7	10	16
//정수 n이 매개변수로 주어질 때, n을 3x 마을에서 사용하는 숫자로 바꿔 return하도록 solution 함수를 완성해주세요.
class Solution102 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            answer++;
            if (String.valueOf(i).contains("3") || i % 3 == 0) {
                answer++;
            }
        }
        for (int j = n; j < answer; j++) {
            if (String.valueOf(j).contains("3") || j % 3 == 0) {
                answer++;
            }
        }
        return answer - 1;
    }
}

//선분 3개가 평행하게 놓여 있습니다. 세 선분의 시작과 끝 좌표가 [[start, end], [start, end], [start, end]] 형태로 들어있는 2차원 배열 lines가 매개변수로 주어질 때, 두 개 이상의 선분이 겹치는 부분의 길이를 return 하도록 solution 함수를 완성해보세요.
//
class Solution103 {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] arr = new int[201];
        //lines [1속] [2속] [3속]
        for (int[] line : lines) {
            // 0  1  2  3  4  5  6  7  8  9 10
            // [1][1][1][1][1][0][0][0][0][0]
            // [0][0][0][1][1][1][1][1][1][0]
            // [0][1][1][1][1][1][1][1][1][1]
            // [1][2][2][3][3][2][2][2][2][1]
            for (int i = line[0]; i < line[1]; i++) {
                arr[i + 100]++;
            }
        }
        for (int j = 0; j < 200; j++) {
            if (arr[j] >= 2) {
                answer++;
            }
        }
        return answer;
    }
}

//문자열 s가 입력되었을 때 다음 규칙을 따라서 이 문자열을 여러 문자열로 분해하려고 합니다.
//
//먼저 첫 글자를 읽습니다. 이 글자를 x라고 합시다.
//이제 이 문자열을 왼쪽에서 오른쪽으로 읽어나가면서, x와 x가 아닌 다른 글자들이 나온 횟수를 각각 셉니다. 처음으로 두 횟수가 같아지는 순간 멈추고, 지금까지 읽은 문자열을 분리합니다.
//s에서 분리한 문자열을 빼고 남은 부분에 대해서 이 과정을 반복합니다. 남은 부분이 없다면 종료합니다.
//만약 두 횟수가 다른 상태에서 더 이상 읽을 글자가 없다면, 역시 지금까지 읽은 문자열을 분리하고, 종료합니다.
//문자열 s가 매개변수로 주어질 때, 위 과정과 같이 문자열들로 분해하고, 분해한 문자열의 개수를 return 하는 함수 solution을 완성하세요.
class Solution104{
    public int solution(String s) {
        int answer = 0;
        int equ = 0;
        int dif = 0;
        int row = 0;
        int a = 0;
        for (int i = 0; i < s.length(); i++) {
            String str1 = s.substring(0 + row * 2, 1 + row * 2);
            String str = s.substring(i, i + 1);
            a++;
            if (str1.equals(str)) {
                equ++;
            } else {
                dif++;
            }
            if (equ == dif) {
                row += equ;
                answer++;
                equ = 0;
                dif = 0;
                a = 0;
            }
            if (s.length() == i+1 && a > 0) {
                answer++;
            }
        }
        return answer;
    }
}

// if(equ==0){
//                    answer++;
//                }