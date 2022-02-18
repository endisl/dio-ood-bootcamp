import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Course course1 = new Course("Advanced Java", "Java from hero to legend", 10);

        Course course2 = new Course("Master Spring Framework", "All you need to know to become an expert with Spring", 8);

        Mentoring mentoring1 = new Mentoring("Microservices with Kafka", "Kafka demystified in Microservices Architeture", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Java Developer Bootcamp");
        bootcamp.setDescription("Bootcamp for Experts");
        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(course2);
        bootcamp.getContents().add(mentoring1);

        Developer endi = new Developer();
        endi.setName("Endi L.");
        endi.register(bootcamp);
        System.out.println("Registered contents for Endi: " + endi.getRegisteredContents());
        endi.progress();
        endi.progress();
        endi.progress();
        System.out.println("Registered contents for Endi: " + endi.getRegisteredContents());
        System.out.println("Completed contents for Endi: " + endi.getCompletedContents());
        System.out.println("Total XP: " + endi.computeTotalXP());

        System.out.println("-----");

        Developer jane = new Developer();
        jane.setName("Jane D.");
        jane.register(bootcamp);
        System.out.println("Registered contents for Jane: " + jane.getRegisteredContents());
        jane.progress();
        jane.progress();
        System.out.println("Registered contents for Jane: " + jane.getRegisteredContents());
        System.out.println("Completed contents for Jane: " + jane.getCompletedContents());
        System.out.println("Total XP: " + jane.computeTotalXP());

        //Output
        /*
        Registered contents for Endi: [Course{title='Advanced Java', description='Java from hero to legend', hoursDuration=10}, Course{title='Master Spring Framework', description='All you need to know to become an expert with Spring', hoursDuration=8}, Mentoring{title='Microservices with Kafka', description='Kafka demystified in Microservices Architeture', date=2022-02-17}]
        Registered contents for Endi: []
        Completed contents for Endi: [Course{title='Advanced Java', description='Java from hero to legend', hoursDuration=10}, Course{title='Master Spring Framework', description='All you need to know to become an expert with Spring', hoursDuration=8}, Mentoring{title='Microservices with Kafka', description='Kafka demystified in Microservices Architeture', date=2022-02-17}]
        Total XP: 215.0
        -----
        Registered contents for Jane: [Course{title='Advanced Java', description='Java from hero to legend', hoursDuration=10}, Course{title='Master Spring Framework', description='All you need to know to become an expert with Spring', hoursDuration=8}, Mentoring{title='Microservices with Kafka', description='Kafka demystified in Microservices Architeture', date=2022-02-17}]
        Registered contents for Jane: [Mentoring{title='Microservices with Kafka', description='Kafka demystified in Microservices Architeture', date=2022-02-17}]
        Completed contents for Jane: [Course{title='Advanced Java', description='Java from hero to legend', hoursDuration=10}, Course{title='Master Spring Framework', description='All you need to know to become an expert with Spring', hoursDuration=8}]
        Total XP: 180.0
        */
    }
}
