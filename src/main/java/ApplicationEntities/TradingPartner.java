package ApplicationEntities;

public  abstract class TradingPartner {

    int TradingPartnerId;
    String TradingPartnerName;
    String City;

    public TradingPartner(int tradingPartnerId, String tradingPartnerName, String city) {
        this.TradingPartnerId = tradingPartnerId;
        this.TradingPartnerName = tradingPartnerName;
        this.City = city;
    }


    public String[] Validate(){
            String[] errors = new String[5];
            int i=0;
        if(this.TradingPartnerId <0)
            errors[i++] = "Invalid TradingPartner";
        if(this.TradingPartnerName == null || this.TradingPartnerName.length()<5)
            errors[i++] = "Trader's Name Should be Minimum 5 Charachter in length.";
        if(this.City == null || this.City.length()<3)
            errors[i++] = "City Name Should be Minimum 3 characters in length.";

       return errors ;
    }

    public abstract void SaveToFile(String filepath);
}
