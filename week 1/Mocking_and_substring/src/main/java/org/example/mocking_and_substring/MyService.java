package org.example.mocking_and_substring;

public class MyService {
    private ExternalApi api;
    public MyService(ExternalApi api){
        this.api=api;
    }
    public String getData(){
        return api.getData();
    }
}
