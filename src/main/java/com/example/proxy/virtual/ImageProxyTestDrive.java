package com.example.proxy.virtual;

import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.JFrame;

public class ImageProxyTestDrive {

    private URL initialURL;
    private ImageComponent imageComponent;
    private JFrame frame;

    public ImageProxyTestDrive() throws MalformedURLException {
        initialURL = new URL(
                "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1489296223758&di=b1b0771db971c58314a1d41a6d94c351&imgtype=0&src=http%3A%2F%2Fimgsrc.baidu.com%2Fforum%2Fw%3D580%2Fsign%3D1ef79d27881001e94e3c1407880f7b06%2F958591529822720eb1c836347ecb0a46f31fab69.jpg");
        Icon icon = new ImageProxy(initialURL);
        imageComponent = new ImageComponent(icon);
        imageComponent.setSize(300, 300);
        imageComponent.setVisible(true);
        frame = new JFrame("Image Proxy Test Drive");
        frame.getContentPane().add(imageComponent);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }

    public static void main(String[] args) throws MalformedURLException {
        @SuppressWarnings("unused")
        ImageProxyTestDrive testDrive = new ImageProxyTestDrive();
    }

}
