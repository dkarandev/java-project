class studentcontructor
{

    int k1,k2,total;
    studentcontructor()
    {
        
        System.out.println("empty contructor is call");
    }    
    studentcontructor(int a,int b)
    {
        k1=a;
        k2=b;
    }
    void display()
    {
        total=k1+k2;
        System.out.println(total);
    }
    public static void main( String[] args)
    {
        studentcontructor s=new studentcontructor(30,20);  
        s.display();


        studentcontructor s1=new studentcontructor(100,30);
        s1.display();
    
    }
}