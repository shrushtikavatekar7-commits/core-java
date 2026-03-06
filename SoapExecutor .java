class SoapExecutor {

public static void main(String[] args){

System.out.println("Before Execution");

Soap soap1 = new Soap();

soap1.soapId = 201;
soap1.soapBrand = "Lux";
soap1.soapColor = "Pink";
soap1.soapPrice = 45;
soap1.soapType = "Bath Soap";
soap1.soapMaterial = "Herbal";
soap1.isMedicated = false;
soap1.isOrganic = true;
soap1.soapCountry = "India";
soap1.soapCompany = "HUL";
soap1.soapStock = 200;
soap1.soapCategory = "Personal Care";
soap1.soapModel = "LX100";
soap1.soapWeight = "100g";
soap1.soapWidth = "5cm";
soap1.soapLength = "8cm";
soap1.soapManufactureDate = "10-01-2026";
soap1.soapExpiryDate = "10-01-2028";
soap1.soapCode = "SP001";
soap1.soapFragrance = "Rose";
soap1.soapRemark = "Smooth Skin";
soap1.soapStyle = "Modern";
soap1.soapUse = "Bathing";
soap1.soapQuality = "Premium";
soap1.soapShape = "Rectangle";

System.out.println("Soap Id: " + soap1.soapId);
System.out.println("Soap Brand: " + soap1.soapBrand);
System.out.println("Soap Color: " + soap1.soapColor);
System.out.println("Soap Price: " + soap1.soapPrice);
System.out.println("Soap Type: " + soap1.soapType);
System.out.println("Soap Material: " + soap1.soapMaterial);
System.out.println("Is Medicated: " + soap1.isMedicated);
System.out.println("Is Organic: " + soap1.isOrganic);
System.out.println("Soap Country: " + soap1.soapCountry);
System.out.println("Soap Company: " + soap1.soapCompany);
System.out.println("Soap Stock: " + soap1.soapStock);
System.out.println("Soap Category: " + soap1.soapCategory);
System.out.println("Soap Model: " + soap1.soapModel);
System.out.println("Soap Weight: " + soap1.soapWeight);
System.out.println("Soap Width: " + soap1.soapWidth);
System.out.println("Soap Length: " + soap1.soapLength);
System.out.println("Soap Manufacture Date: " + soap1.soapManufactureDate);
System.out.println("Soap Expiry Date: " + soap1.soapExpiryDate);
System.out.println("Soap Code: " + soap1.soapCode);
System.out.println("Soap Fragrance: " + soap1.soapFragrance);
System.out.println("Soap Remark: " + soap1.soapRemark);
System.out.println("Soap Style: " + soap1.soapStyle);
System.out.println("Soap Use: " + soap1.soapUse);
System.out.println("Soap Quality: " + soap1.soapQuality);
System.out.println("Soap Shape: " + soap1.soapShape);

System.out.println("After Execution");

}

}