import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;

class Filecreation{
    public static void main(String[] args){
        try{
            File myFile=new File("newFile.txt");
            if(myFile.createNewFile()){
                System.out.println("New file created");
            }else{
                System.out.println("File already exists");
            }
        }catch (IOException e){
            System.out.println("An error occurred during the file creation");
            e.printStackTrace();
        }
    }
}