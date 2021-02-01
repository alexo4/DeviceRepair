
package devicerepair;


public class MobilePhone extends Device{
    
    private int priority;

    public MobilePhone(String IdentificationCode, String MakeAndModel, String Owner, String ProblemDescription, String RepairNotes, int Priority) {
        super(IdentificationCode, MakeAndModel, Owner, ProblemDescription, RepairNotes, Priority);
    }
    
    
}
