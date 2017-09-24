/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fileinterleavetryresources;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author GENE
 */
public class LineSequentialTryResource {
    
    static ArrayList<String> readAll(String inFile) 
    {
        String inputLine = "";
        ArrayList<String> inputLines = new ArrayList <String> ();
        try (BufferedReader readFile = new BufferedReader(new FileReader(inFile)))
        {
            while((inputLine = readFile.readLine()) != null)
                    {
                        inputLines.add(inputLine);
                    }
        }
        catch(IOException e) 
        {
            System.out.println("IO Error" + e.getMessage());
        }
        return inputLines;
    }
    
    static void writeAll(String outFile, ArrayList<String> outputLines)
    {
        try (PrintWriter writeFile = new PrintWriter(
        new BufferedWriter(new FileWriter(outFile))))
        {
            for(int i = 0; i < outputLines.size(); i++)
            {
                writeFile.println(outputLines.get(i));
            }
        }
        catch(IOException e) 
        {
            System.out.println("IO Error" + e.getMessage());
        }
    }
}
