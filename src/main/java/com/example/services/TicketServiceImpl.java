package com.example.services;

import com.example.entities.Ticket;
import com.example.repositories.TicketRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class TicketServiceImpl implements TicketService {

    private final TicketRepository ticketRepo;

    @Override
    public List<Ticket> findAll() {
        return ticketRepo.findAll();
    }

    @Override
    public Optional<Ticket> findById(Long id) {
        return ticketRepo.findById(id);
    }

    @Override
    public List<Ticket> findAllByPriceBetween(double min, double max) {
        return ticketRepo.findAllByPriceBetween(min, max);
    }

    @Override
    public List<Ticket> findAllByPriceLessThanEqual(double price) {
        return ticketRepo.findAllByPriceLessThanEqual(price);
    }

    @Override
    public Ticket save(Ticket ticket) {
        return ticketRepo.save(ticket);
    }

    @Override
    public void deleteById(Long id) {
        ticketRepo.deleteById(id);
    }
}
