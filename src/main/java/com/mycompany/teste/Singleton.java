package com.mycompany.teste;

public class Singleton {
    private static volatile Singleton instance;
    private String data;
    
    private Singleton(String data){
        this.data = data;
    }
    //criou a instancia privada
    public static Singleton getInstance(String data){
        
    
        synchronized (Singleton.class){
            if(instance == null) {
                instance = new Singleton(data);
            }
            //instanciou e verificou se está sendo usada.
                
            }
            
    return instance;   
    //retornou a instancia
            }

    
            }

