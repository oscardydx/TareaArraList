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
public class Pelicula  extends Producto implements Visualizable{


		
		
		private int ano;

		
		public Pelicula(String titulo, String creador, String genero,int ano, String duracion){
			super(titulo,creador,genero,duracion);
		
			this.ano=ano;
	
		
		}


		public int getAno(){
			return ano;

		}
		public void setAno(int ano){
			this.ano=ano;

		}

 
                @Override
                 public void marcarVisto() {
                    setVisto("true"); }

    
                @Override
                  public void esVisto() {
                       String mensaje= "Pelicula "+getTitulo()+" de "+getCreador()+" del genero "+getGenero()+ " fue vista";
                        System.out.println(mensaje);  }

                @Override
                  public void tiempoVisto() {
                        String mensaje= " y se visualizo "+getTiempoVisto()+" minutos.";
                        System.out.println(mensaje);System.out.println(" ");
                      
                  }
			



	}
