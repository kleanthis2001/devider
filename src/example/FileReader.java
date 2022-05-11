/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author fanis
 */
public class FileReader {
    private FileInputStream inputStream;
    private BufferedReader r;

    public FileReader() {
        try {
            
            //ston constructor tou FileInputStream bazoume to path tou arxeiou
            inputStream = new FileInputStream("products.txt");
            r = new BufferedReader(new InputStreamReader(inputStream));
            
            int counter = 1;
            
            //ftiaxnoume mia epanalipsi oste na diabazoume to arxeio grammi grammi
            while (true) {
                //diavazoume se kathe epanalipsi tin grammi
                String line = r.readLine();

                //an ftasoume sto telos tou arxeiou i grammi mas tha einai null
                //opote teleionoume tin epanalipsi me to break
                if (line == null) {
                    break;
                }

                //xorizoume to String tis grammis analoga me ton xaraktira pou theloume
                //sto arxeio pou tha anaktisoume einai xorismeno se tab opote xrisimopoioume 
                //ton oro tab ("\t")
                String[] stringArr = line.split("\t");
                //stin paradeigma auto to stringArr[0] tha einai to id
                //to stringArr[1] tha einai i perigrafi
                //kai to string[2] tha einai i timi
                
                System.out.println("Stoixeia gia to "+counter+" proion");
                System.out.println("ID "+Integer.parseInt(stringArr[0]));
                System.out.println("Description "+stringArr[1]);
                System.out.println("Price "+Double.parseDouble(stringArr[0]));
                System.out.println("");
                counter++;
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
