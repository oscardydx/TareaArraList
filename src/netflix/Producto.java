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
public class Producto{



		private String titulo;
		private String genero;
		private String creador;
		private String duracion;
		private String visto= "false";
                private int tiempoVisto=0;

		public Producto(){}
		
		public Producto(String titulo, String creador, String genero, String duracion){
			this.titulo=titulo;
			this.creador=creador;
                        this.genero=genero;
                        this.duracion=duracion;
			
		}



		public String getTitulo(){
			return titulo;

		}
		public void setTitulo(String titulo){
			this.titulo=titulo;

		}
		public String getGenero(){
			return genero;

		}
		public void setGenero(String genero){
			this.genero=genero;

		}
		
                public String getCreador(){
			return creador;

		}
		public void setCreador(String creador){
			this.creador=creador;
                }
                public String getDuracion(){
			return duracion;
		}
                
		public void setDuracion(String duracion){
			this.duracion=duracion;

		}
                
                 public String getVisto(){
			return visto;
		}
                
		public void setVisto(String visto){
			this.visto=visto;

		}
                
                public int getTiempoVisto(){
			return tiempoVisto;
		}
                
		public void setTiempoVisto(int tiempoVisto){
			this.tiempoVisto=tiempoVisto;

		}

		static void toString(String producto, String titulo, String x){
			String mensaje= "La "+producto+" "+titulo+ x;
			System.out.println(mensaje);
		}

}