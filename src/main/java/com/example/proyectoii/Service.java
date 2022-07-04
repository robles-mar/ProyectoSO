/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.example.proyectoii;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Service {

    private static Service uniqueInstance;

    public static Service instance() throws IOException {
        if (uniqueInstance == null) {
            uniqueInstance = new Service();
        }
        return uniqueInstance;
    }

    FileHandler fh;
    
    public Service() throws IOException {
        fh = new FileHandler("D:/newLogs5.log", true);
    }
    
    public void createLog(String info) {

        Logger logger = Logger.getLogger("MyLog");

        try {
            // This block configure the logger with handler and formatter  
            //fh = new FileHandler("D:/logs.txt", true);
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
            // the following statement is used to log any messages  
            logger.info(info);

        } catch (SecurityException e) {
            e.printStackTrace();
        }

    }

}
