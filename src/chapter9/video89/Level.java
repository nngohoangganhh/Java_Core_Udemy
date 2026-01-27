package chapter9.video89;

public enum Level {
    HARD("kho",9 ),
    MEDIUM("trung binh", 8 ),
    EASY (" dê",7 );

    private final String description;
    private final int count;
    private Level(String description,int count){
         this.count= count;
         this.description = description;
     }

    public String getDescription() {
        return description;
    }

    public int getCount() {
        return count;
    }
}
