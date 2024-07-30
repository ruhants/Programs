package ScoreCounting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ScoreCard {
	
	public static void main(String[] args) {
		Player p1 = new Player("kl", 24,"batsman");
		Player p2 = new Player("barun", 50,"batsman");
		Player p3 = new Player("dravid", 24,"batsman");
		Player p4 = new Player("aman", 24,"batsman");
		Player p5 = new Player("virat", 100,"batsman");
		Player p6 = new Player("dk", 24,"batsman");
		Player p7 = new Player("yusuf", 24,"batsman");
		Player p8 = new Player("kumble", 24,"batsman");
		Player p9 = new Player("srenath", 24,"bowler");
		Player p10 = new Player("prasad", 24,"bowler");
		Player p11 = new Player("vinay", 24,"bowler");
		
		List<Player> players =new  ArrayList<Player>();
		players.add(p1);
		players.add(p2);
		players.add(p3);
		players.add(p4);
		players.add(p5);
		players.add(p6);
		players.add(p7);
		players.add(p8);
		players.add(p9);
		players.add(p10);
		players.add(p11);
		
		
	    int total =	players.stream().collect(Collectors.summingInt(Player::getScore));
		
		System.out.println(total);
		
		System.out.println("-------------------------------------------");
		
	Map<String, List<Player>>	grpplayers=players.stream().collect(Collectors.groupingBy(Player::getType));
	System.out.println(grpplayers);
		
		
		
	}

}
