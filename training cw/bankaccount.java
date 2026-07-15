class bankaccount {
              
    private double balance;
    //setter with validation
    public void setBalance(double balance){

        if (balance <0){
            throw new IllegalArgumentException("balance cannot be negative");
        }
        this.balance=balance;
        System.out.println("Balance updated to : "+this.balance);
    }
    public double getBalance(){
        //you can add logging here
        //System.out.println("balance accessed at:" + new Data());
    return this.balance;
    }
       }
            
    
