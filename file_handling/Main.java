import java.io.IOException;
import java.io.InputStreamReader;
class Main{
    public static void main(String args[]){
        try(InputStreamReader isr=new InputStreamReader(System.in)){
            System.out.println("Enter some value");
            int i=isr.read();
            while(isr.ready()){
                System.out.println((char) i );
                i=isr.read();
            }
            isr.close();
            System.out.println();
        } catch(IOException e){
        System.out.println(e.getMessage());
       }
    }
}