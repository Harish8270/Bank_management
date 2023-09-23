package bank_management;
import java.util.ArrayList;
import java.util.Scanner;

public class BankManagement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many account do you want to create ?");
		int n=sc.nextInt();
		ArrayList<Details>d=new ArrayList<Details>();

		for(int i=0;i<n;i++)
		{
		   System.out.println("USER "+(i+1)+":");
		   d.add(new Details(1));//create object for every entry
//		   
		}
		int ch;
		System.out.println("WELCOME USER ! ");
          do
          {
        	  System.out.println();
        	  System.out.println("1. Login \n "
        	  		+ "2. Deposit the amount \n 3. Withdraw the amount \n "
        	  		+ " 4.View Balance \n 5.Change PIN \n6.Get details\n7.Exit");
        	  System.out.println("Enter your choice : ");
        	  ch=sc.nextInt();
        	  switch(ch)
        	  {
        	  case 1:
        		  System.out.println("Enter Account number : ");
        		  long acNo=sc.nextLong();
        		  System.out.println("Enter PIN : ");
        		  int p=sc.nextInt();
        		  boolean found=false;
        		  for(int i=0;i<n;i++)
        		  {
        			  found=d.get(i).search(acNo);
        			  if(found) 
        			  {
        				  d.get(i).login(acNo,p);
        				  break;
        			  }
        			  else
        				  System.out.println("Account not found");
        		  }
        		  break;
        		
        	  case 2:
        		  System.out.println("Enter Account number ");
        		  long ac=sc.nextLong();
        		   found=false;
        		  for(int i=0;i<n;i++)
        		  {
        			  found=d.get(i).search(ac);
        			  if(found)
        			  {
        				  d.get(i).deposit();
        				  break;
        			  }
        			  
        		  }
        		  if(!found)
        		  {
        			  
        				  System.out.println("Account not found");
        		  }
        		  break;
        	  case 3:
        		  System.out.println("Enter Account number ");
        		   ac=sc.nextLong();
        		   found=false;
        		  for(int i=0;i<n;i++)
        		  {
        			  found=d.get(i).search(ac);
        			  if(found)
        			  {
        				  d.get(i).withdraw();
        				  break;
        			  }
        			  
        		  }
        		  if(!found)
        		  {
        			  
        				  System.out.println("Account not found");
        		  }
        		  break;
        	  case 4:
        		  System.out.println("Enter Account number : ");
        		   acNo=sc.nextLong();
        		  System.out.println("Enter PIN : ");
        		   p=sc.nextInt();
        		   found=false;
        		  for(int i=0;i<n;i++)
        		  {
        			  found=d.get(i).search(acNo);
        			  if(found)
        			  {
        				  d.get(i).view_balance();
        				  break;
        			  }
        			  
        		  }
        		  if(!found)
        		  {
        			  
        				  System.out.println("Account not found");
        		  }
        		  break;
        		 case 5:
        		 System.out.println("Enter Account number : ");
          		   ac=sc.nextLong();
        			 found=false;
           		  for(int i=0;i<n;i++)
           		  {
           			  found=d.get(i).search(ac);
           			  if(found)
           			  {
           				d.get(i).change_pin();// error occurred
           				  break;
           			  }
           			  
           		  }
           		if(!found)
      		     {
      			  
      				  System.out.println("Account not found");
      		     }
           		  break;
        		 case 6:
        			 System.out.println("Enter Account number : ");
            		   ac=sc.nextLong();
          			 found=false;
             		  for(int i=0;i<n;i++)
             		  {
             			  found=d.get(i).search(ac);
             			  if(found)
             			  {
             				 GetDetails gd=new GetDetails();
                			 gd.get(d.get(i));
             				 
             				  break;
             			  }
             			  
             		  }
             		if(!found)
        		     {
        			  
        				  System.out.println("Account not found");
        		     }
        			 
        			 break;
        			  
          }
	} 
          while(ch!=7);
          sc.close();

}
}
