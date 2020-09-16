/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package From_End;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import java.util.Date;
import java.text.NumberFormat;

/**
 *
 * @author Jeison
 */
@DatabaseTable
public class Gestor {
    @DatabaseField(id = true)
    private  int id;
    @DatabaseField
    private  String transaccion;
    @DatabaseField
    private String fecha;
    @DatabaseField
    private  String categoria;
    @DatabaseField
    private double valor;
    @DatabaseField
    private String detalle;

    public Gestor() {
    }

    public Gestor(int id, String transaccion, String fecha, String categoria, double valor, String detalle) {
        this.id = id;
        this.transaccion = transaccion;
        this.fecha = fecha;
        this.categoria = categoria;
        this.valor = valor;
        this.detalle = detalle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(String transaccion) {
        this.transaccion = transaccion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getValor() {
       
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    @Override
    public String toString() {
        return "Gestor{" + "id=" + id + ", transaccion=" + transaccion + ", fecha=" + fecha + ", categoria=" + categoria + ", valor=" + valor + ", detalle=" + detalle + '}';
    }
    
        
        
      
    
  }
   


   