
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dalvan
 */
public class Lista {

	private static List<Familia> familias = new ArrayList<Familia>();
        
        public static void adiciona(Familia nova){
           familias.add(nova);
        }
        public static String listar(){
            String a="";
            for(int i=0; i < familias.size();i++){
               a = a + (i + " - " + "nome: "+familias.get(i).membro.nome + " "+ "cpf: "+familias.get(i).membro.cpf + "\n\n");
            } 
            return a;
        }
}
