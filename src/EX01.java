//정수 num1, num2가 매개변수로 주어질 때, num1을 num2로 나눈 몫을 return 하도록 solution 함수를 완성해주세요.
class Solution1 {
    public int solution(int num1, int num2) {
        int answer = num1 / num2;
        return answer;
    }
}


//정수 num1과 num2가 주어질 때, num1에서 num2를 뺀 값을 return하도록 soltuion 함수를 완성해주세요.
class Solution2 {
    public int solution(int num1, int num2) {
        int answer = num1 - num2;
        return answer;
    }
}


//정수 num1, num2가 매개변수 주어집니다. num1과 num2를 곱한 값을 return 하도록 solution 함수를 완성해주세요.
class Solution3 {
    public int solution(int num1, int num2) {
        int answer = num1 * num2;
        return answer;
    }
}


//정수 num1, num2가 매개변수로 주어질 때, num1을 num2로 나눈 몫을 return 하도록 solution 함수를 완성해주세요.
class Solution4 {
    public int solution(int num1, int num2) {
        int answer = num1 / num2;
        return answer;
    }
}


//머쓱이는 40살인 선생님이 몇 년도에 태어났는지 궁금해졌습니다. 나이 age가 주어질 때, 2022년을 기준 출생 연도를 return 하는 solution 함수를 완성해주세요.
class Solution5 {
    public int solution(int age) {
        int answer = 2023 - age;
        return answer;
    }
}


//정수 num1과 num2가 주어질 때, num1과 num2의 합을 return하도록 soltuion 함수를 완성해주세요.
class Solution6 {
    public int solution(int num1, int num2) {
        int answer = num1 + num2;
        return answer;
    }
}

//정수 num1과 num2가 매개변수로 주어집니다. 두 수가 같으면 1 다르면 -1을 retrun하도록 solution 함수를 완성해주세요.
class Solution7 {
    public int solution(int num1, int num2) {
        int answer = 0;
        if (num1 == num2) {
            answer = 1;
        } else {
            answer = -1;
        }
        return answer;
    }
}

//각에서 0도 초과 90도 미만은 예각, 90도는 직각, 90도 초과 180도 미만은 둔각 180도는 평각으로 분류합니다. 각 angle이 매개변수로 주어질 때 예각일 때 1, 직각일 때 2, 둔각일 때 3, 평각일 때 4를 return하도록 solution 함수를 완성해주세요.
//
//예각 : 0 < angle < 90
//직각 : angle = 90
//둔각 : 90 < angle < 180
//평각 : angle = 180
class Solution8 {
    public int solution(int angle) {
        int answer = 0;
        if (angle < 90) {
            answer = 1;
        } else if (angle == 90) {
            answer = 2;
        } else if (angle > 90 && angle < 180) {
            answer = 3;
        } else if (angle == 180) {
            answer = 4;
        }
        return answer;
    }
}

//정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 soltuion 함수를 완성해주세요.
class Solution9 {
    public int solution(int num1, int num2) {
        int answer = num1*1000/num2;
        return answer;
    }
}

//정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.
class Solution10 {
    public int solution(int n) {
        int answer = 0;
        for(int i = 2 ; i<=n ; i++){
            if(i%2==0){
                answer += i;
            }
        }
        return answer;
    }
}
