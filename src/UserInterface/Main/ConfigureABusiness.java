/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Main;

import MarketingManagement.MarketingPersonDirectory;
import MarketingManagement.MarketingPersonProfile;
import TheBusiness.Business.Business;
import TheBusiness.MarketModel.ChannelCatalog;
import TheBusiness.CustomerManagement.CustomerDirectory;
import TheBusiness.CustomerManagement.CustomerProfile;
import TheBusiness.CustomerManagement.CustomerSummary;
import TheBusiness.CustomerManagement.CustomersReport;
import TheBusiness.MarketModel.Channel;
import TheBusiness.MarketModel.Market;
import TheBusiness.MarketModel.MarketCatalog;
import TheBusiness.MarketModel.MarketChannelAssignment;
import TheBusiness.MarketModel.MarketChannelComboCatalog;
import TheBusiness.MarketModel.SolutionOffer;
import TheBusiness.MarketModel.SolutionOfferCatalog;
import TheBusiness.SolutionOrders.MasterSolutionOrderList;
import TheBusiness.Personnel.EmployeeDirectory;
import TheBusiness.Personnel.EmployeeProfile;
import TheBusiness.Personnel.Person;
import TheBusiness.Personnel.PersonDirectory;
import TheBusiness.ProductManagement.Product;
import TheBusiness.ProductManagement.ProductCatalog;
import TheBusiness.SalesManagement.SalesPersonDirectory;
import TheBusiness.SalesManagement.SalesPersonProfile;
import TheBusiness.SalesManagement.SalesPersonSummary;
import TheBusiness.SalesManagement.SalesPersonsReport;
import TheBusiness.SolutionOrders.SolutionOrder;
import TheBusiness.Supplier.Supplier;
import TheBusiness.Supplier.SupplierDirectory;
import TheBusiness.UserAccountManagement.UserAccount;
import TheBusiness.UserAccountManagement.UserAccountDirectory;
import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author kal bugrara
 */
