package QUIZ_2;

public class ChampionTeam extends Team {
     double base = 42;
     double totalPrize = base;

     ChampionTeam() {
          this(0, "Unknown", "Unknown"); // Constructor chaining
     }

     ChampionTeam(int teamID, String teamName, String coachName) {
          super(teamID, teamName, coachName); // this is also constructor chaining
     }

     void calculatePrizeMoney() {
          this.totalPrize += this.base * (120.0 / 100.0);
     }

     void calculatePrizeMoney(double bonus) {
          this.totalPrize += bonus;
     }

     void calculatePrizeMoney(double bonus, double sponsorReward) {
          this.totalPrize += (bonus + sponsorReward);
     }
}