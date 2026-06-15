package com.sb.SpringBootJune2026.junitTut.controller;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import com.sb.SpringBootJune2026.junitTut.service.CalculatorService;
import org.junit.jupiter.api.Test;

public class CalculatorControllerTest {

    @Test
    void testGetSum() {

        // Create Mock Object
        CalculatorService mockService = mock(CalculatorService.class);

        // Define Mock Behavior
        when(mockService.add(10, 20)).thenReturn(30);

        // Inject Mock
        CalculatorController controller = new CalculatorController(mockService);

        // Call Method
        int result = controller.getSum(10, 20);

        // Verify Result
        assertEquals(30, result);

        // Verify Method Invocation
        verify(mockService).add(10, 20);
    }

}