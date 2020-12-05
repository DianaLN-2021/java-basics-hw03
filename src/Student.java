public class Student {
  int rating;
  private String name;
  public static int count = 0;
  public static double ratingSum = 0;


  public Student(String name) {
    this.name = name;
    Student.count++;
  }

  public static double getAvgRating() {
    if(Student.count != 0) {
      return Student.ratingSum/Student.count;
    }
    return 0;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getRating() {
    return rating;
  }

  public void setRating(int rating) {
    this.rating = rating;
    Student.ratingSum = Student.ratingSum + this.rating;
  }

  public boolean betterStudent(Student student) {
    return this.rating > student.rating;
  }

  public void changeRating(int rating) {
    ratingSum = ratingSum - this.rating;
    this.rating = rating;
    Student.ratingSum = Student.ratingSum + this.rating;
  }

  public static void removeStudent(Student student) {
    Student.count--;
    Student.ratingSum = Student.ratingSum - student.rating;
    student = null;
  }

  @Override
  public String toString() {
    return this.name + " " + this.rating;
  }
}