class ConfigureABusiness {

//    static Business initialize() {
//        Business business = new Business("Xerox");
//
//// Create Persons
//        PersonDirectory persondirectory = business.getPersonDirectory();
//// person representing sales organization        
//        Person xeroxsalesperson001 = persondirectory.newPerson("Xerox sales");
//        Person xeroxmarketingperson001 = persondirectory.newPerson("Xerox marketing");
//        Person xeroxadminperson001 = persondirectory.newPerson("Xerox admin");
//
//// Create person objects to represent customer organizations. 
//        Person person005 = persondirectory.newPerson("Dell");
//        Person person006 = persondirectory.newPerson("Microsoft");
//        Person person007 = persondirectory.newPerson("Google");
//        Person person008 = persondirectory.newPerson("JP Morgan");
//        Person person009 = persondirectory.newPerson("State street"); //we use this as customer
//
//// Create Customers
////        CustomerDirectory customedirectory = business.getCustomerDirectory();
////        CustomerProfile customerprofile1 = customedirectory.newCustomerProfile(person005, "tv", );
////        CustomerProfile customerprofile2 = customedirectory.newCustomerProfile(person006, "web");
////        CustomerProfile customerprofile3 = customedirectory.newCustomerProfile(person007, "social media");
////        CustomerProfile customerprofile4 = customedirectory.newCustomerProfile(person008, "tv");
////        CustomerProfile customerprofile5 = customedirectory.newCustomerProfile(person009, "radio");
//
//// Create Sales people
//        SalesPersonDirectory salespersondirectory = business.getSalesPersonDirectory();
//        SalesPersonProfile salespersonprofile = salespersondirectory.newSalesPersonProfile(xeroxsalesperson001);
//
//// Create Marketing people
//        MarketingPersonDirectory marketingpersondirectory = business.getMarketingPersonDirectory();
//        MarketingPersonProfile marketingpersonprofile0 = marketingpersondirectory.newMarketingPersonProfile(xeroxmarketingperson001);
//
//// Create Admins to manage the business
//        EmployeeDirectory employeedirectory = business.getEmployeeDirectory();
//        EmployeeProfile employeeprofile0 = employeedirectory.newEmployeeProfile(xeroxadminperson001);
//        SupplierDirectory suplierdirectory = business.getSupplierDirectory();
//
//        Supplier supplier1 = suplierdirectory.newSupplier("Lenovo");
//        ProductCatalog productcatalog = supplier1.getProductCatalog();
//        Product products1p1 = productcatalog.newProduct("Scanner 3  1", 2000, 16500, 10000);
//        Product products1p2 = productcatalog.newProduct("Scanner 4", 10000, 25000, 16500);
//        Product products1p3 = productcatalog.newProduct("Printer 2", 22000, 40000, 36500);
//        Product products1p4 = productcatalog.newProduct("Photocopier 2 ", 30000, 70000, 50000);
//        Product products1p5 = productcatalog.newProduct("Scanner  5", 19000, 36500, 25000);
//        Product products1p6 = productcatalog.newProduct("Scanner 6", 90000, 125000, 105000);
//        Product products1p7 = productcatalog.newProduct("Printer 3", 22000, 60000, 36500);
//        Product products1p8 = productcatalog.newProduct("Photocopier 3", 30000, 70000, 50000);
//
//        //       SupplierDirectory suplierdirectory = business.getSupplierDirectory();
//        Supplier supplier2 = suplierdirectory.newSupplier("Epson");
//        productcatalog = supplier2.getProductCatalog();
//        Product products2p1 = productcatalog.newProduct("Scanner 13  1", 12000, 26000, 18500);
//        Product products2p2 = productcatalog.newProduct("Scanner 14", 90000, 165000, 125000);
//        Product products2p3 = productcatalog.newProduct("Color Printer 112", 422000, 540000, 495000);
//        Product products2p4 = productcatalog.newProduct("Photocopier 922 ", 430000, 890000, 550000);
//        Product products2p5 = productcatalog.newProduct("Low toner Scanner  102", 195000, 500100, 365102);
//        Product products2p6 = productcatalog.newProduct("Speedy color Scanner 611", 900000, 125000, 1650000);
//        Product products2p7 = productcatalog.newProduct("Premier Printer 300", 322000, 470000, 736500);
//        Product products2p8 = productcatalog.newProduct("Color Photocopier 500", 350000, 580000, 780000);
//
//// Create User accounts that link to specific profiles
//        UserAccountDirectory uadirectory = business.getUserAccountDirectory();
//        UserAccount ua1 = uadirectory.newUserAccount(salespersonprofile, "Sales", "XXXX"); /// order products for one of the customers and performed by a sales person
//        UserAccount ua2 = uadirectory.newUserAccount(marketingpersonprofile0, "Marketing", "XXXX"); /// order products for one of the customers and performed by a sales person
//        UserAccount ua3 = uadirectory.newUserAccount(employeeprofile0, "Admin", "XXXX"); /// order products for one of the customers and performed by a sales person
//
//// Process Orders on behalf of sales person and customer
//        MasterOrderList masterorderlist = business.getMasterOrderList();
//        Order order1 = masterorderlist.newOrder(customerprofile4, salespersonprofile);
//        OrderItem oi1 = order1.newOrderItem(products1p1, 18000, 1);
//        OrderItem oi2 = order1.newOrderItem(products1p2, 19500, 4);
//        OrderItem oi3 = order1.newOrderItem(products1p3, 36500, 10);
//        OrderItem oi4 = order1.newOrderItem(products1p4, 50000, 1);
//        OrderItem oi5 = order1.newOrderItem(products1p5, 25000, 3);
//        OrderItem oi6 = order1.newOrderItem(products1p6, 105000, 2);
//        OrderItem oi7 = order1.newOrderItem(products1p7, 36500, 3);
//        OrderItem oi8 = order1.newOrderItem(products1p8, 50000, 2);
//
//        Order order12 = masterorderlist.newOrder(customerprofile4, salespersonprofile);
//        OrderItem oi112 = order1.newOrderItem(products1p1, 17000, 1);
//        OrderItem oi12 = order1.newOrderItem(products1p2, 9500, 4);
//        OrderItem oi13 = order1.newOrderItem(products1p3, 29500, 10);
//        OrderItem oi14 = order1.newOrderItem(products1p4, 30000, 1);
//        OrderItem oi15 = order1.newOrderItem(products1p5, 2000, 3);
//        OrderItem oi16 = order1.newOrderItem(products1p6, 95000, 2);
//        OrderItem oi17 = order1.newOrderItem(products1p7, 26500, 3);
//        OrderItem oi18 = order1.newOrderItem(products1p8, 40000, 2);
//
//        Order order13 = masterorderlist.newOrder(customerprofile4, salespersonprofile);
//        oi112 = order13.newOrderItem(products1p1, 19000, 1);
//        oi12 = order13.newOrderItem(products1p2, 10500, 4);
//        oi13 = order13.newOrderItem(products1p3, 20500, 10);
//        oi14 = order13.newOrderItem(products1p4, 40000, 1);
//        oi15 = order13.newOrderItem(products1p5, 4000, 3);
//        oi16 = order13.newOrderItem(products1p6, 105000, 2);
//        oi17 = order13.newOrderItem(products1p7, 36500, 3);
//        oi18 = order13.newOrderItem(products1p8, 550000, 1);
//
//        ProductSummary ps = new ProductSummary(products1p8);
//
//        System.out.println("Stats==========================");
//        System.out.println("Sales Volume:  " + ps.getSalesRevenues());
//        System.out.println("Profit Margin:  " + ps.getProductPricePerformance());
//        System.out.println("Frequency above target:  " + ps.getNumberAboveTarget());
//        System.out.println("Frequency Below:  " + ps.getNumberBelowTarget());
////===============================
//
//        MarketCatalog mc = business.getMarketCatalog();
//        ChannelCatalog cc = business.getChannelCatalog();
//        MarketChannelComboCatalog mccc = business.getMarketChannelComboCatalog();
//
//        return business;
//
//    }

