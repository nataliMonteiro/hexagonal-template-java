package com.example.template.template.event;

public interface DomainEventPublisher<T extends DomainEvent> {

    void publish(T domainEvent);
}
