
package model;

public class Players {
    
    private int playerID;
    private String playerName;
    private int playerAverage;
    private int homeruns;
    private int doubles;
    private int triples; 
    private int playerAge;
    
    
    public Players() {
        this.playerID = 0;
        this.playerName = "";
        this.playerAverage = 0;
        this.homeruns = 0;
        this.doubles = 0;
        this.triples = 0;
        this.playerAge = 0;
    }
    

    public Players(int playerID, String playerName, int playerAverage, int homeruns, int doubles, int triples, int playerAge) {
        this.playerID = playerID;
        this.playerName = playerName;
        this.playerAverage = playerAverage;
        this.homeruns = homeruns;
        this.doubles = doubles;
        this.triples = triples;
        this.playerAge = playerAge;
    }

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerAverage() {
        return playerAverage;
    }

    public void setPlayerAverage(int playerAverage) {
        this.playerAverage = playerAverage;
    }

    public int getHomeruns() {
        return homeruns;
    }

    public void setHomeruns(int homeruns) {
        this.homeruns = homeruns;
    }

    public int getDoubles() {
        return doubles;
    }

    public void setDoubles(int doubles) {
        this.doubles = doubles;
    }

    public int getTriples() {
        return triples;
    }

    public void setTriples(int triples) {
        this.triples = triples;
    }

    public int getPlayerAge() {
        return playerAge;
    }

    public void setPlayerAge(int playerAge) {
        this.playerAge = playerAge;
    }

    @Override
    public String toString() {
        return "Players{" + "playerID=" + playerID + ", playerName=" + playerName + ", playerAverage=" + playerAverage + ", homeruns=" + homeruns + ", doubles=" + doubles + ", triples=" + triples + ", playerAge=" + playerAge + '}';
    }
    