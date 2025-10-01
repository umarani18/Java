import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;
class Copyfile{
    public static void usingStreams(File f1, File f2) throws IOException{
        InputStream is=null;
        OutputStream os=null;
        try{
            is = new FileInputStream(f1);
            os = new FileOutputStream(f2);
            byte[] buffer = new byte[1024];
            int length;
            while((length=is.read(buffer))>0){
                os.write(buffer,0,length);
            }
        }
        finally{
            if(is!=null) is.close();
            if(os!=null) os.close();
        }
    }
    public static void main(String[] args){
        File f1=new File("output.txt");
        File f2=new File("destination.txt");
        try{    
            usingStreams(f1,f2);
            System.out.println("File copied successfully!");
        }
        catch (IOException e) {
            System.err.println("Error copying file: " + e.getMessage());
        }
    }
}