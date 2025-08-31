public class fibannoci{
    public static void main (String[]args){
        int num = 15;
        int a = 0,b = 1;
        System.out.println("Fibannoci series upto " +num+ " terms");
        for(int i  = 0; i < num; i ++){
            System.out.println(a +" ");
            int next = a+b;
            a=b;
            b=next;
        }
    }
}