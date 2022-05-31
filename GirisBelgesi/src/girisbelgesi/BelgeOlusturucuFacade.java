/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package girisbelgesi;

/**
 *
 * @author NUR
 */
//import javax.activation.DataSource;
public class BelgeOlusturucuFacade {
     public static void belgeOlustur(BelgeTipi tip, String yer){
         GirisBelgesi belge = new GirisBelgesi();
         belge.setHastaBilgisi(new HastaBilgileri());
         belge.setZiyaretciBilgisi(new ZiyaretciBilgileri());
         BelgeYazdir yazdir = new BelgeYazdir();
         switch(tip){
             case HTML :
                 yazdir.yazdirHtmlBelge(belge, yer);
                 break;
             case PDF:
                 yazdir.yazdirPdfBelge(belge, yer);
                 break;
         }
     }
}
