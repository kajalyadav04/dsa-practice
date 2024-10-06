package com.lnct;

import java.util.*;

public class HighestRepeatingStringInStringArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Enter code here

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();

		String[] teams = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.println("enter team name");
			teams[i] = sc.nextLine();
			System.out.println(teams[i]);
		}

//		
		highestRepeatingStringUsingHashMap(n,teams);
	}

	public static void highestRepeatingString(int n, String[] teams) {
		String team1 = "";
		String team2 = "";
		int team1Goals = 0;
		int team2Goals = 0;
		for (String team : teams) {
			if (team1 == "") {
				team1 = team;
				team1Goals++;
			} else if (team2 == "") {
				team2 = team;
				team2Goals++;
			} else if (team1 != "") {
				team1Goals++;
			} else {
				team2Goals++;
			}

		}
		if (team1Goals > team2Goals) {
			System.out.println(team1);
		} else {
			System.out.println(team2);
		}

	}
	public static void highestRepeatingStringUsingHashMap(int n,String[] teams){
        Map<String,Integer> goalsCount= new HashMap<>();
        for(String team:teams){
            goalsCount.put(team, goalsCount.getOrDefault(team,0)+1);
        }
        String winner="";
        int maxGoals=0;
        for(String team:goalsCount.keySet()){
            int goals=goalsCount.get(team);
            if(goals>maxGoals){
                maxGoals=goals;
                winner=team;
            }
        }
        
        System.out.println("win "+winner);
        
    }

}
