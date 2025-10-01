import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileInputStream;

class Reading{
    public static void usingFileReader(){
        try(FileReader fr = new FileReader("output.txt");
        BufferedReader br = new BufferedReader(fr)){
            String line;
            while((line = br.readLine())!=null){
                System.out.println(line);
            }
        }
        catch(IOException e){
            System.out.println("An error occurred while reading.");
            e.printStackTrace();
        }
    }
    public static void usingFileInputStream(){
        try(FileInputStream fis = new FileInputStream("newFile.txt")){
            int byteRead;
            while((byteRead=fis.read())!=-1){
                System.out.print((char) byteRead);
            }
        }
        catch(IOException e){
            System.out.println("An error occurred while reading.");
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        usingFileInputStream();
        usingFileReader();
    }
}