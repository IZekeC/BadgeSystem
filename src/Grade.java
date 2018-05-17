
import java.util.ArrayList;


public class Grade {
    private int grade_num;
    private ArrayList<Academic> badgeAca;
    private ArrayList<ExtraCir> badgeExt;

    public Grade(char grade){
        ArrayList academic_badge = new ArrayList<Academic>();
        ArrayList extra_badge = new ArrayList<ExtraCir>();
        this.badgeAca = academic_badge;
        this.badgeExt = extra_badge;
        this.grade_num=grade;

    }


}