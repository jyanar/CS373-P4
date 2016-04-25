package cs373.p4.builder;

public interface ISpaceship {
    
    public void setId(String id);
    public String getId();
    public void setCockPit(String cockPit);
    public String getCockPit();
    public void setBody(String body);
    public String getBody();
    public void setLeftWing(String leftWing);
    public String getLeftWing();
    public void setRightWing(String rightWing);
    public String getRightWing();
    public void setOccupancy(int occupancy);
    public int getOccupancy();
    public void setEngine(String engine);
    public String getEngine();
    
}