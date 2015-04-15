package ohtu;

public class Submission {
    private String student_number;
    private String week;
    private int hours;
    private boolean a1;
    private boolean a2;
    private boolean a3;
    private boolean a4;
    private boolean a5;
    private boolean a6;
    private boolean a7;
    private boolean a8;
    private boolean a9;
    private boolean a10;
    private boolean a11;
    
    public String getStudent_number() {
        return student_number;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }
    
    public String getWeek(){
        return week;
    }
    
    public int getHours(){
        return hours;
    }

    public boolean isA(int ex) {
        switch(ex) {
            case 1: return a1;
            case 2: return a2;
            case 3: return a3;
            case 4: return a4;
            case 5: return a5;
            case 6: return a6;
            case 7: return a7;
            case 8: return a8;
            case 9: return a9;
            case 10: return a10;    
            case 11: return a11;    
        }
        return false;
    }
   
    @Override
    public String toString() {
        return " \nviikko " + week + ": \n\t"
                + "aikaa käytetty " + hours + " tuntia";
    }
    
}