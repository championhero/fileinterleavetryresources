/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileinterleavetryresources;

import java.util.ArrayList;

/**
 *
 * @author GENE
 */
public class FileInterLeaveTryResources {
    
    public static void main(String[] args) {
        String inFile1 = "E:/yao/classwork/fileinterleavetryresources/PayrollMasterA.DAT";
        String inFile2 = "E:/yao/classwork/fileinterleavetryresources/PayrollMasterB.DAT";
        String outFile = "E:/yao/classwork/fileinterleavetryresources/PayrollListing.DAT";
        
        ArrayList<String> inputLines1 = LineSequentialTryResource.readAll(inFile1);
        ArrayList<String> inputLines2 = LineSequentialTryResource.readAll(inFile2);
        ArrayList<String> outputLines = new ArrayList<String>();
        
        for(int i = 0; i < inputLines1.size(); i++) 
        {
            outputLines.add(inputLines1.get(i));
            outputLines.add(inputLines2.get(i));
        }
        
        LineSequentialTryResource.writeAll(outFile, outputLines);
        
        System.out.println("File Complete");
    }
    
}
