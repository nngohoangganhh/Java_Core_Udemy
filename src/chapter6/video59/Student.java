package chapter6.video59;

public class Student {
   private String name;
   private String grade;

  public Student( String name , String grade){
     this.grade= grade;
     this.name = name;
  }
  public String getName(){
       return this.name;
  }
  public void setName(String name){
      this.name = name;
  }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}

