public class q32 {
    private static int ic=0;
    public q32(){
        ic++;
        if(ic>50)
        {
            ic=0;
        }
    }
    //gic=getinstance count;
    public static int gic(){
        return ic;
    }
    public static void main(String[] args)
    {
        for(int i=1;i<=53;i++)
        {
            new q32();
            System.out.println("Objecet "+(i)+" create Total obj: "+gic());
        }
    }
}
