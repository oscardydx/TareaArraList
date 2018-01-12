
package netflix;

import java.util.ArrayList;

/**
 *
 * @author Vulcanus Soft
 */
public class Netflix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        ArrayList<Pelicula> listaPeliculas= new ArrayList<>();
        ArrayList<Series> listaSeries=new ArrayList<>();
        
      
        listaPeliculas.add(new Pelicula("Iron man","Marvel","Accion",2016,"135"));
        listaPeliculas.add(new Pelicula("Superman","DC","Accion/ficcion",2013,"120"));
        listaPeliculas.add(new Pelicula("Batman","DC","Accion/ficcion",2012,"110"));
        listaPeliculas.add(new Pelicula("Vengadores","Marvel","Accion",2017,"120"));
        listaPeliculas.add(new Pelicula("Star Wars","Lucas Film","Ficcion",2018,"140"));
        
        
        
        listaSeries.add(new Series("Narcos","Netflix","Accion","40",2));
        listaSeries.add(new Series("The big bang theory","Warner","Comedia","25",10));
        listaSeries.add(new Series("Punisher","Marvel","Accion","40",1));
        listaSeries.add(new Series("Vikings","History Channel","Accion","48",4));
        listaSeries.add(new Series("Game of throne","HBO","Fantasia","50",5));
        
        listaSeries.get(4).marcarVisto();
        listaSeries.get(4).setTiempoVisto(50);
        listaSeries.get(0).marcarVisto();
        listaSeries.get(0).setTiempoVisto(35);
        
       
       listaPeliculas.get(3).marcarVisto();
       listaPeliculas.get(3).setTiempoVisto(120);
       listaPeliculas.get(0).marcarVisto();
       listaPeliculas.get(0).setTiempoVisto(40);
      
            System.out.println("Lista de Series y Peliculas vistas en Netflix");System.out.println(" ");
      for (int x=0;x<listaPeliculas.size();x++){
          
         if(listaPeliculas.get(x).getVisto()=="true"){
             listaPeliculas.get(x).esVisto();
             listaPeliculas.get(x).tiempoVisto();
         }
  }
          for (int x=0;x<listaSeries.size();x++){
          
         if(listaSeries.get(x).getVisto()=="true"){
             listaSeries.get(x).esVisto();listaSeries.get(x).tiempoVisto();
         }
  }
        
             int z=0;
        String pe = null;
       
             
        for (int x=0;x<listaPeliculas.size();x++){
          int w=listaPeliculas.get(x).getAno();
       
         if(w>z){
             z=w;
             pe=listaPeliculas.get(x).getTitulo();
         }
  }
        
       Producto.toString("Pelicula",pe," es mas reciente");
       
                    z=0;
        pe = null;
       
             
        for (int x=0;x<listaSeries.size();x++){
          int w=listaSeries.get(x).getNumTemporada();
       
         if(w>z){
             z=w;
             pe=listaSeries.get(x).getTitulo();
         }
  }
        
       Producto.toString("Series",pe," es la que tiene mas temporadas");
        }catch (Exception e){
        
            System.out.println("Se genero un error, por favor habla con el administrador del sistema");}
    }
    
}
