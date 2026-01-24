public class ProfileStats {
    public static void main(String[] args) {
       
        byte age = 25;                           
        short weightKg = 68;                     
         int salary = 750000;                    
        long phoneNumber = 9876543210L;           
        float heightCm = 175.5f;         
        double gpa = 8.75;                       
          char bloodGroup = 'B';            
        boolean isEmployed = true; 
      
                System.out.println("=== Personal Profile Stats ===");
        System.out.println("Age: " + age + " years");
        System.out.println("Weight: " + weightKg + " kg");
        System.out.println("Annual Salary: ₹" + salary);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Height: " + heightCm + " cm");
        System.out.println("GPA: " + gpa);
        System.out.println("Blood Group: " + bloodGroup + "+");
        System.out.println("Employed: " + isEmployed);

                
        int yearsToRetire = 65 - age;
        System.out.println("Years to retirement: " + yearsToRetire);
    }
}
