package estrutural.adapter.adapters;

import estrutural.adapter.interfaces.HDMI;
import estrutural.adapter.interfaces.VGA;

//adaptador de objetos usando composição
public class HDMIToVGAAdapter implements HDMI {
    private VGA vga;

    public  HDMIToVGAAdapter(VGA vga){
        System.out.println("Conectando ao adaptador HDMI/VGA....");
        this.vga = vga;
    }
    @Override
    public void setImage(String image) {
        vga.setImage(image);
    }

    @Override
    public void setSound(String sound) {
        System.out.println("Lamento mas não é possivel transmitir som");
    }
}
