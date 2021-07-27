package DesignPatterns.Services;

public abstract class ServiceFactory {
    public abstract BBAService createService(String item);
    
    public BBAService orderService(String type){
        BBAService services = createService(type);

        System.out.println("**************************\n");
        services.prepare();
        System.out.println("**************************\nCreating invoice...");

        services.calculating();
        services.submitting();
        services.emailing();

        return services;
    }
}
