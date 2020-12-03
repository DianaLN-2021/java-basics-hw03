public class Student {
  int rating;
  private String name;
  public static int count = 0;
  public static double ratingSum = 0;


  public Student(String name) {
    this.name = name;
    count++;

  }

  public static double getAvgRating() {
    return ratingSum/count;
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
    ratingSum = ratingSum + this.rating;
  }

  public boolean betterStudent(Student student) {
    return this.rating > student.rating;
  }

  public void changeRating(int rating) {
    ratingSum = ratingSum - this.rating;
    this.rating = rating;
    ratingSum = ratingSum + this.rating;
  }

  public static void removeStudent(Student student) {
    // TODO remove student
  }

  @Override
  public String toString() {
    return this.name + " " + this.rating;
  }
}
