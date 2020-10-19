import java.util.Scanner;

class Day5
{
    public static void main(String[] args) throws Exception
     {
       int ans,num=0,wro=0;
         
        Scanner in=new Scanner(System.in);
        System.out.print("\n");
        System.out.println("\t\t\t\t\tQuiz Copetition");
        Thread.sleep(300);
        
      
        System.out.println("\nWho is the Prime Minister of India?");     
        System.out.println("1)Devendra Fadanvis");
        System.out.println("2)Udhav Thakre");
        System.out.println("3)Narendra Modi");
        System.out.println("4)Shard Pawar");
        System.out.print("Enter Your Option: ");
        ans=in.nextInt();
        if(ans==3)
        {
            
            num=num+1;
        }
        else
        {
           
            wro=wro+1;
        }
        Thread.sleep(300);

        System.out.println("\nWhat is National Sports of India?");  
        System.out.println("1)Cricket");  
        System.out.println("2)Football");        
        System.out.println("3)Kabbadi");  
        System.out.println("4)Hockey");
        System.out.print("Enter Your Option: ");
        ans=in.nextInt();
        if(ans==4)
        {
                   
            num=num+1;
        }
        else
        {
           
            wro=wro+1;
        }
        Thread.sleep(300);

        System.out.println("\n Dr.A.P.J Abdul Kalam also Popularly knows as _____");
        System.out.println("1)Missile Man");
        System.out.println("2)Power Man");
        System.out.println("3)Padmshree");     
        System.out.println("4)Padmavibhushan");
        System.out.print("Enter Your Option: ");
        ans=in.nextInt();
        if(ans==1)
        {
                
            num=num+1;
        }
        else
        {
          
            wro=wro+1;
        }
        System.out.println("\n");
        System.out.println("Total Right Answers: "+num);
        System.out.println("Total Wrong Answers: "+wro);
        


    }
    
}