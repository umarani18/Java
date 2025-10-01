import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileOutputStream;

public class Writing{
    public static void usingFileWriter(){
        try(FileWriter fw = new FileWriter("newFile.txt");
        BufferedWriter bf = new BufferedWriter(fw)){
            bf.write("Hello java");
            bf.newLine();
            bf.write("This is a test file");
            System.out.println("Successfully wrote on file");
        }
        catch(IOException e){
            System.out.println("An error occured while writing");
            e.printStackTrace();
        }
    }
    public static void usingFileOutputStream(){
        String content="This is some conent in the new file";
        try(FileOutputStream fos=new FileOutputStream("output.txt")){
            fos.write(content.getBytes());
            System.out.println("Successfully written in file");
        }
        catch(IOException e){
            System.out.println("An error occured while writing");
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        usingFileOutputStream();
        usingFileWriter();
    }
}