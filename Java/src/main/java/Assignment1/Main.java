package Assignment1;

public class Main {
    public static void main(String args[]){
        Bank b1 = new Bank();
        b1.setBankId(123);
        b1.setName("ICICI Bank");
        b1.setLocation("Vasai");
        System.out.println("Welcome to "+b1.getName() +" at "+b1.getLocation());

        Person p1 = new Person();
        p1.setName("Anna");
        p1.setAge(26);
        p1.setEmailId("abc@hawk.iit.edu");
        p1.setMobileNumber(123456789L);
        //System.out.println("Our Customer is "+p1.getName());
        //System.out.println("Her age is "+p1.getAge());
        //System.out.println("Her mobile number is "+p1.getMobileNumber());
        //System.out.println("Her email id is "+ p1.getEmailId());
        //System.out.println("She is senior citizen "+p1.isSeniorCitizen());

        Customer c1 = new Customer();
        c1.setAccountNumber(123456789);
        c1.setAddress("Vasai");
        c1.setBalance(1000.00);
        c1.setAccountActive(true);
        System.out.println("Our Customer is "+p1.getName());
        System.out.println("Her age is "+p1.getAge());
        System.out.println("Her mobile number is "+p1.getMobileNumber());
        System.out.println("Her email id is "+ p1.getEmailId());
        System.out.println("She is senior citizen "+p1.isSeniorCitizen());
        System.out.println("Account number is "+c1.getAccountNumber());
        System.out.println("Address is "+c1.getAddress());
        System.out.println("Balance is "+c1.getBalance());
        System.out.println("Is the Account active "+c1.getAccountActive());
        System.out.println(c1.depositMoney(1000));
        System.out.println("Current Balance "+c1.checkBalance());
        System.out.println("Withdraw "+c1.withdrawMoney(3000));
        System.out.println("Current Balance "+c1.checkBalance());
        System.out.println("Withdraw " +c1.withdrawMoney(1000));
        System.out.println("Current Balance "+c1.checkBalance());



        Person p2 = new Person();
        p2.setName("Mathew");
        p2.setAge(31);
        p2.setEmailId("math@gmail.com");
        p2.setMobileNumber(123456789);
        Employee e2 = new Employee();
        e2.setEmployeeId(1233);
        e2.setDepartment("AWS EC2");
        System.out.println("Our Employee name is "+p2.getName());
        System.out.println("His age is "+p2.getAge());
        System.out.println("His mobile number is "+p2.getMobileNumber());
        System.out.println("His email id "+p2.getEmailId());
        System.out.println("His employee is id "+e2.getEmployeeId());
        System.out.println("His department is "+e2.getDepartment());

    }
}
