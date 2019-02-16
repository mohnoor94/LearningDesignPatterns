package _00_solid_design_principles.single_responsibility;

import _util.exception.NotImplementedException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;

public class Persistence {

    public void save (Journal journal, String fileName, boolean overwrite) throws FileNotFoundException {
        if (overwrite || new File(fileName).exists()){
            try (PrintStream out = new PrintStream(fileName)){
                out.println(journal.toString());
            }
        }
    }

    public Journal load (String fileName){
        throw new NotImplementedException();
    }
    public Journal load (URL url){
        throw new NotImplementedException();
    }
}
