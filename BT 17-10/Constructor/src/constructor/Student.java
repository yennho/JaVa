package constructor;

public class Student {

    private int mssv = 23;
    private String name = "Doan Thi Yen Nhi";
    private String lop = "DA17TT";
    private String diachi = "Cang Long";

    public Student() {
    }

    public Student(int mssv, String name,String lop,String diachi) {
        this.mssv = mssv;
        this.name = name;
        this.lop = lop;
        this.diachi = diachi;
    }

    public int getMssv() {
        return mssv;
    }

    public void setMssv(int mssv) {
        this.mssv = mssv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setlop(String lop){
    this.lop = lop;
    }
    
    public String getlop(){
        return lop;
    }
    
    public void setdiachi(String diachi){
    this.diachi = diachi;
    }
    
    public String getdiachi(){
        return diachi;
    }

}
