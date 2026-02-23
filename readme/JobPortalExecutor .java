class JobPortalExecutor {

    public static void main(String[] args) {

        String[] companies = {
            "TCS","Infosys","Wipro","Accenture","HCL","IBM","Capgemini",
            "Cognizant","Tech Mahindra","Oracle","Deloitte","KPMG","EY",
            "PwC","Mindtree","L&T","Zoho","Flipkart","Amazon","Google",
            "Microsoft","Samsung","Intel","HP","Dell",
            "Adobe","Cisco","Paytm","Byjus","Swiggy",
            "Zomato","Uber","Ola","Reliance","Infosys BPM",
            "Tata Motors","Mahindra","Bosch","Siemens","Walmart",
            "Goldman Sachs","JP Morgan","Morgan Stanley","HSBC","HDFC Bank",
            "ICICI Bank","Axis Bank","Kotak Bank","PhonePe","Razorpay",
            "Myntra","Meesho","Snapdeal","Tata Elxsi","Persistent",
            "Hexaware","Virtusa","Birlasoft","Mphasis","Atos",
            "DXC","Nokia","Ericsson","Qualcomm","Micron",
            "Lenovo","Sony","Panasonic","Shell","ExxonMobil",
            "Accor","Hyatt","ITC","Nestle","Unilever",
            "P&G","Colgate","Godrej","Havells","Bajaj",
            "TVS","Hero","Maruti","Airbus","Boeing",
            "SpaceX","ISRO","DRDO","Infosys Finacle","Capillary",
            "Freshworks","Chargebee","RedBus","ClearTax","Urban Company",
            "PolicyBazaar","MakeMyTrip","BigBasket","Nykaa","Licious",
            "Dream11","CRED","Groww","Upstox","Zerodha",
            "InMobi","MuSigma","Fractal","Tally","SAP",
            "ServiceNow","Workday","Snowflake","Stripe","PayPal",
            "Netflix","Meta","Twitter","LinkedIn","Salesforce",
            "Dropbox","Slack","Zoom","Spotify","Uber Eats",
            "Grab","Airbnb","Booking.com","Expedia","Tesla",
            "Nvidia","AMD","Broadcom","Tata Power","Adani",
            "Vedanta","Infosys Consulting","Citi Bank","Barclays",
            "Deutsche Bank","Standard Chartered","UBS","Credit Suisse"
        };

        for (String company : companies) {

            System.out.println("Jobs in " + company + " :");

            String[] result = JobPortal.searchJobsByCompany(company);

            JobPortal.displayJobNames(result);

            System.out.println("----------------------------------------");
        }
    }
}