package justynachrustna.solarsystem;

import java.io.Serializable;

/**
 * Created by Justyna on 17.04.2017.
 */

public class SolarObject implements Serializable{

    private String name;

    public SolarObject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
