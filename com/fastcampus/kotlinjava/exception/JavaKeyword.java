package com.fastcampus.kotlinjava.exception;

import java.io.InputStream;

public class JavaKeyword {

    private InputStream in;

    private boolean is;

    public InputStream getIn() {
        return in;
    }
    public void setIn(InputStream in) {
        this.in = in;
    }
    public boolean getIs() {
        return is;
    }
    public void setIs(boolean is) {
        this.is = is;
    }
}

enum CountryCodeJava {
    kr, jp, us;
}

