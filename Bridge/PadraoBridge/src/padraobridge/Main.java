/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraobridge;

/**
 *
 * @author ana
 */
public class Main {
public static void main(String[] args) {
    Object o = new Object();
    
    PersistenciaDeDados implementor = null;
    
    if(databaseDriverExists()){
        implementor = new DataBase();
    }
    else{
        implementor = new FileSystem();
    }
    
    Persistencia persistenceAPI = new ImplementacaoPersistencia(implementor);
    
    persistenceAPI.salvar(o);
    
    }

    private static boolean databaseDriverExists() {
        return false;
    }
}