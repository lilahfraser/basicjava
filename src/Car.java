public class Car {
    private int year;
    private int miles;
    private String model;
//constructor

    public Car(int year, int miles, String model) {
        this.year = year;
        this.miles= miles;
        this.model= model;

    }
//setter

    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }
    public void setMiles(int miles) {
        this.miles = miles;
    }

    public int getMiles() {
        return miles;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }

//toString


    public void drive(int miles) {
        this.miles += miles;
    }

    public String toString(){
        return
                "My car is a " +
                        this.getYear() + " " +
                        this.getModel()+ " and has " +
                        this.getMiles()+ " miles. ";

    }

}

