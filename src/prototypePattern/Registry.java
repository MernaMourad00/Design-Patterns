package prototypePattern;

import java.util.HashMap;

public class Registry {

    private HashMap<String,Device> registry;

    public Registry() {
        this.registry = new HashMap<>();
        initialize();
    }

    public void initialize(){
        registry.put("tablet",
                new Tablet("dell",2,5,7,8));
        registry.put("laptop",
                new Laptop("hp",16,10,8,2,"qwert"));
    }

    public Device getClone(String deviceType){
        Device device=null;
        return registry.get(deviceType).clone();
    }
}
