class BedsheetExecutor {

public static void main(String[] args){

System.out.println("Before Execution");

Bedsheet bedsheet1 = new Bedsheet();

bedsheet1.bedsheetId = 1;
bedsheet1.bedsheetBrand = "HomeStyle";
bedsheet1.bedsheetColor = "Blue";
bedsheet1.bedsheetPrice = 1200;
bedsheet1.bedsheetMaterial = "Cotton";
bedsheet1.bedsheetSize = "King";
bedsheet1.isCotton = true;
bedsheet1.isWashable = true;
bedsheet1.bedsheetCountry = "India";
bedsheet1.bedsheetCompany = "Home Pvt Ltd";
bedsheet1.bedsheetStock = 50;
bedsheet1.bedsheetCategory = "Bedroom";
bedsheet1.bedsheetModel = "HS100";
bedsheet1.bedsheetWeight = "1kg";
bedsheet1.bedsheetWidth = "90inch";
bedsheet1.bedsheetLength = "100inch";
bedsheet1.bedsheetManufactureDate = "01-02-2026";
bedsheet1.bedsheetExpiryDate = "01-02-2030";
bedsheet1.bedsheetCode = "BS001";
bedsheet1.bedsheetDesign = "Floral";
bedsheet1.bedsheetRemark = "Soft";
bedsheet1.bedsheetStyle = "Modern";
bedsheet1.bedsheetUse = "Sleeping";
bedsheet1.bedsheetQuality = "Premium";
bedsheet1.bedsheetShape = "Rectangle";

System.out.println("Bedsheet Id: " + bedsheet1.bedsheetId);
System.out.println("Bedsheet Brand: " + bedsheet1.bedsheetBrand);
System.out.println("Bedsheet Color: " + bedsheet1.bedsheetColor);
System.out.println("Bedsheet Price: " + bedsheet1.bedsheetPrice);
System.out.println("Bedsheet Material: " + bedsheet1.bedsheetMaterial);
System.out.println("Bedsheet Size: " + bedsheet1.bedsheetSize);
System.out.println("Is Cotton: " + bedsheet1.isCotton);
System.out.println("Is Washable: " + bedsheet1.isWashable);
System.out.println("Bedsheet Country: " + bedsheet1.bedsheetCountry);
System.out.println("Bedsheet Company: " + bedsheet1.bedsheetCompany);
System.out.println("Bedsheet Stock: " + bedsheet1.bedsheetStock);
System.out.println("Bedsheet Category: " + bedsheet1.bedsheetCategory);
System.out.println("Bedsheet Model: " + bedsheet1.bedsheetModel);
System.out.println("Bedsheet Weight: " + bedsheet1.bedsheetWeight);
System.out.println("Bedsheet Width: " + bedsheet1.bedsheetWidth);
System.out.println("Bedsheet Length: " + bedsheet1.bedsheetLength);
System.out.println("Bedsheet Manufacture Date: " + bedsheet1.bedsheetManufactureDate);
System.out.println("Bedsheet Expiry Date: " + bedsheet1.bedsheetExpiryDate);
System.out.println("Bedsheet Code: " + bedsheet1.bedsheetCode);
System.out.println("Bedsheet Design: " + bedsheet1.bedsheetDesign);
System.out.println("Bedsheet Remark: " + bedsheet1.bedsheetRemark);
System.out.println("Bedsheet Style: " + bedsheet1.bedsheetStyle);
System.out.println("Bedsheet Use: " + bedsheet1.bedsheetUse);
System.out.println("Bedsheet Quality: " + bedsheet1.bedsheetQuality);
System.out.println("Bedsheet Shape: " + bedsheet1.bedsheetShape);

System.out.println("After Execution");

}
}