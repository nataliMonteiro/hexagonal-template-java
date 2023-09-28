package com.example.event;

public interface DomainEventPublisher<T extends DomainEvent> {

    void publish(T domainEvent);
}
