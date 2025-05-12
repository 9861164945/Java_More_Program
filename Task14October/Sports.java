package com.Task14October;

public class Sports {
    private String sportName;
    private int teamSize;
    private String sportType;

    // No-parameter constructor
    public Sports() {
        this.sportName = "";
        this.teamSize = 0;
        this.sportType = "Unknown"; }

    // Constructor with sportName and teamSize
    public Sports(String sportName, int teamSize) {
        this.sportName = sportName;
        setTeamSize(teamSize); // Using setter for validation
        this.sportType = "Unknown"; // Default value for sportType
    }

    // Constructor with sportName, teamSize, and sportType
    public Sports(String sportName, int teamSize, String sportType) {
        this.sportName = sportName;
        setTeamSize(teamSize); // Using setter for validation
        this.sportType = sportType;
    }

    // Setter with validation for teamSize
    public void setTeamSize(int teamSize) {
        if (teamSize > 0) {
            this.teamSize = teamSize;
        } else {
            System.err.println("Error: Team size must be positive.");
            this.teamSize = 0; // Default to 0 if invalid
        }
    }

    // Method to display sports information
    public void displayInfo() {
        if (!sportName.isEmpty()) {
            System.out.println("Sport Name: " + sportName);
        } else {
            System.err.println("Error: Sport name is not provided.");
        }
        
        System.out.println("Team Size: " + teamSize);
        System.out.println("Sport Type: " + sportType);
    }
}
