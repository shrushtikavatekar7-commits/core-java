class Google {

    int id;
    String ceo;
    String founder;
    String headquarters;
    int employees;
    double revenue;
    String product1;
    String product2;
    String product3;
    boolean isTopCompany;
    int offices;
    String country;
    int foundedYear;
    String emailService;
    String cloudService;
    String browser;
    String os;
    String aiTool;
    String videoPlatform;
    String mapService;

    public Google(int id, String ceo, String founder, String headquarters, int employees,
                  double revenue, String product1, String product2, String product3,
                  boolean isTopCompany, int offices, String country, int foundedYear,
                  String emailService, String cloudService, String browser, String os,
                  String aiTool, String videoPlatform, String mapService) {

        this.id = id;
        this.ceo = ceo;
        this.founder = founder;
        this.headquarters = headquarters;
        this.employees = employees;
        this.revenue = revenue;
        this.product1 = product1;
        this.product2 = product2;
        this.product3 = product3;
        this.isTopCompany = isTopCompany;
        this.offices = offices;
        this.country = country;
        this.foundedYear = foundedYear;
        this.emailService = emailService;
        this.cloudService = cloudService;
        this.browser = browser;
        this.os = os;
        this.aiTool = aiTool;
        this.videoPlatform = videoPlatform;
        this.mapService = mapService;
    }

    public void display() {
        System.out.println("Google Details:");
        System.out.println(id + " " + ceo + " " + founder + " " + headquarters);
        System.out.println("--------------------------------");
    }
}