package programmers.level1;

import java.util.HashMap;
import java.util.Map;

public class No42576 {
    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> map = new HashMap();

        for (String player : participant) {
            map.put(player, map.getOrDefault(player, 0) + 1);
        }
        for (String endPlayer : completion) {
            map.put(endPlayer, map.get(endPlayer) - 1);
        }

        for (String find : map.keySet()) {
            if (map.get(find) != 0) {
                return find;
            }
        }

        return answer;
    }
}
