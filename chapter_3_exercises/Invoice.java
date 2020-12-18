public class Invoice{

    	String partNumber;
	String partDescription;
	int quantityOfItems;
	double pricePerItem;	


        public Invoice(String partNumber, String partDescription, int quantityOfItems, double pricePerItem){
	this.partNumber = partNumber;
        this.partDescription = partDescription;
	this.quantityOfItems = quantityOfItems;
        this.pricePerItem = pricePerItem;          
	}

        private String getPartNumber(){
        return partNumber;
	}

	private void setPartNumber(String partNumber){
        this.partNumber = partNumber;
	}

	private String getPartDescription(){
        return partDescription;
	}

  	private void setPartDescription(String partDescription){
        this.partDescription = partDescription;
	}

	private int getQuantityOfItems(){
        return quantityOfItems;
        }
        
        private void setQuantityOfItems(int quantityOfItems){
        this.quantityOfItems = quantityOfItems;
        }

	private double getPricePerItem(){
        return pricePerItem;
        }

	private void setPricePerItem(double pricePerItem){
        this.pricePerItem = pricePerItem;
	}

	public double invoiceAmount = quantityOfItems * pricePerItem;

	public double getInvoiceAmount(){
        if (quantityOfItems < 1 ) // || (pricePerItem < 1 ){
           return 0;
	}
      }
