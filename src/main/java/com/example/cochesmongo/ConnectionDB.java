package com.example.cochesmongo;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConnectionDB {

    static Properties properties = new Properties();

    public static MongoClient conectar(){
        try{
            properties.load(new FileInputStream(new File("src/main/resources/configuration/database.properties")));
            String host=String.valueOf(properties.get("host"));
            String port=String.valueOf(properties.get("port"));
            String username=String.valueOf(properties.get("username"));
            String password=String.valueOf(properties.get("password"));

            final MongoClient conexion = new MongoClient(new MongoClientURI("mongodb://" + username + ":" + password + "@" + host + ":" + port + "/?authSource=admin"));
            System.out.println("Conectado a la BD");
            return conexion;
        } catch(Exception ex){
            System.out.println(ex.getMessage());
            return null;
        }
    }

    public static void desconectar(MongoClient con){
        con.close();
    }

}
