public class time {

    int hr;
    int min;
    int seconds;

    time() {
        hr = 0;
        min = 0;
        seconds = 0;
    }

    time(int hr, int min, int seconds) {

        if (hr >= 0 && hr <= 23) {
            this.hr = hr;
        } else {
            this.hr = 0;
        }

        if (min >= 0 && min <= 59) {
            this.min = min;
        } else {
            this.min = 0;
        }

        if (seconds >= 0 && seconds <= 59) {
            this.seconds = seconds;
        } else {
            this.seconds = 0;
        }
    }


    void display() {
        System.out.println("Time: " + hr + ":" + min + ":" + seconds);
    }


    public static void main(String[] args) {

        time t1 = new time();

        time t2 = new time(10, 30, 45);

        System.out.println("Time 1:");
        t1.display();

        System.out.println("Time 2:");
        t2.display();
    }
}

