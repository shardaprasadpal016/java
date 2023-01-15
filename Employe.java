class Employe
 {
    String name;
    int Emp_id;
    Employe(String name,int Emp_id)
    {
        this.name=name;
        this.Emp_id=Emp_id;
    }
    public static void main(String[] args) 
    {
        Employe e1=new Employe("sharda" ,101);

        Employe e2= new Employe("santosh",102);
Employe e3= new Employe("deepak", 103);
Employe e4=new Employe("rc", 104);
System.out.println("Employe 1:"+e1.name+" "+e1.Emp_id);
System.out.println("Employe 2:"+e2.name+" "+e2.Emp_id);
System.out.println("Employe 3:"+e3.name+" "+e3.Emp_id);

System.out.println("Employe 4:"+e4.name+" "+e4.Emp_id);

    }
}
