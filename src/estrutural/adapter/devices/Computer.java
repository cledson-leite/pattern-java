package estrutural.adapter.devices;

import estrutural.adapter.interfaces.HDMI;

public class Computer {
    private HDMI port;

    public void connectingPort(HDMI screen) {
        System.out.println("Conectando a HDMI....");
        this.port = screen;
    }

    public void sendImageAndSound(String image, String sound){
        if(port == null){
            System.out.println("Conecte sua tela a porta HDMI");
        }else {
            port.setImage(image);
            port.setSound(sound);
        }
    }
}
