package challengeCh05;

public enum Grade {
  A("Excellent"), B("Good"), C("SoSo");

  private String grade;

  private Grade() {}

  private Grade(String grade) {
    this.grade = grade;
  }

  public String getGrade() {
    return grade;
  }

}
