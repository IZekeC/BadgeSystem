
import java.util.ArrayList;


public class Grade {
    private int grade_num;
    private BadgeContainer badgeAca;
    private BadgeContainer badgeExt;

    public Grade(char grade){
        this.badgeAca = new ArrayList<>();
        this.badgeExt = new ArrayList<>();
        this.grade_num=grade;
    }
}