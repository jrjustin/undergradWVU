public class Adult extends Customer {
  double SAVINGS_INTEREST = 0.9;
  double CHECK_INTEREST = 0.4;
  double CHECK_CHARGE = 0;
  double OVERDRAFT_PENALTY = 2.00;
  
  
  public Adult(String fname, String lname, String ad, String tn, String custNum, int ag, String aType, String actNum, double bal) {
    super( fname, lname, ad, tn, custNum, ag, aType,  actNum,  bal);
  }// end Adult
  
  // getters
  public double getSavingInterest(){
    return SAVINGS_INTEREST;
  }// end getter: getSavingInterest
  
  public  double getCheckingInterest() {
    return CHECK_INTEREST; 
  }// end getter: getCheckingInterest
  
  public double getCheckCharge(){
    return CHECK_CHARGE;
  }// end getter: getCheckCharge
  
  public  double getOverdraftPenality() {
    return OVERDRAFT_PENALTY;   
  }// end getter: getOverdraftPenality
}// end Adult