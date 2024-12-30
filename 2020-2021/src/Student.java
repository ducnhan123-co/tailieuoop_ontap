public class Student {
    public String masosinhvien;
    public FullName fullname;
    public Address diachi;

    public Student() {
    }

    public Student(String masosinhvien, FullName fullname, Address diachi) {
        this.masosinhvien = masosinhvien;
        this.fullname = fullname;
        this.diachi = diachi;
    }

    public void setStudentID(String masosinhvien)
    {
        this.masosinhvien = masosinhvien;
    }

    public void setFullname(FullName fullname)
    {
        this.fullname=fullname;
    }

    public void setAddress(Address diachi)
    {
        this.diachi=diachi;
    }

    public String getStudentID()
    {
        return masosinhvien;
    }

    public FullName getFName()
    {
        return fullname;
    }
    public Address getDiachi()
    {
        return diachi;
    }

    public void printStudent(){
        System.out.println("Thoong tin 1 sinh vien la: ");
        System.out.println("Ho sinh vien la : "+ this.fullname.ho +" ten dem sinh vien la: "+ this.fullname.tendem + "ten sinh vien laf : "+ this.fullname.ten + " dia chi sin vien la : " + this.diachi.toString());

    }
}

