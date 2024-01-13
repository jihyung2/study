package 객체지향기법의활용;

public class Main {
    public static void main(String[] args){
        //게임 캐릭터들을 담을 수 있는 배열을 만들고 각각의 직업 이름으로 인스턴스 초기화
        Hero[] heros = new Hero[3];
        heros[0] = new Warrior("전사");
        heros[1] = new Acher("궁수");
        heros[2] = new Wizard("마법사");

        for(int i = 0 ; i<heros.length; i++){
            heros[i].HeroSkill();

            if (heros[i] instanceof Warrior){
                Warrior temp = (Warrior) heros[i];
                temp.WarriorSkill();
            }
            if (heros[i] instanceof Acher){
                Acher temp = (Acher) heros[i];
                temp.AcherSkill();
            }
            if (heros[i] instanceof Wizard){
                Wizard temp = (Wizard) heros[i];
                temp.WizardSkill();
            }
        }
    }
}
