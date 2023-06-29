package ISO_2022_A11;

public class Date {
    private int month;
    private int day;
    private int year;

    public boolean isLeap() {
        if (this.year % 400 == 0) {
            return true;
        } else if (this.year % 100 == 0) {
            return false;
        } else if (this.year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public Date(int month, int day, int year) throws IllegalArgumentException {
        setMonth(month);
        setDay(day);
        setYear(year);

        if (day < 0 || month < 0 || year < 0) {
            throw new IllegalArgumentException("Data parameters has to be bigger than 0");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
    
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

   
}
