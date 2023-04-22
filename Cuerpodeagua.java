/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto3;

/**
 *
 * @author User
 */
public class Cuerpodeagua extends Objetogeografico{
    private static int contador;
    
    public Cuerpodeagua() {
    }
    
    public Cuerpodeagua(String nombrecuerpodeagua, String municipio, String tipocuerpoagua, String tipoagua, int id, float irca) {
        super(nombrecuerpodeagua, municipio, tipocuerpoagua, tipoagua, id, irca);
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Cuerpodeagua.contador = contador;
    }

    public String getNombrecuerpodeagua() {
        return nombrecuerpodeagua;
    }

    public void setNombrecuerpodeagua(String nombrecuerpodeagua) {
        this.nombrecuerpodeagua = nombrecuerpodeagua;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getTipocuerpoagua() {
        return tipocuerpoagua;
    }

    public void setTipocuerpoagua(String tipocuerpoagua) {
        this.tipocuerpoagua = tipocuerpoagua;
    }

    public String getTipoagua() {
        return tipoagua;
    }

    public void setTipoagua(String tipoagua) {
        this.tipoagua = tipoagua;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getIrca() {
        return irca;
    }

    public void setIrca(float irca) {
        this.irca = irca;
    }
    
    public String NivelIRCA(){
        String nivel=""; //inicializa la variable
        
        if (irca>=0&&irca<=5) {
            nivel="SIN RIESGO";
            contador++;
        } else if (irca>5&&irca<=14) {
            nivel="BAJO";
            contador++;
        } else if (irca>14&&irca<=35) {
            nivel="MEDIO";
            contador++;
        } else if (irca>35&&irca<=80) {
            nivel="ALTO";
            contador++;
        } else if (irca>80&&irca<=100) {
            nivel="INVIABLE SANITARIAMENTE";
            contador++;
        }
        return nivel;    // necesita retornal algo ya que no es vacio; se necesita definir operaciones
    }   
}
