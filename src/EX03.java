import java.util.Arrays;

//머쓱이는 할머니께 생신 축하 편지를 쓰려고 합니다.
//할머니가 보시기 편하도록 글자 한 자 한 자를 가로 2cm 크기로 적으려고 하며,
//편지를 가로로만 적을 때, 축하 문구 message를 적기 위해 필요한 편지지의 최소 가로길이를 return 하도록 solution 함수를 완성해주세요.
class Solution21 {
    public int solution(String message) {
        int answer = message.length() * 2;
        return answer;
    }
}

//사분면은 한 평면을 x축과 y축을 기준으로 나눈 네 부분입니다. 사분면은 아래와 같이 1부터 4까지 번호를매깁니다.
//x 좌표와 y 좌표가 모두 양수이면 제1사분면에 속합니다.
//x 좌표가 음수, y 좌표가 양수이면 제2사분면에 속합니다.
//x 좌표와 y 좌표가 모두 음수이면 제3사분면에 속합니다.
//x 좌표가 양수, y 좌표가 음수이면 제4사분면에 속합니다.
//x 좌표 (x, y)를 차례대로 담은 정수 배열 dot이 매개변수로 주어집니다. 좌표 dot이 사분면 중 어디에 속하는지 1, 2, 3, 4 중 하나를 return 하도록 solution 함수를 완성해주세요.
class Solution22 {
    public int solution(int[] dot) {
        int answer = 0;
        if (dot[0] > 0 && dot[1] > 0) {
            answer = 1;
        } else if (dot[0] < 0 && dot[1] > 0) {
            answer = 2;
        } else if (dot[0] < 1 && dot[1] < 0) {
            answer = 3;
        } else if (dot[0] > 1 && dot[1] < 0) {
            answer = 4;
        }
        return answer;
    }
}

//정수가 담긴 리스트 num_list가 주어질 때,
// num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
class Solution23 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                answer[0]++;
            } else {
                answer[1]++;
            }
        }
        return answer;
    }
}

//문자열 my_string이 매개변수로 주어집니다. my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.
class Solution24 {
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            answer += my_string.substring(my_string.length() - i - 1, my_string.length() - i);
        }
        return answer;
    }
}

//문자열 배열 strlist가 매개변수로 주어집니다. strlist 각 원소의 길이를 담은 배열을 retrun하도록 solution 함수를 완성해주세요.
class Solution25 {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for (int i = 0; i < strlist.length; i++) {
            answer[i] += strlist[i].length();
        }
        return answer;
    }
}

//정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때,
//numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.
class Solution26 {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        for (int i = num1; i <= num2; i++) {
            answer[i - num1] = numbers[i];
        }
        return answer;
    }
}

/*
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }
}*/

//문자열 my_string과 문자 letter이 매개변수로 주어집니다.
//my_string에서 letter를 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
class Solution27 {
    public String solution(String my_string, String letter) {
        String answer = "";
        answer = my_string.replace(letter, "");
        return answer;
    }
}

//정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
class Solution28 {
    public int[] solution(int n) {
        int[] answer = new int[(int) Math.ceil((n + 1) / 2)];
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 1) {
                answer[(int) Math.ceil(i / 2)] = i;
            }
        }
        return answer;
    }
}

/*
class Solution {
    public int[] solution(int n) {
        return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
    }
}*/

//정수 배열 numbers가 매개변수로 주어집니다.
//numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
class Solution29 {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int answer = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        return answer;
    }
}

//문자열 my_string과 정수 n이 매개변수로 주어질 때,
//my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.
class Solution30 {
    public String solution(String my_string, int n) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                answer += my_string.substring(i, i + 1);
            }
        }
        return answer;
    }
}