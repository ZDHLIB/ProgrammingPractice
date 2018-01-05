package DesignPattern.Adapter;

public class ETicket extends TicketAdapter {
    @Override
    public void buyOneETicket() {
        System.out.println("Buy one ETicket");
    };

    @Override
    public void buyMultiETickets() {
        System.out.println("Buy MultiETicket");
    }

    @Override
    public void refundOneETicket() {
        System.out.println("Refund one ETicket");
    }
    @Override
    public void refundMultiETickets() {
        System.out.println("Refund MultiETicket");
    }
}
