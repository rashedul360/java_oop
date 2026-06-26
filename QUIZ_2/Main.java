package QUIZ_2;

public class Main {
     public static void main() {
          ChampionTeam c1 = new ChampionTeam(1, "Argentina", "Lionel Scaloni");
          SemiFinalistTeam c2 = new SemiFinalistTeam(1, "France", "Didier Deschamps");
          c1.calculatePrizeMoney();
          c2.calculatePrizeMoney(20);
          System.out.print(c1.teamID + " " + c1.teamName + " " + c1.coachName + " " + c1.totalPrize + "\n");
          System.out.print(c2.teamID + " " + c2.teamName + " " + c2.coachName + " " + c2.totalPrize + "\n");
     }
}
