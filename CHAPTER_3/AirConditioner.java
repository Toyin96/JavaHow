public class AirConditioner{
 
  boolean isOn;
  String productName;
  int temperature;   

 public AirConditioner(String product, int temperature){
      productName = product;
      temperature = temperature(16);
    }

 public void decreaseTemperature(){
	 if(temperature <= 16){
         System.out.println("The temeperature cannot be less than 16�C");
	}
         else{
 	    temperature = temperature - 1;
         System.out.println("Temperature value is : " + temperature);
	}
   }
 
 public void increaseTemperature(){
        if(temperature >= 30){
        System.out.println("The temeperature cannot be greater than 30�C");
        }else{
        temperature = temperature + 1;
       System.out.println("Temperature value is : " + temperature);
       }
   }

  public int getTemperature(){
	if(isOn == true){
		System.out.println("Ac is on at! " + temperature + "�C");
    		return temperature;
	
	}else{
	    	System.out.println("Ac is currently off!");
	    	return 0;
	}
   }

  public String getProductName(){
    return productName;
   }

  public void setTemperature(int temp){
	if(isOn == true){
		if(temp > 15 && temp < 31){
		temperature = temp;
		System.out.println("Ac set to " + temperature + "�C");
          }
	}
	else{
	    	System.out.println("Ac is at the range of 16�C to 30�C!");
	}

   }

  public void setProductName(String productName){
          this.productName = productName;
   }

   public boolean isOn(){
       return isOn;
    }

 public void setOn(boolean setOn){
   this.isOn = isOn;
  }

	public void toggle(boolean value){
	if(value == true){
		isOn = false;
		System.out.println("Ac is off");
	}
	else{
		isOn = true;
		System.out.println("Ac is on");
		
	}
	}
  
   }