public class Clock {

    private int hours;
    private int minutes;

    // Creates a clock whose initial time is h hours and m minutes.
    public Clock(int h, int m) {
        if (h < 0 || h > 23 || m < 0 || m > 59) {
            throw new IllegalArgumentException("Invalid hours or minutes");
        }
        this.hours = h;
        this.minutes = m;
    }

    // Creates a clock whose initial time is specified as a string, using the format HH:MM.
    public Clock(String s) {
        if (!s.matches("^\\d{2}:\\d{2}$")) {
            throw new IllegalArgumentException("Invalid time format");
        }
        String[] timeParts = s.split(":");
        int h = Integer.parseInt(timeParts[0]);
        int m = Integer.parseInt(timeParts[1]);

        if (h < 0 || h > 23 || m < 0 || m > 59) {
            throw new IllegalArgumentException("Invalid hours or minutes");
        }

        this.hours = h;
        this.minutes = m;
    }

    // Returns a string representation of this clock, using the format HH:MM.
    public String toString() {
        return String.format("%02d:%02d", hours, minutes);
    }

    // Is the time on this clock earlier than the time on that one?
    public boolean isEarlierThan(Clock that) {
        return (this.hours * 60 + this.minutes) < (that.hours * 60 + that.minutes);
    }

    // Adds 1 minute to the time on this clock.
    public void tic() {
        toc(1);
    }

    // Adds Δ minutes to the time on this clock.
    public void toc(int delta) {
        if (delta < 0) {
            throw new IllegalArgumentException("Delta must be non-negative");
        }

        int totalMinutes = this.hours * 60 + this.minutes + delta;
        this.hours = (totalMinutes / 60) % 24;
        this.minutes = totalMinutes % 60;
    }

    // Test client
    public static void main(String[] args) {
        Clock clock1 = new Clock(12, 30);
        System.out.println("Clock 1: " + clock1);

        Clock clock2 = new Clock("08:45");
        System.out.println("Clock 2: " + clock2);

        System.out.println("Is Clock 1 earlier than Clock 2? " + clock1.isEarlierThan(clock2));

        clock1.tic();
        System.out.println("After tic: " + clock1);

        clock2.toc(60);
        System.out.println("After toc(60): " + clock2);
    }
}
