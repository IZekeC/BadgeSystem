
import java.util.ArrayList;

public class Grade {

    private char grade;
    private BadgeContainer academic;
    private BadgeContainer extraCir;

    public Grade(char grade){
        this.grade = grade;
        this.academic = new BadgeContainer();
        this.extraCir = new BadgeContainer();
    }
}