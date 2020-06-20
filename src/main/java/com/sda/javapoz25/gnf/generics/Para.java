package com.sda.javapoz25.gnf.generics;

// T - Type
// K - Key
// V - Value
// E - Element
//
public class Para<L, R> {
    private L lewa;
    private R prawa;

    public Para(L lewa, R prawa) {
        this.lewa = lewa;
        this.prawa = prawa;
    }

    public L getLewa() {
        return lewa;
    }

    public void setLewa(L lewa) {
        this.lewa = lewa;
    }

    public R getPrawa() {
        return prawa;
    }

    public void setPrawa(R prawa) {
        this.prawa = prawa;
    }
}
