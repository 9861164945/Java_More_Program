package com.Task09October;

public class Batter {
  
    public String name;
    public int runs;
    public int matches;
    public float batting_avg;
    public Batter() {
    }

    
    public Batter(String name, int runs, int matches) {
        this.name = name;
        this.runs = runs;
        this.matches = matches;
    }

    
    public void computeBattingAverage() {
    
        if (runs < 0 || matches < 0) {
            System.err.println("Error: Runs and matches must be non-negative.");
        } else if (runs > 0 && matches == 0) {
            System.err.println("Error: Matches must be greater than zero when runs are greater than zero.");
        } else {
            
            this.batting_avg = (float) runs / matches;
            System.out.println("Name: " + this.name);
            System.out.println("Batting_Avg: " + this.batting_avg);
        }
    }

    
    public void getStatistics() {
        
        if (name == null || name=="") {
            System.err.println("Error: Name cannot be empty.");
        } else if (runs < 0 || matches < 0) {
            System.err.println("Error: Runs and matches must be non-negative.");
        } else if (runs > 0 && matches == 0) {
            System.err.println("Error: Matches must be greater than zero when runs are greater than zero.");
        } else {
            
            System.out.println("Name: " + this.name);
            System.out.println("Runs: " + this.runs);
            System.out.println("Matches: " + this.matches);
        }
    }
}
