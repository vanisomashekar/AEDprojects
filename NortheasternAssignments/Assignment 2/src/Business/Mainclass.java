/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Scanner;

/**
 *
 * @author vaniv
 */
public class Mainclass {
    public static void main(String arg[]){
        Product product = new Product();
        
        //To create the product 
        System.out.println("Create Product Details");
        Scanner ProductInput = new Scanner(System.in);
        System.out.println("Product Name:");
        String Name = ProductInput.nextLine();
        product.setName(Name);
         System.out.println("Product Price:");
        double Price = ProductInput.nextDouble();
        product.setPrice(Price);
        ProductInput.nextLine();
         System.out.println("Product Available Number:");
        int AvailNum = ProductInput.nextInt();
        product.setAvailNum(AvailNum);
        ProductInput.nextLine();
        System.out.println("Product Description:");
        String description = ProductInput.nextLine();
        product.setDescription(description);
        
        //To create the supplier details
        System.out.println("Create Product Supplier Details");
        System.out.println("Supplier ID:");
        int SupID = ProductInput.nextInt();
        product.CreatesupID(SupID);
        ProductInput.nextLine();
        System.out.println("Supplier Name:");
        String SupName = ProductInput.nextLine();
        product.CreatesupName(SupName);
        System.out.println("Supplier Status:");
        String SupStatus = ProductInput.nextLine();
        product.CreatesupStatus(SupStatus);
        System.out.println("Supplier City:");
        String SupCity =ProductInput.nextLine();
        product.CreatesupCity(SupCity);
        
        //To view the product details
        Display(product);
        
        //To update the product details
        System.out.println("would you like to update the product details or supplier details ? ");
        System.out.println("Please provide 'Y' for YES and 'N' for NO");
        String answer = ProductInput.nextLine();
        if(answer.equals("Y") || answer.equals("y"))
        {
            System.out.println("Would you like to update Product details or Supplier details ?");
            System.out.println("Please provide 'P' for Product details and 'S' for Supplier details");
            String answer1 = ProductInput.nextLine();
            if(answer1.equals("P")|| answer1.equals("p"))
            {
                System.out.println("UPDATE THE PRODUCT DETAILS");
                for(int i= 0;i<=3;i++)
                        {
                            if (i == 0)
                            {
                                System.out.println("Please provide which detail you would like to update for a product: ");
                            }
                            String updatedetail = ProductInput.nextLine();
                            if (updatedetail.equals("NAME") || updatedetail.equals("Name") || updatedetail.equals("name"))
                            {
                                System.out.println("Please provide the new Product Name:");
                                String updateName = ProductInput.nextLine();
                                product.setName(updateName);
                            }else if (updatedetail.equals("Price") || updatedetail.equals("PRICE") || updatedetail.equals("price"))
                            {
                                System.out.println("Please provide the new Product Price:");
                                double updatePrice = ProductInput.nextDouble();
                                product.setPrice(updatePrice);
                                ProductInput.nextLine();
                            }else if (updatedetail.equals("Available Number") || updatedetail.equals("AVAILABLE NUMBER") || updatedetail.equals("available number"))
                            {
                                System.out.println("Please provide the new Product Available Number:");
                                int updateAvailnum = ProductInput.nextInt();
                                product.setAvailNum(updateAvailnum);
                                ProductInput.nextLine();
                            }else if (updatedetail.equals("Description") || updatedetail.equals("DESCRIPTION") || updatedetail.equals("description"))
                            {
                                System.out.println("Please provide the new Product Description:");
                                String updateDescription = ProductInput.nextLine();
                                product.setDescription(updateDescription);  
                            }else
                            {
                                System.out.println("Not valid input");
                                i=5;
                            }
                            if (i == 3)
                            {
                                System.out.println("would you like to update Supplier details ?");
                                System.out.println("Please provide 'S' if YES else provide 'N' for NO");
                                String answer2 = ProductInput.nextLine();
                                if(answer2.equals("S")|| answer2.equals("s")) 
                                {
                                    System.out.println("UPDATE THE SUPPLIER DETAILS");
                                    for(int j= 0;j<4;j++)
                                    {
                                        if (j == 0)
                                        {
                                            System.out.println("");
                                            System.out.println("Please provide which detail you would like to update for a supplier: ");
                                            System.out.println("ID");
                                            System.out.println("Name");
                                            System.out.println("City");
                                            System.out.println("Status");
                                        }
                                        else
                                        {
                                            System.out.println("");
                                            System.out.println("Would you like to update another Supplier detail ?");
                                            System.out.println("If yes please provide the detail which you would like to update else provide 'N' for no ");
                                        }
                                            String updatedetail2 = ProductInput.nextLine();
                    
                                            if (updatedetail2.equals("ID") || updatedetail2.equals("id") || updatedetail2.equals("Id"))
                                        {   
                                            System.out.println("Please provide the new Supplier Id:");
                                            int updatesupId = ProductInput.nextInt();
                                            product.CreatesupID(updatesupId);
                                            ProductInput.nextLine();
                                        }else if (updatedetail2.equals("NAME") || updatedetail2.equals("Name") || updatedetail2.equals("name"))
                                        {
                                            System.out.println("Please provide the new Supplier Name:");
                                            String updateName = ProductInput.nextLine();
                                            product.CreatesupName(updateName);
                                        }else if (updatedetail2.equals("CITY") || updatedetail2.equals("city") || updatedetail2.equals("City")){
                                            System.out.println("Please provide the new Supplier City:");
                                            String updateCity = ProductInput.nextLine();
                                            product.CreatesupCity(updateCity);
                                        }else if (updatedetail2.equals("Status") || updatedetail2.equals("status") || updatedetail2.equals("STATUS")){
                                            System.out.println("Please provide the new Supplier Status:");
                                            String updateStatus = ProductInput.nextLine();
                                            product.CreatesupStatus(updateStatus);
                                        }else
                                        {
                                            System.out.println("Not valid input");
                                            j=5;
                                        }
                                    }
                                }else
                                {
                                    ProductInput.close();
                                }
                            }else
                            {
                                System.out.println("Would you like to update another product detail ?");
                                System.out.println("If yes please provide the detail which you would like to update else provide 'N' for no ");
                            }
                        }
            }else if(answer1.equals("S")|| answer1.equals("s")) 
            {
                System.out.println("");
                System.out.println("UPDATE THE SUPPLIER DETAILS");
                for(int k= 0;k<4;k++)
                {
                    if (k == 0)
                    {
                        System.out.println("Please provide which detail you would like to update for a supplier: ");
                        System.out.println("ID");
                        System.out.println("Name");
                        System.out.println("City");
                        System.out.println("Status");
                    }
                    else
                    {
                        System.out.println("Would you like to update another detail for supplier ?");
                        System.out.println("If yes please provide the detail which you would like to update else provide 'N' for no ");
                    }
                    String updatedetail1 = ProductInput.nextLine();
                    
                    if (updatedetail1.equals("ID") || updatedetail1.equals("id") || updatedetail1.equals("Id") )
                    {   
                        System.out.println("Please provide the new Supplier Id:");
                        int updatesupId = ProductInput.nextInt();
                        product.CreatesupID(updatesupId);
                        ProductInput.nextLine();
                    }else if (updatedetail1.equals("NAME") || updatedetail1.equals("Name") || updatedetail1.equals("name"))
                    {
                        System.out.println("Please provide the new Supplier Name:");
                        String updateName = ProductInput.nextLine();
                        product.CreatesupName(updateName);
                    }else if (updatedetail1.equals("CITY") || updatedetail1.equals("city") || updatedetail1.equals("City")){
                        System.out.println("Please provide the new Supplier City:");
                        String updateCity = ProductInput.nextLine();
                        product.CreatesupCity(updateCity);
                    }else if (updatedetail1.equals("Status") || updatedetail1.equals("status") || updatedetail1.equals("STATUS")){
                        System.out.println("Please provide the new Supplier Status:");
                        String updateStatus = ProductInput.nextLine();
                        product.CreatesupStatus(updateStatus);
                    }else
                    {
                        System.out.println("Not valid input");
                        k=5;
                    }
                }
            }else
            {    
                System.out.println("Invalid value");
                ProductInput.close();
            }
        }else 
        {
           ProductInput.close(); 
        }
        
        //To view the updated details
        Display(product);
    }
    
    //Display function
    public static void Display(Product product){
        System.out.println("");
        System.out.println("");
        System.out.println("FINAL PRODUCT DETAILS");
        System.out.println("Name: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Available Number: " + product.getAvailNum());
        System.out.println("Description: " + product.getDescription());
        System.out.println("");
        System.out.println("FINAL SUPPPLIER DETAILS");
        System.out.println("ID:" + product.getSupplier().getID());
        System.out.println("Name: " + product.getSupplier().getSName());
        System.out.println("City: " + product.getSupplier().getCity());
        System.out.println("Status: " + product.getSupplier().getStatus());
    }
}
