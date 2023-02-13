package model;

public class Client extends Person implements CalculateTheAmount{
    public Book book;

    public Client() {
    }

    public Client(Book book) {
        this.book = book;
    }

    @Override
    public double totalmoney() {
        return 0;
    }

    @Override
    public String id() {
        return null;
    }

    @Override
    public String name() {
        return null;
    }

    @Override
    public int age() {
        return 0;
    }

    @Override
    public String phoneNumber() {
        return null;
    }
}
