package com.bmft.demo01;

/**
 * proxy代理
 */
public class Proxy implements Rent{
    private Host host;

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        seeHouse();//
        host.rent();
        contract();
        seeHouse();
    }
    public void seeHouse(){
        System.out.println("proxy--看房");
    }
    public void fare(){
        System.out.println("proxy 收取中介费");
    }
    public void contract(){
        System.out.println("proxy  签合同");
    }
}
