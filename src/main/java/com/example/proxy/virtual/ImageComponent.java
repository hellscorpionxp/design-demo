package com.example.proxy.virtual;

import java.awt.Component;

import javax.swing.Icon;

public class ImageComponent extends Component {

    private static final long serialVersionUID = 1L;
    private Icon icon;

    public ImageComponent(Icon icon) {
        this.icon = icon;
    }

    public Icon getIcon() {
        return icon;
    }

}
