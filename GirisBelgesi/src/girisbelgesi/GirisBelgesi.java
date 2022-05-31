/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package girisbelgesi;

/**
 *
 * @author NUR
 */

public class GirisBelgesi {

    private HastaBilgileri hastaBilgisi;
    private ZiyaretciBilgileri ziyaretciBilgisi;
    
    public HastaBilgileri getHastaBilgileri(){
        return hastaBilgisi;
    }
    
    public void setHastaBilgisi(HastaBilgileri hastaBilgisi){
        System.out.println("Hasta bilgi ayarlama");
        this.hastaBilgisi = hastaBilgisi;
    }
    public ZiyaretciBilgileri getZiyaretciBilgileri(){
        return ziyaretciBilgisi;
    }
    public void setZiyaretciBilgisi(ZiyaretciBilgileri ziyaretciBilgisi){
        System.out.println("ziyaretci bilgisi ayarlama");
        this.ziyaretciBilgisi = ziyaretciBilgisi;
    }
}