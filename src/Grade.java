public class Grade {
    private int value;
    private OccupationalGroup occupationalGroup;

    public Grade(int value, OccupationalGroup occupationalGroup) {
        this.value = value;
        this.occupationalGroup = occupationalGroup;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public OccupationalGroup getOccupationalGroup() {
        return occupationalGroup;
    }

    public void setOccupationalGroup(OccupationalGroup occupationalGroup) {
        this.occupationalGroup = occupationalGroup;
    }
}
