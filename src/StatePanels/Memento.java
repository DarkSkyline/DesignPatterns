package StatePanels;

import java.util.HashMap;

public class Memento {
    private boolean state;
    public HashMap<String, Boolean> panelList;

    public Memento(HashMap<String, Boolean> panelNames) {
        this.panelList = new HashMap<>(panelNames);
    }

    public HashMap<String, Boolean> getState() {
        return this.panelList;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
