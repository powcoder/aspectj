
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class Grade {

    private int grade;

    public  Grade(int grade) {

        this.grade = grade;

    }

    public String getLetterGrade() {

        return grade >= 95 ? "A+" : "A-";
    }


}
