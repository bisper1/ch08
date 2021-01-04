package ch08;

public class OverWatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player player = new Player();
		Character ch;
		ch = new McCree();
		
		player.cMove(ch);
		player.cStop(ch);
		player.cAttack(ch);
		player.cSkill(ch);
		
		ch = new Genzi();
		
		player.cMove(ch);
		player.cStop(ch);
		player.cSkill(ch);
		player.cAttack(ch);
		
	}

}
