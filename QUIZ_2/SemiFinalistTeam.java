package QUIZ_2;

public class SemiFinalistTeam extends Team {
     double base = 27;
     double totalPrize = base;

     SemiFinalistTeam() {

     }

     SemiFinalistTeam(int teamID, String teamName, String coachName) {
          super(teamID, teamName, coachName);
     }

     void calculatePrizeMoney() {
          this.totalPrize += this.base * ((double) 65 / (double) 100);
     }

     void calculatePrizeMoney(double bonus) {
          this.totalPrize += bonus;
     }

     void calculatePrizeMoney(double bonus, double sponsorReward) {
          this.totalPrize += (bonus + sponsorReward);
     }
}