    static Business initializeMarkets() {
        Business business = new Business("Xerox");

// Create Persons
        PersonDirectory persondirectory = business.getPersonDirectory(); // create PersonDirectory
// person representing sales organization        
        Person xeroxbusinessmanager001 = persondirectory.newPerson("Xerox businessmanager"); // load PersonDirectory with at least 12 persons (1 businessManager, 1 MarketingManager, 5 SalesPerson, 5 Customers)
        Person xeroxsalesperson001 = persondirectory.newPerson("Xerox sales001");
        Person xeroxsalesperson002 = persondirectory.newPerson("Xerox sales002");
        Person xeroxsalesperson003 = persondirectory.newPerson("Xerox sales003");
        Person xeroxsalesperson004 = persondirectory.newPerson("Xerox sales004");
        Person xeroxsalesperson005 = persondirectory.newPerson("Xerox sales005");
        Person xeroxmarketingperson001 = persondirectory.newPerson("Xerox marketing");
        Person genzcustomerperson = persondirectory.newPerson("genz customer001");
        Person millenialcustomerperson = persondirectory.newPerson("millenial customer001");
        Person genxcustomerperson = persondirectory.newPerson("genx customer001");
        Person boomercustomerperson = persondirectory.newPerson("boomer customer001");
//        Person teencustomerperson005 = persondirectory.newPerson("teen customer005");
        Person xeroxadminperson001 = persondirectory.newPerson("xerox admin");

// Create Sales people
        SalesPersonDirectory salespersondirectory = business.getSalesPersonDirectory(); // create SalesPersonDirectory
        SalesPersonProfile salesperson1profile = salespersondirectory.newSalesPersonProfile(xeroxsalesperson001); // load SalesPersonDirectory with at least 5 profiles
        SalesPersonProfile salesperson2profile = salespersondirectory.newSalesPersonProfile(xeroxsalesperson002);
        SalesPersonProfile salesperson3profile = salespersondirectory.newSalesPersonProfile(xeroxsalesperson003);
        SalesPersonProfile salesperson4profile = salespersondirectory.newSalesPersonProfile(xeroxsalesperson004);
        SalesPersonProfile salesperson5profile = salespersondirectory.newSalesPersonProfile(xeroxsalesperson005);

        // Create Marketing people
        MarketingPersonDirectory marketingpersondirectory = business.getMarketingPersonDirectory(); //create MarketingPersonDirectory
        MarketingPersonProfile marketingpersonprofile0 = marketingpersondirectory.newMarketingPersonProfile(xeroxmarketingperson001); // load MarketingPersonDirectory with 1 profile

        // Create Admins to manage the business
        EmployeeDirectory employeedirectory = business.getEmployeeDirectory();
        EmployeeProfile employeeprofile0 = employeedirectory.newEmployeeProfile(xeroxadminperson001);

        SupplierDirectory suplierdirectory = business.getSupplierDirectory(); // create supplierDirectory

        Supplier supplier1 = suplierdirectory.newSupplier("Lenovo"); // load first supplier
        ProductCatalog productcatalog = supplier1.getProductCatalog(); // create first supplier productCatalog
        Product products1p1 = productcatalog.newProduct("Scanner 3  1", 2000, 16500, 10000); // load first supplier product catalog
        Product products1p2 = productcatalog.newProduct("Scanner 4", 10000, 25000, 16500);
        Product products1p3 = productcatalog.newProduct("Printer 2", 22000, 40000, 36500);
        Product products1p4 = productcatalog.newProduct("Photocopier 2 ", 30000, 70000, 50000);
        Product products1p5 = productcatalog.newProduct("Scanner  5", 19000, 36500, 25000);
        Product products1p6 = productcatalog.newProduct("Scanner 6", 90000, 125000, 105000);
        Product products1p7 = productcatalog.newProduct("Printer 3", 22000, 60000, 36500);
        Product products1p8 = productcatalog.newProduct("Photocopier 3", 30000, 70000, 50000);

        //       SupplierDirectory suplierdirectory = business.getSupplierDirectory();
        Supplier supplier2 = suplierdirectory.newSupplier("Epson"); //load second supploer
        productcatalog = supplier2.getProductCatalog(); // create second supplier product catalog
        Product products2p1 = productcatalog.newProduct("Scanner 13  1", 12000, 26000, 18500); //load second supplier product catalog
        Product products2p2 = productcatalog.newProduct("Scanner 14", 90000, 165000, 125000);
        Product products2p3 = productcatalog.newProduct("Color Printer 112", 422000, 540000, 495000);
        Product products2p4 = productcatalog.newProduct("Photocopier 922 ", 430000, 890000, 550000);
        Product products2p5 = productcatalog.newProduct("Low toner Scanner  102", 195000, 500100, 365102);
        Product products2p6 = productcatalog.newProduct("Speedy color Scanner 611", 900000, 125000, 1650000);
        Product products2p7 = productcatalog.newProduct("Premier Printer 300", 322000, 470000, 736500);
        Product products2p8 = productcatalog.newProduct("Color Photocopier 500", 350000, 580000, 780000);

        // Create User accounts that link to specific profiles
        UserAccountDirectory uadirectory = business.getUserAccountDirectory(); // Create userAccountDirectory 
        UserAccount ua1 = uadirectory.newUserAccount(salesperson1profile, "Sales001", "XXXX"); // load userAccountDirectory with 5 salesPersonprofiles, 1 marketing person profile, 1 business manager profile
        UserAccount ua12 = uadirectory.newUserAccount(salesperson2profile, "Sales002", "XXXX");
        UserAccount ua13 = uadirectory.newUserAccount(salesperson2profile, "Sales003", "XXXX");
        UserAccount ua14 = uadirectory.newUserAccount(salesperson2profile, "Sales004", "XXXX");
        UserAccount ua15 = uadirectory.newUserAccount(salesperson2profile, "Sales005", "XXXX");
        UserAccount ua2 = uadirectory.newUserAccount(marketingpersonprofile0, "Marketing", "XXXX");
        UserAccount ua3 = uadirectory.newUserAccount(employeeprofile0, "Admin", "XXXX"); /// order products for one of the customers and performed by a sales person

//=============== Define markets and channels...
        MarketCatalog mc = business.getMarketCatalog(); // create marketCatalog
        Market genzMarket = mc.newMarket("Gen Z"); // load it with 4 markets namely gen z, millenials, gen x, boomers 
        Market millenialMarket = mc.newMarket("Millenials");
        Market genxMarket = mc.newMarket("Gen X");
        Market boomerMarket = mc.newMarket("Baby Boomer");

        ChannelCatalog channelCatalog = business.getChannelCatalog(); // create channelCatalog

        Channel tvchannel = channelCatalog.newChannel("tv"); // load it with 4 channels namely tv, web, radio, social media
        Channel webchannel = channelCatalog.newChannel("web");
        Channel radiochannel = channelCatalog.newChannel("radio");
        Channel socialmediachannel = channelCatalog.newChannel("social media");
        
        genzMarket.addValidChannel(socialmediachannel); // add valid channel to appropriate market, every market should have atleast one valid channel
        millenialMarket.addValidChannel(webchannel);
        genxMarket.addValidChannel(tvchannel);
        boomerMarket.addValidChannel(radiochannel);

        MarketChannelComboCatalog mccc = business.getMarketChannelComboCatalog(); // create MarketChannelComboCatalog

        MarketChannelAssignment genzmca = mccc.newMarketChannelCombo(genzMarket, socialmediachannel); // now assign each market to all of their valid channels
        MarketChannelAssignment millenialmca = mccc.newMarketChannelCombo(millenialMarket, webchannel);
        MarketChannelAssignment genxmca = mccc.newMarketChannelCombo(genxMarket, tvchannel);
        MarketChannelAssignment boomermca = mccc.newMarketChannelCombo(boomerMarket, radiochannel);

        SolutionOfferCatalog solutionoffercatalog = business.getSolutionOfferCatalog(); // create SolutionOfferCatalog

        SolutionOffer solutionsocialmediagenz1 = solutionoffercatalog.newSolutionOffer(genzmca, "sm-genz-so1"); // add solutionOffering for every marketchannelassignment created above
        solutionsocialmediagenz1.addProduct(products2p2); // add few products to the solutionOffering
        solutionsocialmediagenz1.addProduct(products2p1);
        
        SolutionOffer solutionsocialmediagenz2 = solutionoffercatalog.newSolutionOffer(genzmca, "sm-genz-sol2"); // add solutionOffering for every marketchannelassignment created above
        solutionsocialmediagenz2.addProduct(products2p2); // add few products to the solutionOffering
        solutionsocialmediagenz2.addProduct(products2p1);
        
        SolutionOffer solutionsocialmediagenz3 = solutionoffercatalog.newSolutionOffer(genzmca, "sm-genz-sol3"); // add solutionOffering for every marketchannelassignment created above
        solutionsocialmediagenz3.addProduct(products2p2); // add few products to the solutionOffering
        solutionsocialmediagenz3.addProduct(products2p1);

        SolutionOffer solutionmillenialweb1 = solutionoffercatalog.newSolutionOffer(millenialmca, "web-millenial-sol1");
        solutionmillenialweb1.addProduct(products2p2);
        solutionmillenialweb1.addProduct(products2p1);
        
        SolutionOffer solutionmillenialweb2 = solutionoffercatalog.newSolutionOffer(millenialmca, "web-millenial-sol2");
        solutionmillenialweb2.addProduct(products2p2);
        solutionmillenialweb2.addProduct(products2p1);
        
        SolutionOffer solutionmillenialweb3 = solutionoffercatalog.newSolutionOffer(millenialmca, "web-millenial-sol3");
        solutionmillenialweb3.addProduct(products2p2);
        solutionmillenialweb3.addProduct(products2p1);
        
        SolutionOffer solutiongenxtv1 = solutionoffercatalog.newSolutionOffer(genxmca, "tv-genx-sol1");
        solutiongenxtv1.addProduct(products2p2);
        solutiongenxtv1.addProduct(products2p1);
        
        SolutionOffer solutiongenxtv2 = solutionoffercatalog.newSolutionOffer(genxmca, "tv-genx-sol2");
        solutiongenxtv2.addProduct(products2p2);
        solutiongenxtv2.addProduct(products2p1);
        
        SolutionOffer solutiongenxtv3 = solutionoffercatalog.newSolutionOffer(genxmca, "tv-genx-sol3");
        solutiongenxtv3.addProduct(products2p2);
        solutiongenxtv3.addProduct(products2p1);

        SolutionOffer solutionboomerradio1 = solutionoffercatalog.newSolutionOffer(boomermca, "radio-boomer-sol1");
        solutionboomerradio1.addProduct(products2p2);
        solutionboomerradio1.addProduct(products2p1);
        
        SolutionOffer solutionboomerradio2 = solutionoffercatalog.newSolutionOffer(boomermca, "radio-boomer-sol2");
        solutionboomerradio2.addProduct(products2p2);
        solutionboomerradio2.addProduct(products2p1);
        
        SolutionOffer solutionboomerradio3 = solutionoffercatalog.newSolutionOffer(boomermca, "radio-boomer-sol3");
        solutionboomerradio3.addProduct(products2p2);
        solutionboomerradio3.addProduct(products2p1);
        
        MasterSolutionOrderList msol = business.getMasterSolutionOrderList(); // create MasterSolutionOrderList

        // Create Customers
        CustomerDirectory customedirectory = business.getCustomerDirectory(); // create CustomerDirectory
//        CustomerProfile customerprofile1 = customedirectory.newCustomerProfile(xeroxsalesperson001);
        CustomerProfile genzcustomer = customedirectory.newCustomerProfile(genzcustomerperson, socialmediachannel, genzMarket); // load CustomerDirectory
        CustomerProfile millenialcustomer = customedirectory.newCustomerProfile(millenialcustomerperson, webchannel, millenialMarket);
        CustomerProfile genxcustomer = customedirectory.newCustomerProfile(genxcustomerperson, tvchannel, genxMarket);
        CustomerProfile boomercustomer = customedirectory.newCustomerProfile(boomercustomerperson, radiochannel, boomerMarket);

        SolutionOrder so21 = msol.newSolutionOrder(millenialcustomer, salesperson2profile, solutionmillenialweb1, millenialmca, 160000, 1); // end of data generation
        SolutionOrder so22 = msol.newSolutionOrder(millenialcustomer, salesperson2profile, solutionmillenialweb1, millenialmca, 160000, 1); // end of data generation
        SolutionOrder so23 = msol.newSolutionOrder(millenialcustomer, salesperson2profile, solutionmillenialweb1, millenialmca, 160000, 1); // end of data generation
        SolutionOrder so24 = msol.newSolutionOrder(millenialcustomer, salesperson2profile, solutionmillenialweb2, millenialmca, 160000, 1); // end of data generation
        SolutionOrder so25 = msol.newSolutionOrder(millenialcustomer, salesperson2profile, solutionmillenialweb2, millenialmca, 160000, 1); // end of data generation
        SolutionOrder so26 = msol.newSolutionOrder(millenialcustomer, salesperson2profile, solutionmillenialweb3, millenialmca, 160000, 1); // end of data generation
        SolutionOrder so27 = msol.newSolutionOrder(millenialcustomer, salesperson2profile, solutionmillenialweb3, millenialmca, 160000, 1); // end of data generation

        SolutionOrder so11 = msol.newSolutionOrder(genzcustomer, salesperson1profile, solutionsocialmediagenz2, genzmca, 174500, 1); // add solutionOrders to masterSolutionOrderList
        SolutionOrder so12 = msol.newSolutionOrder(genzcustomer, salesperson1profile, solutionsocialmediagenz2, genzmca, 154500, 1); // use uneven combinations of customers, salespersons, markets, etc so that we have top 3 customers, top 3 salespersons
        SolutionOrder so13 = msol.newSolutionOrder(genzcustomer, salesperson1profile, solutionsocialmediagenz1, genzmca, 154100, 1);
        SolutionOrder so14 = msol.newSolutionOrder(genzcustomer, salesperson1profile, solutionsocialmediagenz3, genzmca, 130000, 1);
        
        SolutionOrder so31 = msol.newSolutionOrder(genxcustomer, salesperson3profile, solutiongenxtv3, genxmca, 140000, 1); // add solutionOrders to masterSolutionOrderList
        SolutionOrder so32 = msol.newSolutionOrder(genxcustomer, salesperson3profile, solutiongenxtv3, genxmca, 145000, 1); // use uneven combinations of customers, salespersons, markets, etc so that we have top 3 customers, top 3 salespersons
        SolutionOrder so33 = msol.newSolutionOrder(genxcustomer, salesperson3profile, solutiongenxtv1, genxmca, 170000, 1);
        SolutionOrder so34 = msol.newSolutionOrder(genxcustomer, salesperson3profile, solutiongenxtv2, genxmca, 170000, 1);
        
        SolutionOrder so41 = msol.newSolutionOrder(boomercustomer, salesperson4profile, solutionboomerradio1, boomermca, 150000, 1);
        SolutionOrder so42 = msol.newSolutionOrder(boomercustomer, salesperson4profile, solutionboomerradio2, boomermca, 141000, 1);
        SolutionOrder so43 = msol.newSolutionOrder(boomercustomer, salesperson4profile, solutionboomerradio3, boomermca, 139000, 1);
//        SolutionOrder so34 = msol.newSolutionOrder(genxcustomer, salesperson3profile, solutiongenxtv3, genzmca, 130000, 1);
        
        
        
//        int genxsocialmediarevenue = msol.getRevenueByMarketChannelCombo(millenialmca);
//        int millenialwebrevenue = msol.getRevenueByMarketChannelCombo(millenialmca);
//        int tvRevenue = msol.getRevenueByChannel(tvchannel);
//        int webRevenue = msol.getRevenueByChannel(webchannel);
//        int solutionwebteenRevenue = solutionmillenialweb.getSolutionOfferPricePerformance();
//        int solutionsocialmediateenRevenue = solutionsocialmediateen.getSolutionOfferPricePerformance();

//        System.out.println("revenue by tv-teen" + genxsocialmediarevenue);
//        System.out.println("revenue by web-teen" + millenialwebrevenue);
//        System.out.println("revenue by tv" + tvRevenue);
//        System.out.println("revenue by web" + webRevenue);
//        System.out.println("priceperformance of solutionwebteen"+ solutionwebteenRevenue);
//        System.out.println("priceperformance of solutiontvteen"+ solutionsocialmediateenRevenue);

////        Usecase 1
//        Map<Market, ArrayList<SolutionOffer>> top3solutions = mccc.getTop3SolutionsOfEachMarkets();
//
//        for (Map.Entry<Market, ArrayList<SolutionOffer>> entry : top3solutions.entrySet()) {
//            System.out.println("---Market: " + entry.getKey().getName() + "----");
////            entry.getValue().sort(new SolutionOfferComparator());
//            for (SolutionOffer so : entry.getValue()) {
//                System.out.println("Solution Offer name: " + so.getName() + " Frequency of orders above target: " + so.getFrequencyAboveTarget());
//            }
//        }
//
////        Usecase 2
//        CustomersReport cr = customedirectory.generatCustomerPerformanceReport();
//        ArrayList<CustomerSummary> sorted = cr.getSummariesSortedFrequencyAboveTarget();
//
//        for (CustomerSummary cs : sorted) {
//            System.out.println("Customer ID: " + cs.getCustomer().getCustomerId() + " Solution Orders Above Target: " + cs.getFrequencyOfSolutionOrdersAboveTarget());
//        }
//
////        Usecase 3
//        SalesPersonsReport spr = salespersondirectory.generateSalesPersonsReport();
//        ArrayList<SalesPersonSummary> sortedSales = spr.getSummariesSortedByFrequencyAboveTarget();
//
//        for (SalesPersonSummary ss : sortedSales) {
//            System.out.println("SalesPerson ID:" + ss.getSalesPerson().getPerson().getPersonId() + " Solution Orders Above Target: " + ss.getFrequencyOfSolutionOrdersAboveTarget());
//        }
//
////        Usecase 4
//        Map<Integer, Market> map = mccc.getPricePerformanceOfEachMarkets();
//
//        for (Map.Entry<Integer, Market> entry : map.entrySet()) {
//            System.out.println("Market Name:" + entry.getValue().getName() + " Revenue: " + entry.getKey());
//        }
//
////        Usecase 5
//        System.out.println("poor performing solutionoffers");
//        for(SolutionOffer so: solutionoffercatalog.poorPerformingSolutionOffers()) {
//            System.out.println("name: "+so.getName()+" target price: " + so.getTargetPrice() +" suggested price: "+so.getSuggestedPrice());
//        }
//        System.out.println("good performing solutionoffers");
//        for(SolutionOffer so: solutionoffercatalog.goodPerformingSolutionOffers()) {
//            System.out.println("name: "+so.getName()+" target price: " + so.getTargetPrice() +" suggested price: "+so.getSuggestedPrice());
//        }
        return business;

    }

}
