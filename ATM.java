import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class ATM extends File{
    public static void main(String [ ] args){
        Scanner in  = new Scanner(System.in);
        ATM reader=new ATM();
        boolean done = false;
        Long accounts[]=new Long[5];
        Long p[]=new Long[5];
        int f=0,k=0;
        System.out.println("Enter Account Number");
        Long acc=in.nextLong();
        System.out.println("Enter the PIN");
        Long pin=in.nextLong();
        Checking c=new Checking();
        Savings s=new Savings();
        
        
        
      
        try{
            System.out.println("Please enter the file name:");
            String filename = in.next();

            
Long [ ] data = reader.readFile(filename);
   
    for(int i=0;i<data.length;i=i+2)
    {
       
        accounts[f]=data[i];
        
    System.out.println(accounts[f]);
    f=f+1;
           }
           f=0;
for(int i=1;i<data.length;i=i+2)
    {
       
        p[f]=data[i];
        
    System.out.println(p[f]);
    f=f+1;
           }
           char opt='\u0000';
            char opt2='\u0000';
           while(opt!='C'|| opt2!='C')
           {
           
            for(int i=0;i<2;i++)
    {
       if((acc.equals(accounts[i])) && (pin.equals(p[i])))
       {
        System.out.println("Login successful");
        System.out.println("A=Checking, B=Savings, C=Quit:");
        opt=in.next().charAt(0);
       
        if(opt=='A'){
             System.out.println("Balance="+c.getBalance());
            System.out.println("A=Deposit, B=withdraw, C=Quit:");
            opt2=in.next().charAt(0);
            
            if(opt2=='A' ){
            System.out.println("Amount:");
            int am=in.nextInt();
             c.deposit(am);
            }
            if(opt2=='B' ){
            System.out.println("Amount:");
            int am=in.nextInt();
            c.withdraw(am);
            }
            if(opt2=='C')
            break;
    
        }    
         if(opt=='B'){
             System.out.println("Balance="+s.getBalance());
            System.out.println("A=Deposit, B=withdraw, C=Quit:");
           opt2=in.next().charAt(0);
            
            if(opt2=='A' ){
            System.out.println("Amount:");
            int am=in.nextInt();
             s.deposit(am);
            }
            if(opt2=='B' ){
            System.out.println("Amount:");
            int am=in.nextInt();
            s.withdraw(am);
            }
            if(opt2=='C')
            break;
    
        }
        if(opt=='C')
            break;
    }
    
}
}
}
                     
    catch(FileNotFoundException e){
        System.out.println(" File not found ");
    }
    catch(BadDataException e){
        System.out.println(" Bad data: " + e.getMessage());
    }
catch(IOException e){
e.printStackTrace();
            }
        
    }
}
