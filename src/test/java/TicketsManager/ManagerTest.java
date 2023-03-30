package TicketsManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    @Test
    public void testSortTickets() {
        TicketRepository repo = new TicketRepository();
        Manager manager = new Manager(repo);
        Ticket ticket1 = new Ticket(1, "AER", "IST", 100, 80);
        Ticket ticket2 = new Ticket(2, "AER", "EVN", 50, 60);
        Ticket ticket3 = new Ticket(3, "AER", "IST", 150, 80);
        Ticket ticket4 = new Ticket(4, "MOW", "TRV", 400, 720);
        Ticket ticket5 = new Ticket(5, "AER", "IST", 130, 90);
        Ticket ticket6 = new Ticket(6, "AER", "IST", 200, 90);
        Ticket ticket7 = new Ticket(7, "AER", "IST", 90, 90);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] expected = {ticket7, ticket1, ticket5, ticket3, ticket6};
        Ticket[] actual = manager.findAll("AER", "IST");

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testToEVNTickets() {
        TicketRepository repo = new TicketRepository();
        Manager manager = new Manager(repo);
        Ticket ticket1 = new Ticket(1, "AER", "IST", 100, 80);
        Ticket ticket2 = new Ticket(2, "AER", "EVN", 50, 60);
        Ticket ticket3 = new Ticket(3, "AER", "IST", 150, 80);
        Ticket ticket4 = new Ticket(4, "MOW", "TRV", 400, 720);
        Ticket ticket5 = new Ticket(5, "AER", "IST", 130, 90);
        Ticket ticket6 = new Ticket(6, "AER", "IST", 200, 90);
        Ticket ticket7 = new Ticket(7, "AER", "IST", 90, 90);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] expected = {ticket2};
        Ticket[] actual = manager.findAll("AER", "EVN");

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testNoTickets() {
        TicketRepository repo = new TicketRepository();
        Manager manager = new Manager(repo);
        Ticket ticket1 = new Ticket(1, "AER", "IST", 100, 80);
        Ticket ticket2 = new Ticket(2, "AER", "EVN", 50, 60);
        Ticket ticket3 = new Ticket(3, "AER", "IST", 150, 80);
        Ticket ticket4 = new Ticket(4, "MOW", "TRV", 400, 720);
        Ticket ticket5 = new Ticket(5, "AER", "IST", 130, 90);
        Ticket ticket6 = new Ticket(6, "AER", "IST", 200, 90);
        Ticket ticket7 = new Ticket(7, "AER", "IST", 90, 90);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] expected = {};
        Ticket[] actual = manager.findAll("AER", "TRV");

        Assertions.assertArrayEquals(expected, actual);

    }


}