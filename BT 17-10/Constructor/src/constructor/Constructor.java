
package constructor;

public class Constructor {

    
    public static void main(String[] args) {
        Student sv1 = new Student();
        System.out.println("Ma so sinh vien :"+sv1.getMssv());
        System.out.println("Ten sinh vien :"+sv1.getName());
        System.out.println("Lop: "+sv1.getlop());
        System.out.println("Dia chi: "+sv1.getdiachi());
        
        
        Student sv2 = new Student (65,"Duong Quoc Tuan","DA17TT","Tra Vinh");
        System.out.println("\nMa so sinh vien :"+sv2.getMssv());
        System.out.println("Ten sinh vien :"+sv2.getName());
        System.out.println("Lop: "+sv2.getlop());
        System.out.println("Dia chi: "+sv2.getdiachi());
        
        
    }
    
}
