
package devicerepair;

public class Component {
    
    
    private String ComponentName;
    private double Cost;

    public Component(String ComponentName, double Cost) {
        this.ComponentName = ComponentName;
        this.Cost = Cost;
    }

    public String getComponentName() {
        return ComponentName;
    }

    public void setComponentName(String ComponentName) {
        this.ComponentName = ComponentName;
    }

    public double getCost() {
        return Cost;
    }

    public void setCost(double Cost) {
        this.Cost = Cost;
    }

    
    
}
