package TicketsManager;

public class Ticket implements Comparable<Ticket> {
    private int id;
    private String from;
    private String to;
    private int price;
    private int time;

    public Ticket(int id, String from, String to, int price, int time) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.price = price;
        this.time = time;

    }

    public String getFrom() {
        return from;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public int getTime() {
        return time;
    }

    public String getTo() {
        return to;
    }

    @Override
    public int compareTo(Ticket o) {
        if (price < o.getPrice()) {
            return -1;
        }
        if (price > o.getPrice()) {
            return 1;
        }
        return 0;
    }
}

