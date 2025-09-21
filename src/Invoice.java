import java.util.ArrayList;
import java.util.Date;

public class Invoice {
    private String invoiceId;
    private Date invoiceDate;
    private double rawPrice;
    private double TradeInAllowance;
    private double taxes;
    private double licenseFee;
    private double finalPrice;
    private String customerSign;

    private Customer customer;
    private Saleperson saleperson;
    private TradeInVehicle tradeInVehicle;
    private ArrayList<Vehicle> vehicles;
    
    public Invoice(String invoiceId, Date invoiceDate, double rawPrice, double tradeInAllowance, double taxes,
            double licenseFee, double finalPrice, String customerSign) {
        this.invoiceId = invoiceId;
        this.invoiceDate = invoiceDate;
        this.rawPrice = rawPrice;
        TradeInAllowance = tradeInAllowance;
        this.taxes = taxes;
        this.licenseFee = licenseFee;
        this.finalPrice = finalPrice;
        this.customerSign = customerSign;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public double getRawPrice() {
        return rawPrice;
    }

    public void setRawPrice(double rawPrice) {
        this.rawPrice = rawPrice;
    }

    public double getTradeInAllowance() {
        return TradeInAllowance;
    }

    public void setTradeInAllowance(double tradeInAllowance) {
        TradeInAllowance = tradeInAllowance;
    }

    public double getTaxes() {
        return taxes;
    }

    public void setTaxes(double taxes) {
        this.taxes = taxes;
    }

    public double getLicenseFee() {
        return licenseFee;
    }

    public void setLicenseFee(double licenseFee) {
        this.licenseFee = licenseFee;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    public String getCustomerSign() {
        return customerSign;
    }

    public void setCustomerSign(String customerSign) {
        this.customerSign = customerSign;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Saleperson getSaleperson() {
        return saleperson;
    }

    public void setSaleperson(Saleperson saleperson) {
        this.saleperson = saleperson;
    }

    public TradeInVehicle getTradeInVehicle() {
        return tradeInVehicle;
    }

    public void setTradeInVehicle(TradeInVehicle tradeInVehicle) {
        this.tradeInVehicle = tradeInVehicle;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
    
}
