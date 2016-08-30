/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1;

/**
 *
 * @author Estudiante
 */
public class Problema4 {
 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //cavillamizarc@unal.edu.co        
        String EsFr[][]= {{"hola", "bonjour"},
                          {"adios","salut"},{"gracias","merci"},{"como","comment"},{"estas","allez-vouz"},{"bien","bien"},{"te","vous"},
                          {"llamas","appelez-vous"},
                          {"ayuda","au secours"},{"disculpe","pardon"},{"de","de"},{"nada","rien"}};
       
        String EsIt[][]= {{"hola", "boun giorno"},
                          {"adios","ciao"},{"como","come" },{"estas","stai"},{"bien","bene"},{"gracias","grazie"},{"te","ti"},
                          {"llamas","chiami"},{"me","mi"},
                          {"por","per"},{"favor","favore"},{"si","si"},{"no","no"},{"hablas","parli"},{"español","spagnolo"}};
        
        String EsIn[][]= {{"hola", "hello"},{"adios","goodbye"},{"gracias","thank you"},{"disculpe","excuse me"},{"no","not"},
                          {"bien","fine"},{"como","what"},{"te","your"},{"estas","are you"},
                          {"nombre","name"},{"perdon","sorry"},{"ayuda","help"},{"perro","dog"},{"gato","cat"}};
                          
        
        
        String idiomaOrigen;//Indicados por el usuario
        String idiomaDestino;//Indicados por el usuario
        String palabra;//Indicados por el usuario
        
        java.util.Scanner flujo= new java.util.Scanner(System.in);
           System.out.println("ingrese idioma origen: ");
        idiomaOrigen = flujo.next();
           System.out.println("ingrese idioma destino: ");
        idiomaDestino = flujo.next();
         /*  System.out.println("ingrese palabra: ");
        palabra = flujo.next();*/
        
        int p;
        String llenar;
        System.out.println("ingrese cantidad de palabras: ");
            p = flujo.nextInt();
        String[]  fraseEsA = new String[p];
        String[][] diccionario = new String[100][2];
        String traduccion=null; 
        
        if(idiomaOrigen.equals("Espanol")){
            switch(idiomaDestino){
                case "Frances" : {diccionario=EsFr; break;}
                case "Ingles" : {diccionario=EsIn;break;}
                case "Italiano" : {diccionario=EsIt; break;}             
                default: {System.out.println("Salida defecto");break;}
            }
            int k =0;
            
            while( k < fraseEsA.length){ 
                System.out.println("ingrese palabra:");
                palabra=flujo.next();
              for(int i =0 ; i< diccionario.length;i++){
            if (diccionario[i][0].equals(palabra)){
                    traduccion = diccionario[i][1];
                    break;
                }
            if (traduccion==null){
                traduccion = palabra;                
            }
              
            }
            
             fraseEsA[k] = traduccion;
             k++;
            }
            
            for(int l=0; l<fraseEsA.length;l++){
            System.out.print(fraseEsA[l]+"  ");
            
            }
        }
        if(!idiomaOrigen.equals("Espanol")) {
        for(int k =0; k<fraseEsA.length;k++){ 
               System.out.println("ingrese palabra:");
                palabra=flujo.next();
                
          switch(idiomaOrigen){
                case "Frances" : {diccionario=EsFr; break;}
                case "Ingles" : {diccionario=EsIn;break;}
                case "Italiano" : {diccionario=EsIt; break;  }             
                default: {System.out.println("Salida defecto");break;}
            }
           
            
            for(int i =0 ; i< diccionario.length;i++){
                if(diccionario[i][1].equals(palabra)){
                    traduccion = diccionario[i][0];
                    break;
                }
            }
           if(!idiomaDestino.equals("Espanol")){
                switch(idiomaDestino){
                case "Frances" : {diccionario=EsFr; break;}
                case "Ingles" : {diccionario=EsIn;break;}
                case "Italiano" : {diccionario=EsIt; break;  }             
                default: {System.out.println("Salida defecto");break;}
                }
            
            for(int i =0 ; i< diccionario.length;i++){
                if(diccionario[i][0].equals(traduccion)){
                    traduccion = diccionario[i][1];                    
                    break;}
            if(traduccion==null){
                traduccion = palabra;
            }  
            }
           }
           fraseEsA[k]= traduccion;
           }
           for(int l=0; l<fraseEsA.length;l++){
            System.out.print(fraseEsA[l]+" ");
           }
            }        
    } 
}
