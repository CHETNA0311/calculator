class calculator
{
	 public static void main(String[] args) 
	{
	     int ch=4;

    System.out.println("\n\t    ------------------------");
    System.out.println("\t       *** CALCULATOR ***");
    System.out.println("\t    ------------------------\n");
    System.out.println("\t  1. Addition ");
    System.out.println("\t  2. Subtraction ");
    System.out.println("\t  3. Multiplication ");
    System.out.println("\t  4. Division \n\n");
    System.out.println("\t  Your Choice is : "+ch+"\n\n");

         switch(ch)
         {
         	case 1 : {
         		        int x=4,y=6; 
         		        System.out.println("\t     ADDITION ");
         		        System.out.println("\t    ----------\n");
                         System.out.println("\t First Number is  : "+x);
                         System.out.println("\t Second Number is : "+y+"\n");
                         int z=x+y;
                         System.out.println("\t Result : "+z);
                         break;
         	         }
            case 2 : {
         		        int x=4,y=6; 
         		        System.out.println("\t SUBTRACTION ");
         		        System.out.println("\t-------------\n");
                         System.out.println("\t First Number is  : "+x);
                         System.out.println("\t Second Number is : "+y+"\n");

                         int z;

                         if(x>y)
                           {
                             z=x-y;
                           } 
                         else 
                           {
                             z=y-x;
                           }	
                          System.out.println("\t Result : "+z);
                          break;
         	         }
         	case 3 : {
         		        int x=4,y=6; 
         		        System.out.println("\t MULTIPLICATION ");
         		        System.out.println("\t----------------\n");
                         System.out.println("\t First Number is  : "+x);
                         System.out.println("\t Second Number is : "+y+"\n");
                         int z=x*y;
                         System.out.println("\t Result : "+z);
                         break;
         	         }         
            case 4 : {
         		        int x=4,y=6; 
         		        System.out.println("\t DIVISION ");
         		        System.out.println("\t----------\n");
                         System.out.println("\t First Number is  : "+x);
                         System.out.println("\t Second Number is : "+y+"\n");

                         int z,d;

                         if(x>y)
                           {
                             z=x/y;
                             d=x%y;
                           } 
                         else 
                           {
                             z=y/x;
                             d=y%x;
                           }	
                         System.out.println("\t Result : ");
                         System.out.println("\n\t Quotient : "+z);
                         System.out.println("\t Remainder : "+d);
                         break;
         	         }


         }
	}
}