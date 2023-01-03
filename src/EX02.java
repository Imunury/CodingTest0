//정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
class Solution11 {
    public double solution(int[] numbers) {
        double answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
        }
        return answer / numbers.length;
    }
}

//머쓱이네 양꼬치 가게는 10인분을 먹으면 음료수 하나를 서비스로 줍니다.
//양꼬치는 1인분에 12,000원, 음료수는 2,000원입니다.
//정수 n과 k가 매개변수로 주어졌을 때, 양꼬치 n인분과 음료수 k개를 먹었다면
//총얼마를 지불해야 하는지 return 하도록 solution 함수를 완성해보세요.
class Solution12 {
    public int solution(int n, int k) {
        int answer = 0;
        answer = 12000 * n + 2000 * (k - n / 10);
        return answer;
    }
}

//머쓱이는 학교에서 키 순으로 줄을 설 때 몇 번째로 서야 하는지 궁금해졌습니다.
//머쓱이네 반 친구들의 키가 담긴 정수 배열 array와 머쓱이의 키 height가 매개변수로 주어질 때,
//머쓱이보다 키 큰 사람 수를 return 하도록 solution 함수를 완성해보세요.
class Solution13 {
    public int solution(int[] array, int height) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            if (height < array[i]) {
                answer++;
            }
        }
        return answer;
    }
}

//정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때,
//array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.
class Solution14 {
    public int solution(int[] array, int n) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                answer++;
            }
        }
        return answer;
    }
}

//정수가 들어 있는 배열 num_list가 매개변수로 주어집니다.
//num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.
class Solution15 {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int[] array2 = new int[num_list.length];
        for (int i = 0; i < num_list.length; i++) {
            array2[num_list.length - 1 - i] = num_list[i];
        }
        answer = array2;
        return answer;
    }
}

//정수 배열 numbers가 매개변수로 주어집니다.
//numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.
class Solution16 {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }
        answer = numbers;
        return answer;
    }
}

//머쓱이네 피자가게는 피자를 두 조각에서 열 조각까지 원하는 조각 수로 잘라줍니다.
//피자 조각 수 slice와 피자를 먹는 사람의 수 n이 매개변수로 주어질 때, n명의 사람이 최소 한 조각 이상 피자를 먹으려면
//최소 몇 판의 피자를 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
class Solution17 {
    public int solution(int slice, int n) {
        int answer = 0;
        while (true) {
            answer++;
            if (answer * slice >= n) {
                break;
            }
        }
        return answer;
    }
}

//머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다.
//피자를 나눠먹을 사람의 수 n이 주어질 때,
//모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 return 하는 solution 함수를 완성해보세요.
class Solution18 {
    public int solution(int n) {
        int answer = 0;
        while (true) {
            if (answer * 7 < n) {
                answer++;
            } else {
                break;
            }
        }
        return answer;
    }
}

//머쓱이는 추운 날에도 아이스 아메리카노만 마십니다.
//아이스 아메리카노는 한잔에 5,500원입니다.
//머쓱이가 가지고 있는 돈 money가 매개변수로 주어질 때,
//머쓱이가 최대로 마실 수 있는 아메리카노의 잔 수와 남는 돈을 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
class Solution19 {
    public int[] solution(int money) {
        int[] answer = new int[2];
        answer[0] = money / 5500;
        answer[1] = money % 5500;
        return answer;
    }
}

//선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.
//
//가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
//삼각형의 세 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다.
//세 변으로 삼각형을 만들 수 있다면 1, 만들 수 없다면 2를 return하도록 solution 함수를 완성해주세요.
class Solution20 {
    public int solution(int[] sides) {
        int answer = 0;
        if (sides[0] >= sides[1] + sides[2]) {
            answer = 2;
        } else if (sides[1] >= sides[0] + sides[2]) {
            answer = 2;
        } else if (sides[2] >= sides[0] + sides[1]) {
            answer = 2;
        } else {
            answer = 1;
        }
        return answer;
    }
}