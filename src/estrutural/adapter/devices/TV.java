package estrutural.adapter.devices;

import estrutural.adapter.interfaces.HDMI;

public class TV implements HDMI {
    @Override
    public void setImage(String image) {
        System.out.println("Este é a sua imagem: "+image);
    }

    @Override
    public void setSound(String sound) {
        System.out.println("Este é o seu som: "+sound);
    }
}
