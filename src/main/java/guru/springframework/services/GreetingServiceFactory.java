package guru.springframework.services;

public class GreetingServiceFactory {
    GreetingRepository repository;

    public GreetingServiceFactory(GreetingRepository repository) {
        this.repository = repository;
    }

    public GreetingService createGreetingService(String lang) {
        switch(lang) {
            case "en":
                return new PrimaryGreetingService(repository);
            case"de":
                return new PrimaryGermanGreetingService(repository);
            default:
                return new PrimaryGreetingService(repository);


        }
    }
}
