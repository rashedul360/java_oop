package QUIZ_2;

public class RunnerUpTeam extends Team {
     double base = 30;
     double totalPrize = base;

     RunnerUpTeam() {

     }

     RunnerUpTeam(int teamID, String teamName, String coachName) {
          super(teamID, teamName, coachName);
     }

     void calculatePrizeMoney() {
          this.totalPrize += this.base * ((double) 80 / (double) 100);
     }

     void calculatePrizeMoney(double bonus) {
          this.totalPrize += bonus;
     }

     void calculatePrizeMoney(double bonus, double sponsorReward) {
          this.totalPrize += (bonus + sponsorReward);
     }

}
