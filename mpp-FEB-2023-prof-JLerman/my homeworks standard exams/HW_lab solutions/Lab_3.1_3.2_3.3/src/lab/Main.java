package lab;

public class Main {

    public static void main(String args[]) {
        Company c1InfoSys = new Company("InfoSys");

        Department d1Sales =new Department("Sales", "Z Street", c1InfoSys);
        Department d2Marketing = new Department("Marketing", "N Street", c1InfoSys);
        c1InfoSys.addDept(d1Sales);
        c1InfoSys.addDept(d2Marketing);

//        d1Accounts.setDepartmentOf(c1InfoSys);
//        d2Technical.setDepartmentOf(c1InfoSys);

        Position p8SalesDepartmentHead = new Position(d1Sales, "Sales Department Head", "Look after both sales team");
        Position p1AdvertisingSalesLead = new Position(d1Sales,"Advertising Sales", "Monitor sales got through Advertising");
        Position p2OrganicSalesLead = new Position(d1Sales, "Organic sales", "Monitor Organic Sales");
        Position p3SalesExecutive = new Position(d1Sales, "Sales Executive", "generate new leads and close sales" );
        Position p4SalesExecutive = new Position(d1Sales, "Sales Executive", "generate new leads and close sales");
        Position p5SalesExecutive = new Position(d1Sales, "Sales Executive", "generate new leads and close sales");
        Position p6SalesExecutive = new Position(d1Sales, "Sales Executive", "generate new leads and close sales");
        Position p7SalesExecutive = new Position(d1Sales, "Sales Executive", "generate new leads and close sales");

        Position p9TeleMarketer = new Position(d2Marketing,"Tele-Marketer", "handle customer calls");
        Position p10MarketingDeptHead= new Position(d2Marketing, "Marketing Lead", "guide juniors");
        Position p12CompanyHead = new Position(null, "Company Head", "company head");

        d1Sales.addPosition(p1AdvertisingSalesLead);
        d1Sales.addPosition(p2OrganicSalesLead);
        d1Sales.addPosition(p3SalesExecutive);
        d1Sales.addPosition(p4SalesExecutive);
        d1Sales.addPosition(p5SalesExecutive);
        d1Sales.addPosition(p6SalesExecutive);
        d1Sales.addPosition(p7SalesExecutive);
        d1Sales.addPosition(p8SalesDepartmentHead);

        d2Marketing.addPosition(p9TeleMarketer);
        d2Marketing.addPosition(p10MarketingDeptHead);

        Employee e1Ron = new Employee(1, "Ron", "",
                "", "08/3/1994", "123456789", 12000);
        Employee e2Anne = new Employee(2, "Anne", "",
                "", "08/3/1996", "123456784", 140000);
        Employee e3gary = new Employee(3, "Gary", "",
                "", "3/3/2000", "123456783", 110000);
        Employee e4Peter = new Employee(4, "Peter", "",
                "Thakur", "08/3/1995", "123456782", 11000);
        Employee e5Stan = new Employee(5, "Stan", "Koi",
                "Thahchaina", "08/1/1991", "123456781", 4000);

        Employee e5Bill = new Employee(6, "Bill", "Koi",
                "", "08/1/1991", "123456712", 4000);
        Employee e6Dan = new Employee(7, "Dan", "Koi",
                "", "08/1/1992", "123456713", 4000);
        Employee e7Tom = new Employee(8, "Tom", "Koi",
                "", "08/11/1991", "123456714", 4000);
        Employee e8Sue = new Employee(9, "Sue", "Koi",
                "", "08/1/1991", "123456715", 4000);
        Employee e9Marc = new Employee(10, "Marc", "Koi",
                "", "08/1/1991", "123456716", 4000);

        Employee e10Lyle = new Employee(11, "lyle", "", "",
                "09/1/2000", "123456123", 120000);

        p12CompanyHead.setE(e10Lyle);
        p12CompanyHead.addInferior(p8SalesDepartmentHead);
        p12CompanyHead.addInferior(p10MarketingDeptHead);

        p8SalesDepartmentHead.setE(e1Ron);
        p8SalesDepartmentHead.setSuperior(p12CompanyHead);
        p8SalesDepartmentHead.addInferior(p1AdvertisingSalesLead);
        p8SalesDepartmentHead.addInferior(p2OrganicSalesLead);

        p1AdvertisingSalesLead.setE(e4Peter);
        p1AdvertisingSalesLead.setSuperior(p8SalesDepartmentHead);
        p1AdvertisingSalesLead.addInferior(p3SalesExecutive);
        p1AdvertisingSalesLead.addInferior(p4SalesExecutive);

        p2OrganicSalesLead.setE(e5Stan);
        p2OrganicSalesLead.setSuperior(p8SalesDepartmentHead);
        p2OrganicSalesLead.addInferior(p5SalesExecutive);
        p2OrganicSalesLead.addInferior(p6SalesExecutive);
        p2OrganicSalesLead.addInferior(p7SalesExecutive);

        p3SalesExecutive.setE(e5Bill);
        p3SalesExecutive.setSuperior(p1AdvertisingSalesLead);

        p4SalesExecutive.setE(e6Dan);
        p4SalesExecutive.setSuperior(p1AdvertisingSalesLead);

        p5SalesExecutive.setE(e7Tom);
        p5SalesExecutive.setSuperior(p2OrganicSalesLead);

        p6SalesExecutive.setE(e8Sue);
        p6SalesExecutive.setSuperior(p2OrganicSalesLead);

        p7SalesExecutive.setE(e9Marc);
        p7SalesExecutive.setSuperior(p2OrganicSalesLead);

        p10MarketingDeptHead.setE(e2Anne);
        p10MarketingDeptHead.setSuperior(p12CompanyHead);
        p10MarketingDeptHead.addInferior(p9TeleMarketer);

        p9TeleMarketer.setE(e3gary);
        p9TeleMarketer.setSuperior(p10MarketingDeptHead);

        c1InfoSys.print();
        c1InfoSys.printReportingHierarchy();

        System.out.printf("Total company salary: %,4.2f",c1InfoSys.getSalary());


    }


}