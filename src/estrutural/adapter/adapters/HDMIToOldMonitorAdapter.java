package estrutural.adapter.adapters;

import estrutural.adapter.devices.OldManitor;
import estrutural.adapter.interfaces.HDMI;

// adapter de classe usando herança
public class HDMIToOldMonitorAdapter extends OldManitor implements HDMI {
    public HDMIToOldMonitorAdapter(){
        super();
        System.out.println("Envolvendo o VGA com o adaptador HDMI ...");
    }
    @Override
    public void setSound(String sound) {
        System.out.println("Lamento mas não é possivel transmitir som");
    }
}
