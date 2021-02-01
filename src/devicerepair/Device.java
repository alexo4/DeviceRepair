
package devicerepair;


public abstract class Device {
    
    protected String IdentificationCode;
    protected String MakeAndModel;
    protected String Owner;
    protected String ProblemDescription;
    protected String RepairNotes;
    protected int Priority;
    
    

    public Device(String IdentificationCode, String MakeAndModel, String Owner, String ProblemDescription, String RepairNotes, int Priority) {
        this.IdentificationCode = IdentificationCode;
        this.MakeAndModel = MakeAndModel;
        this.Owner = Owner;
        this.ProblemDescription = ProblemDescription;
        this.RepairNotes = RepairNotes;
        this.Priority = Priority;
    }

    public String getIdentificationCode() {
        return IdentificationCode;
    }

    public String getMakeAndModel() {
        return MakeAndModel;
    }

    public String getOwner() {
        return Owner;
    }

    public String getProblemDescription() {
        return ProblemDescription;
    }

    public String getRepairNotes() {
        return RepairNotes;
    }

    public int getPriority() {
        return Priority;
    }

    public void setIdentificationCode(String IdentificationCode) {
        this.IdentificationCode = IdentificationCode;
    }

    public void setMakeAndModel(String MakeAndModel) {
        this.MakeAndModel = MakeAndModel;
    }

    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    public void setProblemDescription(String ProblemDescription) {
        this.ProblemDescription = ProblemDescription;
    }

    public void setRepairNotes(String RepairNotes) {
        this.RepairNotes = RepairNotes;
    }

    public void setPriority(int Priority) {
        this.Priority = Priority;
    }
    
    
    public String toString(){
        return IdentificationCode + ", " + MakeAndModel + ", " + Owner + ", " + ProblemDescription + " " + RepairNotes + ", " + Priority;
    }
    
    abstract int priorityRank();
}
