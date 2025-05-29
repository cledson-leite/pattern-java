package estrutural.adapter.devices;

import estrutural.adapter.interfaces.VGA;

public class OldManitor implements VGA {
    @Override
    public void setImage(String image) {
        System.out.println("Este é a imagem antiga: "+image);
    }
}
