/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collectionsenumshw;

import java.io.FileReader;
import java.util.Scanner;

/**
 *Mission: Create a program that performs read a file, store, 
 * create teams and print the name of the teams without duplicate members in each teams
 * 
 * @author AdeliaAcacio2022203
 */
public class CollectionsEnumsHW {

    /**
     * @param args the command line arguments
     * 
     * GitHub Link: https://github.com/AdeliaAcacio/CollectionsEnumsHW
     */
    
    
    public static void main(String[] args) throws Exception {
        
        System.out.println("The File can note be founded!");
        
        String mockDataFile = "MOCK_DATA.csv";
        int numOfMembers;
        
        
        Scanner mFile = new Scanner(new FileReader(mockDataFile));
        
        //While Loop will check if there is something inside the file
        while (mFile.hasNext()){
            
            String input = mFile.nextLine(); //Reads a line from the mFile
            System.out.println("The data in the file: " + input);//Print the content insed the file
             
            
        }
        System.out.println("Finished to read the file!");//After read all the file this message will be printed
        }
    
    
    
}
