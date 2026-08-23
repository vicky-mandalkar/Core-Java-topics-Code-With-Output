public class InvoiceDemo {

    public static void main(String[] args) {


        InvoiceItem i1 =new InvoiceItem("P101","Laptop", 2, 45000 );

        // Display details

        System.out.println("Invoice Details");

        System.out.println("-----------------------");

        System.out.println("ID : " + i1.getID());
       

        System.out.println("Description : " + i1.getDesc());

        System.out.println("Quantity : " + i1.getQty());

        System.out.println("Unit Price : " +i1.getUnitPrice() );

        System.out.println("Total Amount : " +i1.getTotal());

        System.out.println("All Information : " + i1);

        System.out.println();

       

        i1.setQty(3);
        i1.setUnitPrice(50000);

        System.out.println( "Updated Quantity : " +i1.getQty());

        System.out.println( "Updated Unit Price : " +i1.getUnitPrice() );

        System.out.println("Updated Total : " +i1.getTotal());

        System.out.println("Updated Object : " + i1);
    }
}
/*
ID : P101
Description : Laptop
Quantity : 2
Unit Price : 45000.0
Total Amount : 90000.0
All Information : InvoiceItem[id=P101, desc=Laptop, qty=2, unitPrice=45000.00]

Updated Quantity : 3
Updated Unit Price : 50000.0
Updated Total : 150000.0
Updated Object : InvoiceItem[id=P101, desc=Laptop, qty=3, unitPrice=50000.00]
*/