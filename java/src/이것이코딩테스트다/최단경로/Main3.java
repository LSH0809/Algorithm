package 이것이코딩테스트다.최단경로;

public class Main3 {

	public static void main(String[] args) {
		String character = "10 5 2";
		String[] monsters = {"Knight 3 10 10 3", "Wizard 5 10 15 1", "Beginner 1 1 15 1"};
		String[] monsters2 = {"1 3 10 10 3", "2 3 10 10 3"};
		System.out.println(solution(character, monsters));
		System.out.println(solution(character, monsters2));

	}

	public static String solution(String character, String[] monsters) {
		int size = monsters.length;
		String[] characterInfo = character.split(" ");
		int characterHealth = Integer.parseInt(characterInfo[0]);
		int characterAttack = Integer.parseInt(characterInfo[1]);
		int characterDefense = Integer.parseInt(characterInfo[2]);
		double maxValue = -1.0;
		int maxExp = 0;
		String answer = "";
		while (--size >= 0) {
			String monster = monsters[size];
			String[] monsterInfo = monster.split(" ");
			String monsterName = monsterInfo[0];
			int monsterExp = Integer.parseInt(monsterInfo[1]);
			int monsterHealth = Integer.parseInt(monsterInfo[2]);
			int monsterAttack = Integer.parseInt(monsterInfo[3]);
			int monsterDefense = Integer.parseInt(monsterInfo[4]);
			int time = 0;

			while (characterHealth > 0) {
				if (characterAttack > monsterDefense) {
					int characterDeal = characterAttack - monsterDefense;
					monsterHealth -= characterDeal;
					time += 1;
					if (monsterHealth <= 0) {
						double expPerTime = (double) monsterExp / time;
						if (maxValue < expPerTime) {
							answer = monsterName;
							maxValue = expPerTime;
							maxExp = monsterExp;
						} else if (maxValue == expPerTime) {
							if (maxExp < monsterExp) {
								answer = monsterName;
								maxValue = expPerTime;
								maxExp = monsterExp;
							}
						}
					}
				} else {
					break;
					// 정상적인 종료 (캐릭터의 공격력이 몬스터의 방어력보다 높을 경우)
				} // 몬스터의 방어력이 캐릭터의 공격력보다 높아서 게임이 끝이 안남
				if (monsterAttack > characterDefense) {
					int monsterDeal = monsterAttack - characterDefense;
					if (characterHealth <= monsterDeal) {
						break;
					} // 정상적인 종료 ( 몬스터의 공격력이 캐릭터의 생명력과 방어력보다 높을 경우
				} // 정상적인 종료 (몬스터의 공격력이 캐릭터의 방어력보다 높을 경우
			}
		}
		return answer;
	}
}
