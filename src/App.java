public class App {
    public static void main(String[] args) {
        String firstName = "Danah";
        String lastName = "Alhazeem";
        int age =24;
        int Amount = 562;

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age);
        System.out.println(Amount);

        boolean married = false;
        System.out.println("are you married"+married);

        int amount = 20;
        String deposit = "Deposit";
        String withdraw = "Withdraw";
        System.out.println("The amount is "+amount+ "kd");
        System.out.println("Would you like to "+deposit+" or "+withdraw+" the amount?");

         amount = 90;

        System.out.println("The amount is "+amount +"KD");

        int amount2 = 5;
        System.out.println(amount2+ " plus "+amount2+" makes" + (amount2+amount2));

        String fullName = "John doe";


        String[] names = fullName.split(" ");
        String firstName1 = names[0].toUpperCase();
        String lastName1 = names[1];
        int lastNameLength = lastName1.length();


        String output = "My name is " + firstName1 + " and my last name length is " + lastNameLength;
        System.out.println(output);
        boolean startsWithD = lastName1.startsWith("d");
        System.out.println(startsWithD);
    }
}