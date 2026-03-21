class OfficeExecutor {
    public static void main(String[] args) {

        Office o1 = new Office(1,"TechSoft","Bangalore",200,"Ravi",
                500000,"IT","Dev","Tower A","Bangalore",
                "KA","India",5,4.5,"AC","9-5","Hybrid",
                "LAN","High","Computers");

        Office o2 = new Office(2,"InfoSys","Pune",300,"Raj",
                800000,"IT","Testing","Block B","Pune",
                "MH","India",6,4.7,"Cafeteria","10-6","Office",
                "WAN","Medium","Servers");

        o1.display();
        o2.display();
    }
}