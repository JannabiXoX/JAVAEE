package com.rent;

public class Proxy implements Rent {

    private Host host;

    public void proxy(){

    }

    public Proxy(Host host){
        this.host = host;
    }


    @Override
    public void rent() {
        seeHouse();
        host.rent();
    }

    public void seeHouse(){
        System.out.println("中介带你看房子");
    }
}
