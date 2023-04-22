/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto3;

/**
 *
 * @author User
 */
public class Objetogeografico {
    protected String nombrecuerpodeagua;
    protected String municipio;
    protected String tipocuerpoagua;
    protected String tipoagua;
    protected int id;
    protected float irca;

    public Objetogeografico() {
    }

    public Objetogeografico(String nombrecuerpodeagua, String municipio, String tipocuerpoagua, String tipoagua, int id, float irca) {
        this.nombrecuerpodeagua = nombrecuerpodeagua;
        this.municipio = municipio;
        this.tipocuerpoagua = tipocuerpoagua;
        this.tipoagua = tipoagua;
        this.id = id;
        this.irca = irca;
    }
    
}
