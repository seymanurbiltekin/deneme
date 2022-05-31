/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package girisbelgesi;

/**
 *
 * @author NUR
 */
public class main {
    public static void main(String[] args) throws Exception{
        BelgeOlusturucuFacade belgeOlusturFacade = new BelgeOlusturucuFacade();
        belgeOlusturFacade.belgeOlustur(BelgeTipi.PDF, null);
        belgeOlusturFacade.belgeOlustur(BelgeTipi.HTML, null);
    }
}
