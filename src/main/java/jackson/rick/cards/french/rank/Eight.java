package jackson.rick.cards.french.rank;

/**
 * Created by rickjackson on 2/4/17.
 */
class Eight implements Rank {
    private String rank;
    private String index;
    private String type;
    private int highValue;
    private int lowValue;
    
    Eight() {
        this.rank = "Eight";
        this.index = "8";
        this.type = "Pip";
        this.highValue = 8;
        this.lowValue = 8;
    }
    
    public String toString() {
        return this.rank;
    }
    
    public String getIndex() {
        return this.index;
    }
    
    public String getType() {
        return this.type;
    }
    
    public int getHighValue() {
        return this.highValue;
    }
    
    public int getLowValue() {
        return this.lowValue;
    }
    
    public void setRank(String rank) {
        this.rank = rank;
    }
    
    public void setIndex(String index) {
        this.index = index;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public void setHighValue(int highValue) {
        this.highValue = highValue;
    }
    
    public void setLowValue(int lowValue) {
        this.lowValue = lowValue;
    }
    
    public void setValues(int highValue, int lowValue) {
        setHighValue(highValue);
        setLowValue(lowValue);
    }
    
    public void restoreDefaults() {
        this.rank = "Eight";
        this.index = "8";
        this.type = "Pip";
        this.highValue = 8;
        this.lowValue = 8;
    }
}
