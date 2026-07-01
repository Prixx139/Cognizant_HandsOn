package com.cognizant.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class PaymentServiceTest {

    @Test
    public void testSuccessfulPayment() {

        // Arrange
        PaymentGateway gateway = mock(PaymentGateway.class);
        when(gateway.processPayment(1000)).thenReturn(true);

        PaymentService service = new PaymentService(gateway);

        // Act
        String result = service.makePayment(1000);

        // Assert
        assertEquals("Payment Successful", result);
    }

    @Test
    public void testPaymentVerification() {

        // Arrange
        PaymentGateway gateway = mock(PaymentGateway.class);
        when(gateway.processPayment(500)).thenReturn(true);

        PaymentService service = new PaymentService(gateway);

        // Act
        service.makePayment(500);

        // Verify interaction
        verify(gateway).processPayment(500);
    }
}
