//어떤 세균은 1시간에 두배만큼 증식한다고 합니다.
//처음 세균의 마리수 n과 경과한 시간 t가 매개변수로 주어질 때
//t시간 후 세균의 수를 return하도록 solution 함수를 완성해주세요.


import java.util.Scanner;

class Solution41 {
    public int solution(int n, int t) {
        int answer = n;
        for (int i = 0; i < t; i++) {
            answer = answer * 2;
        }
        return answer;
    }
}

//문자열 my_string이 매개변수로 주어질 때,
//대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution 함수를 완성해주세요.
class Solution42 {
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if (65 <= ch && ch <= 90) {
                answer += String.valueOf(ch).toLowerCase();
            } else {
                answer += String.valueOf(ch).toUpperCase();
            }
        }
        return answer;
    }
}

//"*"의 높이와 너비를 1이라고 했을 때, "*"을 이용해 직각 이등변 삼각형을 그리려고합니다.
//정수 n 이 주어지면 높이와 너비가 n 인 직각 이등변 삼각형을 출력하도록 코드를 작성해보세요.


class Solution43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.println("*");
            }
            System.out.println("");
        }
    }
}

//군 전략가 머쓱이는 전쟁 중 적군이 다음과 같은 암호 체계를 사용한다는 것을 알아냈습니다.
//
//암호화된 문자열 cipher를 주고받습니다.
//그 문자열에서 code의 배수 번째 글자만 진짜 암호입니다.
//문자열 cipher와 정수 code가 매개변수로 주어질 때 해독된 암호 문자열을 return하도록 solution 함수를 완성해주세요.
class Solution44 {
    public String solution(String cipher, int code) {
        String answer = "";
        for (int i = 1; i < cipher.length() + 1; i++) {
            if (i % code == 0) {
                answer += cipher.substring(i - 1, i);
            }
        }
        return answer;
    }
}