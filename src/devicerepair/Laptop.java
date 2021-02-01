
package devicerepair;

import java.util.ArrayList;


public class Laptop extends Device implements recyclable, chargabelRepair{
    
    private ArrayList<Component> Components = new ArrayList<>();
    private int priority;
    
    public Laptop(int priority, String IdentificationCode, String MakeAndModel, String Owner, String ProblemDescription, String RepairNotes, int Priority) {
        super(IdentificationCode, MakeAndModel, Owner, ProblemDescription, RepairNotes, Priority);
        this.priority = priority;
    }

    public ArrayList<Component> getComponents() {
        return Components;
    }
    
    public void addComponent(Component component){
        Components.add(component);
    }
    
    public void deleteComponent(int index){
        if(index >= 0 && index < Components.size()){
            Components.remove(index);
        }
        
    }

    @Override
    int priorityRank() {
        return priority;
    }

    @Override
    public ArrayList<Component> isRecyclable() {
        return Components;
    }
    
    @Override
    public boolean isChargable(){
        return true;
    }
}
