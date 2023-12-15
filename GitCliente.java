/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicas;

/**
 *
 * @author altalopa
 */
public class GitCliente {
    public String toString(){
        return "GitClient(" + "cliente" + cliente + ", version" + version + ", sistemaOper "+ sistemaOper + ", licencia" + licencia + ')';
    }
            
    }
    private String cliente;
    private String version;
    private String sistemaOper;
    private String licencia;
    
    public GitCliente(){
    }
    public String getCliente(){
    return cliente;
    }
    public void setCliente(String cliente){
        this.cliente=cliente;
    }
    public String getVerersion(){
    return version;
    }
    public void setVersion(){
    this.version=version;
    }
    public String getSistemOper(String sistemaOper){
      return sistemaOper;
    }
    public void setSistemaOper(String sistemaOper){
        this.sistemaOper=sistemaOper;
    }
    public String getLicencia(){
        return licencia;
    }
    public void setLicencia(String Licencia){
        this.licencia=licencia;
    }
    
}
