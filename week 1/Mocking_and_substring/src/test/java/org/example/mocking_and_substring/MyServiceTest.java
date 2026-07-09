package org.example.mocking_and_substring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    void testExternalApi() {

        // Create mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Stub method
        when(mockApi.getData()).thenReturn("Mock Data");

        // Inject mock
        MyService service = new MyService(mockApi);

        // Call method
        String result = service.getData();

        // Verify result
        assertEquals("Mock Data", result);
    }
    @Test
    void testVerifyInteraction(){
        ExternalApi mockapi=mock(ExternalApi.class);
        MyService service=new MyService(mockapi);
        service.getData();
        verify(mockapi).getData();
    }
}