/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cenec
 */
public class PokemonGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables needed to work
        Scanner sc=new Scanner(System.in);
        Connection connection=null;
                try {
             connection=DriverManager.getConnection(
                    "jdbc:mysql://85.214.120.213:3306/pokemonbattle1dam"
                    ,"1dam","1dam");
        } catch (SQLException ex) {
                    System.err.println("La conexion  a bd ha fallado");
        }
        
        String menu="\n\nChoose action by number:"
                +"\n\t0 - Exit game"
                +"\n\t1 - Register new User"
                +"\n\t2 - Login User";
        int action=0;
        do{
            System.out.println(menu);
            action=Integer.parseInt(sc.nextLine());
            switch(action){
                case 0:
                    System.out.println("Bye");
                    break;
                case 1:
                    registerUser(sc,connection);
                    break;
                case 2:
                    loginUser(sc,connection);
                 break;
                default:
                    System.out.println("Invalid option choosen");
                    break;
            }
        }while(action!=0);
    }
    
    public static void registerUser(Scanner sc, Connection c){
        System.out.println("Tell me your username:");
        String username=sc.nextLine();
        System.out.println("Choose your Password:");
        String password=sc.nextLine();
        System.out.println("Choose your genre (m/f)");
        char genreChar=sc.nextLine().charAt(0);
        System.out.println("Tell me about you:");
        String description=sc.nextLine();
        
        //Usar un statement para registrar al usuario
        
    }
    
    public static void loginUser(Scanner sc, Connection c){
        
    }
    
}
