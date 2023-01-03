import java.util.Arrays;

//중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다.
//예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다. 정수 배열 array가 매개변수로 주어질 때,
//중앙값을 return 하도록 solution 함수를 완성해보세요.
class Solution31 {
    public int solution(int[] array) {
        Arrays.sort(array);
        int answer = array[(array.length - 1) / 2];
        return answer;
    }
}

//문자열 str1, str2가 매개변수로 주어집니다.
//str1 안에 str2가 있다면 1을 없다면 2를 return하도록 solution 함수를 완성해주세요.
class Solution32 {
    public int solution(String str1, String str2) {
        int answer = 0;
        int num = str1.indexOf(str2);
        if (num == -1) {
            answer = 2;
        } else {
            answer = 1;
        }

        return answer;
    }
}

/*
*
class Solution {
    public int solution(String str1, String str2) {
        return (str1.contains(str2)? 1: 2);
    }
}*/

class Solution33 {
    public int solution(int n) {
        int answer = 0;
        if (n % Math.sqrt(n) == 0) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
}

//순서쌍이란 두 개의 숫자를 순서를 정하여 짝지어 나타낸 쌍으로 (a, b)로 표기합니다.
//자연수 n이 매개변수로 주어질 때 두 숫자의 곱이 n인
//자연수 순서쌍의 개수를 return하도록 solution 함수를 완성해주세요.
class Solution34 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer++;
            }
        }
        return answer;
    }
}

//두 배열이 얼마나 유사한지 확인해보려고 합니다.
//문자열 배열 s1과 s2가 주어질 때
//같은 원소의 개수를 return하도록 solution 함수를 완성해주세요..
class Solution35 {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if (s1[i].equals(s2[j])) {
                    answer++;
                }
            }
        }
        return answer;
    }
}

//정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록
//solution 함수를 완성해주세요.
class Solution36 {
    public int solution(int n) {
        int answer = 0;
        String n2 = String.valueOf(n);
        for (int i = 0; i < n2.length(); i++) {
            answer += Integer.parseInt(n2.substring(i, i + 1));
        }
        return answer;
    }
}

//머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다.
//구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요.
class Solution37 {
    public int solution(int price) {
        int answer = 0;
        if (price >= 100000 && price < 300000) {
            answer = price * 95 / 100;
        } else if (price >= 300000 && price < 500000) {
            answer = price * 90 / 100;
        } else if (price >= 500000) {
            answer = price * 80 / 100;
        } else {
            answer = price;
        }
        return answer;
    }
}

//문자열 my_string이 매개변수로 주어집니다.
//my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
class Solution38 {
    public int solution(String my_string) {
        int answer = 0;
        String num = my_string.replaceAll("[^0-9]", "");
        for (int i = 0; i < num.length(); i++) {
            answer += Integer.parseInt(num.substring(i, i + 1));
        }
        return answer;
    }
}

//영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다.
//문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
class Solution39 {
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            String str = my_string.substring(i, i + 1);
            if (str.equals("a") || str.equals("e") || str.equals("i") || str.equals("o") || str.equals("u")) {
                str = "";
            }
            answer += str;
        }
        return answer;
    }
}

//개미 군단이 사냥을 나가려고 합니다.
//개미군단은 사냥감의 체력에 딱 맞는 병력을 데리고 나가려고 합니다.
//장군개미는 5의 공격력을, 병정개미는 3의 공격력을 일개미는 1의 공격력을 가지고 있습니다.
//예를 들어 체력 23의 여치를 사냥하려고 할 때, 일개미 23마리를 데리고 가도 되지만,
//장군개미 네 마리와 병정개미 한 마리를 데리고 간다면 더 적은 병력으로 사냥할 수 있습니다.
//사냥감의 체력 hp가 매개변수로 주어질 때, 사냥감의 체력에 딱 맞게 최소한의 병력을 구성하려면
//몇 마리의 개미가 필요한지를 return하도록 solution 함수를 완성해주세요.
class Solution40 {
    public int solution(int hp) {
        int a = hp / 5; // 장군
        int b = hp % 5 / 3; // 병정
        int c = hp % 5 % 3; // 일
        return a + b + c;
    }
}