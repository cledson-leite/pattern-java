package estrutural.adapter;

import estrutural.adapter.adapters.HDMIToOldMonitorAdapter;
import estrutural.adapter.adapters.HDMIToVGAAdapter;
import estrutural.adapter.devices.Computer;
import estrutural.adapter.devices.OldManitor;
import estrutural.adapter.devices.TV;

public class App {
    public static void main(String[] args) {
        Computer pc = new Computer();
        System.out.println("-------- TV --------");
        TV tv = new TV();
        pc.connectingPort(tv);
        pc.sendImageAndSound("Gatos e Cachhorros", "Miaus e Latidos");

        System.out.println("-------- Monitor --------");
        OldManitor monitor = new OldManitor();
        HDMIToVGAAdapter hdmi_to_vga = new HDMIToVGAAdapter(monitor);
        pc.connectingPort(hdmi_to_vga);
        pc.sendImageAndSound("Gatos e Cachhorros", "Miaus e Latidos");

        System.out.println("-------- Monitor Com Adaptador de Classe --------");
        HDMIToOldMonitorAdapter adaptador = new HDMIToOldMonitorAdapter();
        pc.connectingPort(adaptador);
        pc.sendImageAndSound("Gatos e Cachhorros", "Miaus e Latidos");
    }
}
