
import utfpr.ct.dainf.if62c.pratica.Circulo;
import utfpr.ct.dainf.if62c.pratica.Elipse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author davip_000
 */
public class Pratica42 {
    public static void main(String[] args) {
        Elipse e = new Elipse(6,8);
        Circulo c = new Circulo(10);
        System.out.println("Área da Elipse: " + e.getArea());
        System.out.println("Área do Círculo: " + c.getArea());
        System.out.println("Perímetro da Elipse: " + e.getPerimetro());
        System.out.println("Perímetro do Círculo: " + c.getPerimetro());

    }
}
