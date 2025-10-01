public class nestedclass{
    private void draw(){
        System.out.println("in private drawinh method");
    }
    class insideclass{
        public void nestedpublic(){
            // nestedclass n=new nestedclass();
            draw();
        }
    }
    public static void main(String[] args){
        nestedclass outer=new nestedclass();

        nestedclass.insideclass inner=outer.new insideclass();

        inner.nestedpublic();
        outer.draw();
    }
}