package assignments;

public class Bowler {
	
	  String  name;
	  int wickets,matches,runsConceded,ballsBowled;
	  public Bowler() {
	    this.name = "";
	    this.wickets = 0;
	    this.matches = 0;
	    this.ballsBowled = 0;
	    this.runsConceded = 0;
	  }
	  public Bowler(String name,int wickets,int matches,int ballsBowled,int runsConceded) {
	    this.name=name;
	    this.wickets=wickets;
	    this.matches=matches;
	    this.ballsBowled=ballsBowled;
	    this.runsConceded=runsConceded;
	  }
	  public void computeBowlingAverage() {
	    if (wickets < 0  ||matches < 0 || ballsBowled < 0 || runsConceded < 0) {
	      System.out.println("Error");
	      return;
	      }
	      if (matches == 0 && (ballsBowled > 0 || runsConceded > 0)) {
	      System.out.println("Error");
	      return;
	      }
	      float bowling_avg = (float)runsConceded / wickets;
	      System.out.println("Name: " + name+"\nbowling_avg= " + bowling_avg);
	  }
	  public void showStatics() {
	    System.out.println("Bowler[Name= "+name+", wickets="+ wickets+", matches="+matches+", balls bowled="+ballsBowled+", runs conceded="+runsConceded+"]");
	  }
	  public void computeStrikeRate() {
	    if (wickets < 0  ||matches < 0 || ballsBowled < 0  ||runsConceded < 0) {
	      System.out.println("Error");
	      return;
	      }
	      if (matches == 0 && (ballsBowled > 0 || runsConceded > 0)) {
	      System.out.println("Error");
	      return;
	      }
	      float Strike_rate = (float)runsConceded / ballsBowled;
	      System.out.println("Name: " + name+"\nStrike_rate= " + Strike_rate);
	  }

	}


	