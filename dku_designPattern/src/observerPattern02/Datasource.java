package observerPattern02;

import java.util.ArrayList;

public class Datasource {

    private ArrayList<Display> displays = new ArrayList<>();

    public void attach(Display display){
        this.displays.add(display);
    }

    public void detach(Display display){
        this.displays.remove(display);
    }

    public void myNotify(){
        for (Display display : displays) {
            display.update();
        }
    }
}
