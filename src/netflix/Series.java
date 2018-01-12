/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netflix;

/**
 *
 * @author Vulcanus Soft
 */
public class Series extends Producto implements Visualizable{


		private int numTemporada;

		public Series(String titulo, String creador, String genero, String duracion,int numTemporada){
	
			super(titulo,creador,genero,duracion);
			this.numTemporada=numTemporada;
		
		}



		public int getNumTemporada(){
			return numTemporada;

		}
		public void setNumTemporada(int numTemporada){
			this.numTemporada=numTemporada;

		}
                
                @Override
                public void marcarVisto(){
                setVisto("true");
                }

   
                @Override
                 public void esVisto() {
                 
                       String mensaje= "Series "+getTitulo()+" de "+getCreador()+" del genero "+getGenero()+" fue vista";
                        System.out.println(mensaje);  
                 }

 
                @Override
                 public void tiempoVisto() {
                               String mensaje= " y se visualizo "+getTiempoVisto()+" minutos.";
                        System.out.println(mensaje);System.out.println(" ");
                 }
		


	}
