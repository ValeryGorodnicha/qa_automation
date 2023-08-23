package valerypackage;

    public class CreditHwSix {
        public CreditHwSix(){
            System.out.println("Be careful when filling out these fields."); //просто хочу щоб цей рядок виводився при створенні кожного об"єкту даного класу:)
        }

    //fields
    private long LoanAmount; //сума кредиту
    private int LoanInterest; //Відсотки по кредиту
    private int CreditTerm; //Термін кредитування
    private long StartingPayment; //Початковий взнос
    private String TypeOfLoanRepayment; //Спосіб погашення

    //methods
    public long getLoanAmount() {
        return LoanAmount;
    }

        public int getLoanInterest() {
            return LoanInterest;
        }

        public int getCreditTerm() {
            return CreditTerm;
        }

        public long getStartingPayment() {
            return StartingPayment;
        }

        public String getTypeOfLoanRepayment() {
            return TypeOfLoanRepayment;
        }
        public void setLoanAmount(long LoanAmount) {
            this.LoanAmount = LoanAmount;
        }

        public void setLoanInterest(int LoanInterest) {
            this.LoanInterest = LoanInterest;
        }

        public void setCreditTerm(int CreditTerm) {
            this.CreditTerm = CreditTerm;
        }

        public void setStartingPayment(long StartingPayment) {
            this.StartingPayment = StartingPayment;
        }

        public void setTypeOfLoanRepayment(String TypeOfLoanRepayment) {
            this.TypeOfLoanRepayment = TypeOfLoanRepayment;
        }




}
