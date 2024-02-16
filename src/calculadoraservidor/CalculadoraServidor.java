/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoraservidor;

import java.io.IOException;

/**
 *
 * @author postgres
 */
public class CalculadoraServidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Methods servidor = new Methods();
        try {
            // Wait for connection from a client
           servidor.waitingConnection();

            // Send possibilities of operations to the client
            servidor.sendPosibilityOperations();

            // Get the selected operation from the client
            servidor.getOperando();

            // Get numbers from the client
            servidor.getNumbers();

            // Perform the calculation and send the result back to the client
            servidor.sendCalculation();

            // Get continuation status from the client
            boolean isContinue = servidor.getContinuation();

            // Handle continuation based on the received status
            if (isContinue) {
                // Add logic for continuing the operation
                // For example, you can call serverMethods.getOperando(), serverMethods.getNumbers(), etc.
            } else {
                System.out.println("Operation completed. Server shutting down.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
