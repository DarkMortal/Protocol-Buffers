import person.Person;
import job.Job;
import job.JobType;

public class Handler {
	public static void main(String[] args) {
		Job job = Job.newBuilder()
            .setTitle("Software Engineer")
            .setCompany("Tech Mahindra")
            .setSalary(120000)
            .setType(JobType.FULL_TIME)
            .build();

        Person person = Person.newBuilder()
            .setId(1)
            .setName("Saptarshi")
            .setEmail("dragonbeast.saiyan@gmail.com")
            .setJob(job)
            .build();
        
        byte[] data = person.toByteArray();

        try {
            Person p2 = Person.parseFrom(data);
            System.out.println(p2);
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}

/*Output

id: 1
name: "Saptarshi"
email: "dragonbeast.saiyan@gmail.com"
job {
  title: "Software Engineer"
  company: "Tech Mahindra"
  salary: 120000
  type: FULL_TIME
}

 */
