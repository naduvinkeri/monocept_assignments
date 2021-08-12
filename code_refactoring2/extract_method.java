import java.util.ArrayList;

public class FootballPlayer40YardDashInfo {
	
	ArrayList<FootballPlayer> players = new ArrayList<FootballPlayer>();
	
	public void addFootballPlayer(FootballPlayer player){
		
		players.add(player);
		
	}
	
	// This method is the focus of the extract method tutorial
	
	public void printPlayerInfo(){
		
		double avg40YdTime = 0.0;
		
		// Prints the titles
		
		printTitles();
		
		printPlayersWith40Avg();
		
	}
	
	public void printTitles(){
		
		System.out.printf("%-15s %15s", "Name", "Avg 40 Time\n");
		
		printDashes('_', 30);
		
	}
	
	public void printDashes(char charToPrint, int howManyTimes){
		
		for(int i = 0; i < howManyTimes; i++){ System.out.print(charToPrint); }
		
		System.out.println();
		
	}
	
	public void printPlayersWith40Avg(){
		
		for(FootballPlayer player : players){
			
			System.out.printf("%-19s", player.getName());
			
			double total40YdDashTimes = 0.0;
			
			double[] fortyYardDashTimes = player.get40YardDashTimes();
			
			for(int i = 0; i < player.get40YardDashTimes().length; i++){
				
				total40YdDashTimes += fortyYardDashTimes[i];
				
			}
			
			double avg40YdTime = total40YdDashTimes / player.get40YardDashTimes().length;
			
			System.out.printf("%1$.2f", avg40YdTime);
			
			
			String inTop15 = (avg40YdTime < 4.41) ? " *Top 15\n" : "\n";
			
			System.out.print(inTop15);
				
		}
		
		
		double dashTime = 4.50;
					
		double avg40YdDash = getAvgDashTime();
					
		String dashGrade = ((dashTime <= avg40YdDash) ? "Good" : "Bad");
					
		System.out.print("That was a " + dashGrade + " time");
		
	}
	
	
	public boolean checkIfInTop15(double avg40YdTime){
		
		return avg40YdTime < 4.41;
		
	}
	
	public static void main(String[] args){
		
		FootballPlayer40YardDashInfo fb40Dash = new FootballPlayer40YardDashInfo();
		
		// Add Clark Kent for example
		
		double cKent40YdDashTimes[] = {4.36, 4.39, 4.41};
		FootballPlayer clarkKent = new FootballPlayer("Clark Kent", cKent40YdDashTimes);
		fb40Dash.addFootballPlayer(clarkKent);
		
		// Add Bruce Wayne for example
		
		double bWayne40YdDashTimes[] = {4.42, 4.43, 4.49};
		FootballPlayer bruceWayne = new FootballPlayer("Bruce Wayne", bWayne40YdDashTimes);
		fb40Dash.addFootballPlayer(bruceWayne);
		
		fb40Dash.printPlayerInfo();
		
	}
	
	public static double getAvgDashTime(double[] dashTimes){
		
		double totalDashTimes = 0.0;
		
		for(int i = 0; i < dashTimes.length; i++){
			totalDashTimes += dashTimes[i];
		}
		return totalDashTimes / dashTimes.length;
		
	}
	
	public static double getAvgDashTime(){
		
		return 4.41;
		
	}

}

