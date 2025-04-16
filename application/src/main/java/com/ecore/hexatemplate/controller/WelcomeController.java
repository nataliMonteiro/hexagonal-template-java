package com.ecore.hexatemplate.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Tag(name = "1. Template Welcome API", description = "A simple example API endpoint provided with the template.")
@RestController
@RequestMapping(value = "/api/welcome", produces = MediaType.APPLICATION_JSON_VALUE)
public class WelcomeController {

    @Schema(description = "Standard response containing a message")
    public record MessageResponse(
            @Schema(description = "The content of the message", example = "Welcome!") String message
    ) {}

    @Operation(
            summary = "Get Welcome Message",
            description = "Returns a simple JSON object containing a welcome message."
    )
    @ApiResponse(
            responseCode = "200",
            description = "Successful retrieval of welcome message",
            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                    schema = @Schema(implementation = MessageResponse.class))
    )

    @GetMapping("/message")
    public ResponseEntity<MessageResponse> getWelcomeMessage() {
        String messageText = "Welcome to your Hexagonal Architecture Template!";
        MessageResponse response = new MessageResponse(messageText);

        return ResponseEntity.ok(response);
    }
}