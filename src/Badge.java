public class Badge {

    private String name;
    private String Description;
    private String award_to;
    private String award_by;

    public Badge(String name, String description, String award_by, String award_to){
        this.name = name;
        this.Description = description;
        this.award_by = award_by;
        this.award_to = award_to;
    }

    public String getAward_by() {
        return award_by;
    }

    public String getAward_to() {
        return award_to;
    }

    public String getDescription() {
        return Description;
    }

    public String getName() {
        return name;
    }
}
